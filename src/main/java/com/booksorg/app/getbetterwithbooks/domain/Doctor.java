package com.booksorg.app.getbetterwithbooks.domain;

public class Doctor {
    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecalization() {
        return specalization;
    }

    public void setSpecalization(String specalization) {
        this.specalization = specalization;
    }

    String specalization;

}
