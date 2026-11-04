package studentinformationsystem;
/*******************************************************************************
* Author: Iman Thaqif Bin Mohd Komarul Aripin
* Program Name: WhoAmI.java
* Description: To demonstrate a simple Java Program using Apache Netbean
* Date: 27 October 2026
* Modified Date: None
* Version: 1.0
*******************************************************************************/
public class StudentInformationSystem {

    public static void main(String[] args) {

        // Student information
        String name = "Iman Thaqif";
        String studentID = "S88847";

        // Store two marks
        int mark1 = 85;
        int mark2 = 90;

        // Calculate total
        int total = mark1 + mark2;

        // Display information
        System.out.println("Student Information System");
        System.out.println("--------------------------");

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Programme: Bachelor of Computer Science");

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);

        System.out.println("Total Marks: " + total);

        // Display result
        if (total >= 160) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }

    }
}