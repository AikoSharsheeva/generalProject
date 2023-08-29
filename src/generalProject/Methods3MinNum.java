package generalProject;

public class Methods3MinNum {
    public static void main(String[] args) {

        System.out.println("The smallest number is: " + smallestNum (25, 37, 29));
        System.out.println("Average number is: " + average(45,30,15));
    }

    public static int smallestNum(int num, int num2, int num3) {
       return Math.min(Math.min(num, num2), num3);

    }
    public  static int average(int num4, int num5, int num6){
        return (num4+num5+num6)/3;
    }

}
