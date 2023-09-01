package SezimTasks;

import java.util.Scanner;

public class GroupDeternubatuib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender(male/famale): ");
        String gender = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age < 20){
            if((gender.equals("male"))){
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }
        } else if (age > 19){
            if(gender.equals("male")){
                System.out.println("Man");
            } else {
                System.out.println("Woman");
            }

        }

    }
}
