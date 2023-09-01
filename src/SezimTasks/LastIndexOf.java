package SezimTasks;

public class LastIndexOf {
    public static void main(String[] args) {
        System.out.println(findLastIndexOfProgramming("programming is the best way of thinking and creating.")); //0
        System.out.println(findLastIndexOfProgramming("I love programming, it's my passion! Let's learn programming together")); //49
        System.out.println(findLastIndexOfProgramming("This sentence does not contain the word") ); //-1
    }
    public static int findLastIndexOfProgramming(String str) {


        int num=str.lastIndexOf("programming");
        return num;
    }
}


/*
Код int num = str.lastIndexOf("programming");
выполняет поиск последнего вхождения подстроки "programming" в строке str
и сохраняет индекс этого последнего вхождения в переменной num.

Метод indexOf в Java используется для поиска первого вхождения указанной подстроки в строке.
Он возвращает индекс (позицию) первого символа найденной подстроки в строке или -1, если подстрока не была найдена.*/