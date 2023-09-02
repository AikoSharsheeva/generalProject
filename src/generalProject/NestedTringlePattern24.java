package generalProject;

public class NestedTringlePattern24 {                        //ряд space space=5-i; *j=2*i-1         *
    public static void main(String[] args) {                   //i | S | *                          ***
        for(int i=1; i<5; i++) {                                //1 | 4 | 1                         ****
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
                System.out.println();                              //2 | 3 | 3                         *****
                                                                  //3 | 2 | 5                        *******
        }                                                    //4 | 1 | 7                        *********
    }                                                          //5 | 0 | 9
}
