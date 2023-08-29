package generalProject;

public class Methods4UserDefinid {
    public static void main(String[] args) {
        Methods4UserDefinid hello=new Methods4UserDefinid();
        String str= hello.greeting();
        System.out.println(str);

        char letter=hello.getgrade();
        System.out.println(letter);

        String Iphone= hello.phone();
        System.out.println(Iphone);

        hello.name("Elon");
    }

    public String greeting() {
        return "Everything will be good";
    }
    public char getgrade(){
        return 'A';
    }
    public String phone(){
        String str1 = "Iphone 12 ";
        String str2 = "Iphone 13 ";
        String str3 = "Iphone 14";
        return str1+ str2+str3;
    }

    public void name(String strName){

        System.out.println("Lets go " + strName);
    }

}
