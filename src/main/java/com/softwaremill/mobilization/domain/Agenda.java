package com.softwaremill.mobilization.domain;


public class Agenda {
    private long timestamp;
    private String status;
    private AgendaData data;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AgendaData getData() {
        return data;
    }

    public void setData(AgendaData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "timestamp=" + timestamp +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
