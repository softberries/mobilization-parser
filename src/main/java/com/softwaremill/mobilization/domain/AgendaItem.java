package com.softwaremill.mobilization.domain;


public class AgendaItem {
    private String id;
    private String title;
    private String description;
    private String begin_date;
    private String end_date;
    private String venue;
    private String language_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(String language_id) {
        this.language_id = language_id;
    }

    @Override
    public String toString() {
        return "AgendaItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", begin_date='" + begin_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", venue='" + venue + '\'' +
                ", language_id='" + language_id + '\'' +
                '}';
    }
}
