package dasturlash.uz.controller;

import dasturlash.uz.container.ComponentContainer;
import dasturlash.uz.util.ScannerUtil;

import java.util.Scanner;

public class StaffController {
    private BookController bookController;
    private StudentProfileController studentProfileController;

    public void setBookController(BookController bookController) {
        this.bookController = bookController;
    }

    public void setStudentProfileController(StudentProfileController studentProfileController) {
        this.studentProfileController = studentProfileController;
    }

    public void start() {
        boolean loop = true;
        while (loop) {
            showMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1:
                    bookController.start();
                    break;
                case 2:
                    studentProfileController.start();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Mazgi bu hatoku.");
            }

        }

    }


    public void showMenu() {
        System.out.println("*** Menu ***");
        System.out.println("1. Book");
        System.out.println("2. Student");
        System.out.println("0. Exit");
    }

}
