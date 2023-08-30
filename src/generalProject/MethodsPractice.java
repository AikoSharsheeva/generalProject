package generalProject;

public class MethodsPractice {
    public static void main(String[] args) {

        MethodsPractice aiko=new MethodsPractice();
        char letter=aiko.compareInt(5,2,3);
        System.out.println(letter);

        String domain= String.valueOf(aiko.checkDomain("ElonMusk@mail.com"));
        System.out.println(domain);

    }
    public char compareInt(int num, int num2, int num3){
        if(num+num2>num3){
            return 'A';
        }else if(num3>num+num2){
            return 'B';
        }else{
            System.out.println("Invalid");
            return '0';
        }

    }
    public static boolean checkDomain(String email){
        boolean checkEmail=email.contains("@gmail");
        return checkEmail;
    }
}
