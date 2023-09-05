package Aidai;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Body Temperature:");
        double temperature = sc.nextDouble();
        if (temperature<97.7) {
            System.out.println("Drink Some Hot Tea to Warm Up");
        }
        if (temperature>99.5) {
            System.out.println("Take Tylenol to Bring Your Temperature Down");
        }
    }
}
