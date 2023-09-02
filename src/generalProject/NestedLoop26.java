package generalProject;

public class NestedLoop26 {
    public static void main(String[] args) {
    patternTringle(3);
    }
    public static void patternTringle(int num){
        for(int i=num; i>=1; i--){
            for(int s=i; s>=1; s--){
                System.out.print( s + "");
            }
            System.out.println();
        }
    }
}
