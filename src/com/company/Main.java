package com.company;


import com.company.controller.Controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Controller controller = Controller.Controller();
        while (true) {
            Menu();
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1: {
                    controller.CreateBook();
                    break;
                }
                case 2: {
                    controller.ShowAllBooks();
                    break;
                }
                case 3: {
                    controller.UpdateBook();
                    break;
                }
                case 4: {
                    controller.deleteBook();
                    break;
                }
            }
        }
    }

    static void Menu() {
        System.out.println("*****************************************");
        System.out.println("| Menu:                   |");
        System.out.println("|        1. Create Add Book  |");
        System.out.println("|        2. Read  Book       |");
        System.out.println("|        3. Update  Book     |");
        System.out.println("|        4. Delete  Book     |");
        System.out.println("|        5. Exit             |");
        System.out.println("*****************************************");
    }

//        Base base = new Base(10);
//
//        base.a = 20;
//
//        System.out.println(base.a);
//        System.out.println(base.getA());
//
//    }
//
//    static class Base {
//        int a;
//
//        public Base(int a) {
//            this.a = a;
//        }
//
//        public int getA() {
//            return a;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//    }
//
//    static class Child extends Base {
//        int a;
//
//        public Child(int a) {
//            super(a);
//            this.a = a;
//        }
//
//        @Override
//        public int getA() {
//            return a;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//    }


}
