package com.company.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Model {
//    private List<Record> list = new ArrayList<>();
    private String nameBook;
    private String description;
    private LocalDate localDate;
    private LocalDateTime localDateTime;



    public Model() {
    }

    public Model(String nameBook, String description, LocalDate localDate, LocalDateTime localDateTime) {
        this.nameBook = nameBook;
        this.description = description;
        this.localDate = localDate;
        this.localDateTime = localDateTime;
    }

    public Model(String nameBook, String description, LocalDateTime localDateTime, LocalDate localDate) {
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Model{" +
                "nameBook='" + nameBook + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", localDateTime=" + localDateTime +
                '}';
    }
    
}
