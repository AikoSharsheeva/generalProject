package Aidai;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = sc.nextInt();
        if (num>18) {
            System.out.println("Adult");
        } else {
            System.out.println("you are not adult");
        }
    }
}
