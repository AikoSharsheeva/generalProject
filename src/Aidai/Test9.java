package Aidai;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как ваше здоровье? good or bad");
        String health = sc.nextLine();
        if (health.equals("good")) {
            System.out.println("введите вашу физ подготовку high medium low");
           String fitnessStatus = sc.nextLine();
           if (fitnessStatus.equals("high")) {
               System.out.println("ты можешь пробежать целый марафон");
           } else if (fitnessStatus.equals("medium")) {
               System.out.println("ты можешь пробежать половину марафона");
           } else if (fitnessStatus.equals("low")) {
               System.out.println("ты можешь пробежать 5 км");
           } else {
               System.out.println("неправильный ввод");
           }
        }
         else if (health.equals("bad")) {
            System.out.println("вы можете пройтись");
        } else {
            System.out.println("введите ваш статус");
        }
    }
}
