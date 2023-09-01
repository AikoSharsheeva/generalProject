package generalProject;

public class WhileWithChar13 {
    public static void main(String[] args) {
        String str = "mercury";
        int count = 0;
        while (count <= str.length() - 1) {
            System.out.println(str.charAt(count));
            count++;
        }
        System.out.println("=========");
        String str1="venus";
        int count1=0;
        while(count1<=str1.length()-1){
            System.out.println(str1.charAt(count1));
            count1++;
        }
        System.out.println("***************");
        String mars="Mars";
        int marsCount=0;
        while(marsCount<=mars.length()-1){
            System.out.println(mars.charAt(marsCount));
            marsCount++;
        }
        System.out.println("~~~~~~~~~~~~~~");
        String jupStr="Jupiter";
        int num=0;
        while(num<=jupStr.length()-1){
            System.out.println(jupStr.charAt(num));
            num++;
        }
    }
}
