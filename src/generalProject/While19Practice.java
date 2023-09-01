package generalProject;

public class While19Practice {
    public static void main(String[] args) {
        byChar("aiko");
        withchar("Youtube");

        for(int num3=0; num3<=20; num3+=2){
            if(num3==14){
                break;
            }
            System.out.println("Operation must stop in 14");
        }

    }
    public static void byChar (String str){
        int num=0;
        while(num<=str.length()-1){
            char c=str.charAt(num);
            System.out.println(c);
            num++;
        }

    }
    public static void withchar(String str1){
        int num2=0;
        while(num2<str1.length()){
            char ca=str1.charAt(num2);
            num2++;
            System.out.printf("%c-", ca);
        }
    }
}
