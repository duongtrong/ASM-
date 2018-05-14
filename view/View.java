/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import mystudents.MyStudents;

/**
 *
 * @author VI-VU
 */
public class View {

    public static void main(String[] args) throws IOException {
        ArrayList<MyStudents> studentList = new ArrayList<>();
        Controller ctrl = new Controller();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====== Student Manager ======");
            System.out.println("1. Add new student.");
            System.out.println("2. Save.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit.");
            System.out.println("=============================");
            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ctrl.addNewStudent();
                    break;
                case 2:
                    ctrl.saveStudent();
                    break;
                case 3:
                    ctrl.displayStudent();
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }
}

