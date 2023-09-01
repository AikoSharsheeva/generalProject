package SezimTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class nestedifpractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the distance of the trip in miles: ");
        int distanceTraveled = sc.nextInt();
        System.out.println("Please enter the mode of transportation (drive/fly): ");
        sc.nextLine();
        String moveType = sc.nextLine();

        System.out.print("True or False: ");
        boolean isGirstClass = sc.nextBoolean();

        double total = 100;


        if(isGirstClass){
            total += 50;

        }

        if(distanceTraveled > 0){
            if (moveType.equals("drive")){
                total = distanceTraveled * 0.50;
                System.out.println("The cost of the trip is " + total);
            } else if(moveType.equals("fly")) {
                total = 100;
                System.out.println("The cost of the trip is " + total);
            } else {
                System.out.println("Invalid mode of transportation!");
            }

        } else {
            System.out.println("Invalid distance value, please enter a positive value.");
        }



    }

}
