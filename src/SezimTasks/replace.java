package SezimTasks;

public class replace {
    public static void main(String[] args) {
        System.out.println(replaceLikeWithLove("I like to code like a boss"));

    }

    public static String  replaceLikeWithLove(String str){
        String r= str.replace("like", "love");
        return r;
    }
}
