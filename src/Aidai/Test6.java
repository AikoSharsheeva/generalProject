package Aidai;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your user type?");
        String users = sc.nextLine();
        if(users.equals("admin")) {
            System.out.println("Access to all features and functionalities of the platform");
            System.out.println("Ability to create and manage user accounts");
            System.out.println("Ability to view and analyze user data");
            System.out.println("Ability to adjust platform settings and configurations");
            System.out.println("Ability to generate reports and export data");
        } else if (users.equals("mentor")) {
            System.out.println("Ability to view and manage the progress of assigned mentees");
            System.out.println("Access to resources and tools for guiding and supporting mentees");
            System.out.println("Ability to communicate with mentees through the platform");
            System.out.println("Ability to track and analyze mentee progress and performance");
        } else if (users.equals("free trial users")) {
            System.out.println("Limited access to certain features and functionalities of the platform");
            System.out.println("Ability to explore and experiment with the platform's basic features");
            System.out.println("Access to limited support and resources");
            System.out.println("Opportunity to evaluate the platform before committing to a paid subscription");
        } else if (users.equals("paid users")) {
            System.out.println("Full access to all features and functionalities of the platform");
            System.out.println("Access to premium support and resources");
            System.out.println("Ability to customize and personalize their experience on the platform");
            System.out.println("Access to advanced tools and features for optimizing performance and productivity");
            System.out.println("Ability to collaborate and communicate with other users on the platform");

        }


    }
}
