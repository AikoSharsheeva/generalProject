package generalProject;

public class InstanceMethod5 {
    public static void main(String[] args) {

        System.out.println(hello());

        tax();

        InstanceMethod5 obj=new InstanceMethod5();
        obj.word();

        String var=obj.book();
        System.out.println(var);//Когда ключевое слово return надо объявлять отдельно переменную и его принтовать при этом это не статик.

        String var1= obj.movie("Twilight ", 100);
        System.out.println(var1);


        System.out.println(isPositive(10));

        System.out.println(concatString("Java", "Programming"));


    }
    public static int hello(){
        return 10*5 ;
    }
    public static void tax(){
        System.out.println(5*5);
    }
    public void word(){
        System.out.println("Examination");
    }
    public String book(){
        return "Harry Potter";
    }
    public String movie(String str, int num){
        return str+ num;
    }
    public static boolean isPositive(int num){
        if(num>0) {
            return true;
        }else {
            return false;
        }

        }
    public static String concatString(String strCon, String strCon2) {
        return strCon.concat(strCon2);
    }
    }

