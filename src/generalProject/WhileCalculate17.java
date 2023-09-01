package generalProject;

public class WhileCalculate17 {
    public static void main(String args[]) {

        int count=0;
        int evenNum=2;
        int sum=0;
        while(count<=9){


            sum+=evenNum;
            evenNum+=2;
            count++;
            System.out.println("Sum so far: " +sum);
        }
        System.out.println("Sum of first 10 even numbers: " +110);
    }
}
