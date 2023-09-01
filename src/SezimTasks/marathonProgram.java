package SezimTasks;

import java.util.Scanner;

public class marathonProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fitness level: (high/medium/low): ");
        String fitness = sc.nextLine();
        System.out.println("Enter your health status: (good/bad)");
        String health = sc.nextLine();

        if(health.equals("good")){
            if (fitness.equals("high")){
                System.out.println(" We recommend you to prepare for a full marathon");
            } else if (fitness.equals("medium")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if(fitness.equals("low")) {
                System.out.println("We recommend you to prepare for a 5k run");
            } else {
                System.out.println("Wrong entry for fitness level");
            }
        } else if(health.equals("bad")) {
            System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
        } else {
            System.out.println("Wrong entry for health status");
        }
    }
}