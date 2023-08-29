package generalProject;

public class Methods2 {
    public static void main(String[] args) {
        sum(5,5);
        hello();
        funct1("January ", 10);
    }
    public static void sum(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    public static  void hello(){
        System.out.println("I created simple function");
    }
    public  static void funct1(String str,int num){
        System.out.println(str + num);

    }
}
