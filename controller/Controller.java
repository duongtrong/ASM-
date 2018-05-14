/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import mystudents.MyStudents;

/**
 *
 * @author VI-VU
 */
public class Controller {

    ArrayList<MyStudents> studentList = new ArrayList<>();
    MyStudents student = new MyStudents();
    Scanner sc = new Scanner(System.in);

    public MyStudents addNewStudent() {
        System.out.println("Please enter EnrolID: ");
        String enrolId = sc.nextLine();
        System.out.println("Please enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        return student;
    }

    public void saveStudent() throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream(".//students.dat");
    }

    public void displayStudent(){

    }
}
