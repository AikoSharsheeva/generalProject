package SezimTasks;
//isChicagoPhoneNum("312-555-1234"); //true
//isChicagoPhoneNum("773-555-5678"); //true
//isChicagoPhoneNum("630-555-9090"); //false


public class CheckPhoneNumber {
    public static void main(String[] args) {
        System.out.println(isChicagoPhoneNum("312-555-1234"));
        System.out.println(isChicagoPhoneNum("773-555-5678"));
        System.out.println(isChicagoPhoneNum("630-555-9090"));
    }

    public static boolean  isChicagoPhoneNum(String phoneNum) {

        if(phoneNum.startsWith("312") || phoneNum.startsWith("773")){
            return true;
        }
        else{
            return false;
        }
    }
}
