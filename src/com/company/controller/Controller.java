package com.company.controller;

import com.company.model.Model;
import com.company.view.View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    //
//    public Controller(Model model, View view) {
//        this.model = model;
//        this.view = view;
//    }
    private static Controller c;
    private static ArrayList<Model> list = new ArrayList<>();

    static public Controller Controller() {
        if (c == null) {
            c = new Controller();
        }
        return c;
    }


    public void CreateBook() {
        List<String> list = new ArrayList<String>();
        Model model = new Model();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Option  1: Crate Book");

        String nameBook;
        System.out.println("Enter name Book");
        nameBook = scanner.next();

        String description;
        System.out.println("Enter Book description");
        description = scanner.next();

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();

        list.add(nameBook);
        list.add(description);
        list.add(String.valueOf(localDate));
        list.add(String.valueOf(localDateTime));
        System.out.println(list);

    }


    public void ShowAllBooks() {
        System.out.println("Select Option  2:  Show All Book");
//        for (String s:list){
//            System.out.println(s);
//        }
    }


    public void UpdateBook() {
        Scanner bookUpdate = new Scanner(System.in);
        System.out.println("Select Option  3:  Book Update");

        String nameBook_id;
        System.out.println("Enter number Name Book ID book");
        nameBook_id = bookUpdate.next();

//
        String nameBook;
        System.out.println("Enter name Book");
        nameBook = bookUpdate.next();

        String description;
        System.out.println("Enter Book description");
        description = bookUpdate.next();

        LocalDateTime localDateTime;

    }

    public void deleteBook() {
        System.out.println("Select Option  4:  Book Delete");
    }
}

