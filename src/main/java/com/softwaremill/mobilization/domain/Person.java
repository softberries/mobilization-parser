package com.softwaremill.mobilization.domain;


import java.util.List;

public class Person {
    private String id;
    private String full_name;
    private String job_title;
    private String organization;
    private String description;
    private String website_url;
    private String picture_url;
    private List<AgendaItem> agenda_items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public List<AgendaItem> getAgenda_items() {
        return agenda_items;
    }

    public void setAgenda_items(List<AgendaItem> agenda_items) {
        this.agenda_items = agenda_items;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", organization='" + organization + '\'' +
                ", description='" + description + '\'' +
                ", website_url='" + website_url + '\'' +
                ", picture_url='" + picture_url + '\'' +
                ", agenda_items=" + agenda_items +
                '}';
    }
}
