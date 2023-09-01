package generalProject;

import java.util.Scanner;

public class BooleanWhile18 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);// этот метод будет работать и показывать сообщение пока условие будет правдивым

        while(true){

            System.out.println("I'm building my bright future with WeDevX");
            System.out.println("Do you want to see this message again? (true/false)");

            boolean answer=sc.nextBoolean();

            if (!answer) {
                break;
            }
        }
    }
}
