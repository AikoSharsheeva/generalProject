package generalProject;

import java.util.Scanner;

public class ForLoop21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many oranges do you have?");
        int orange=sc.nextInt();
        for(int i=1; i<=orange; i++){
            System.out.println("i have: " + i + " oranges");
        }
    }
}
