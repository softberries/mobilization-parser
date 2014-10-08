package com.softwaremill.mobilization;

import com.google.gson.Gson;
import com.softwaremill.mobilization.domain.Agenda;
import com.softwaremill.mobilization.domain.AgendaData;
import com.softwaremill.mobilization.domain.AgendaItem;
import com.softwaremill.mobilization.domain.Person;
import org.apache.commons.lang.StringEscapeUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        final String json = readUrl("http://organizuj.to/api/events/rwagkpzyqboffbt/agenda_people.json");
        Gson gson = new Gson();
        Agenda agenda = gson.fromJson(json, Agenda.class);
        //strip html tags and save that as new Agenda
        Agenda newAgenda = getCleanedAgenda(agenda);
        //parse newAgenda back to json
        String cleanJson = gson.toJson(newAgenda);
        //save to file
        saveToFile("mobilization.json", cleanJson);
    }

    private static void saveToFile(final String fileName, final String text) {
        try (PrintStream out = new PrintStream(new FileOutputStream(fileName))) {
            out.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Agenda getCleanedAgenda(final Agenda agenda) throws UnsupportedEncodingException {
        Agenda na = new Agenda();
        na.setStatus("processed and cleaned");
        na.setTimestamp(agenda.getTimestamp());
        AgendaData ad = new AgendaData();
        List<Person> oldPeople = agenda.getData().getAgenda_people();
        for (Person p : oldPeople) {
            p.setDescription(cleanStr(p.getDescription()));
        }
        ad.setAgenda_people(oldPeople);
        na.setData(ad);
        return na;
    }

    private static String cleanStr(final String old) throws UnsupportedEncodingException {
        String noHtmlTags = old.replaceAll("\\<.*?\\>", "");
        String noEntities =  StringEscapeUtils.unescapeHtml(noHtmlTags);
        return noEntities;
    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
