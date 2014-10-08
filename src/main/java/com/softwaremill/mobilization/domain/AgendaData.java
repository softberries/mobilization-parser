package com.softwaremill.mobilization.domain;


import java.util.List;

public class AgendaData {
    private List<Person> agenda_people;

    public List<Person> getAgenda_people() {
        return agenda_people;
    }

    public void setAgenda_people(List<Person> agenda_people) {
        this.agenda_people = agenda_people;
    }

    @Override
    public String toString() {
        return "AgendaData{" +
                "agenda_people=" + agenda_people +
                '}';
    }
}
