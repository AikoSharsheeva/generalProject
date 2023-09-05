package Aidai;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your eye color blue or brown");
        String eye = sc.nextLine();
        System.out.println("enter hair color: blonde or brown");
        String hair = sc.nextLine();
        if (eye.equals("blue") && hair.equals("blonde")) {
            System.out.println("we suggest a natural makeup look");
        } else if (eye.equals("brown") && hair.equals("brown")) {
            System.out.println("we suggest smokey eye look");
        } else {
            System.out.println("sorry we couldn't identify your eye color or hair color");
        }
    }
}
