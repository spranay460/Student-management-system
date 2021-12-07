package com.pranaybuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	//ask how many students you want to add
        System.out.print("Enter the no of student to enrll: ");
        Scanner in = new Scanner(System.in);
        int noOfStudents = in.nextInt();
        Student[] students = new Student[noOfStudents];

    //Create n number of new students
        for(int n=0;n < noOfStudents;n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();


        }
        for(int n=0;n < noOfStudents;n++){

            System.out.println(students[n].showInfo());

        }
    }
}
