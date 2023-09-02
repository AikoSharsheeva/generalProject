package generalProject;

public class NestedReverseTringle25 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){// Almost same code just first for loop we need to change
            for(int s=1; s<=5-i; s++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
