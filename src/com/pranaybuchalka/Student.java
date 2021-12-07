package com.pranaybuchalka;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 14000;
    private static int id =4000;

    //constructor: prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student middle name: ");
        this.middleName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - firstyear\n2 -secondyear\n3 - thirdyear\n4 - fourthyear\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();



    }

    //generate an id
    private void setStudentId(){
        //Grad Level + id
        id++;
        this.studentId = gradeYear+""+id;
    }

    //enroll in courses
    public void enroll(){
        //get inside a loop until user types S
        do {
            System.out.print("Enter course to enroll ('S' to stop): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("S")) {
                courses = courses + "\n " + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (2 !=3);



    }

    //view balance
    public void viewBalance(){
        System.out.println("your balance is : Rs"+tutionBalance);
    }
    //pay tutionfee
    public  void payTution(){
        viewBalance();
        System.out.print("Enter your payment: Rs");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payent of Rs"+payment);
        viewBalance();
    }
    //show Information
    public String showInfo(){
        return "Name: " + firstName +" "+ middleName+" "+lastName +
                "\nGrade level: "+gradeYear+
                "\nStudent Id: "+studentId+
                "\nCourses Enrolled:" + courses +
                "\nBalance: Rs" +tutionBalance;
    }
}
