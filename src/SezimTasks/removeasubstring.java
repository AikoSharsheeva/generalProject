package SezimTasks;

public class removeasubstring {
    public static void main(String[] args) {
        System.out.println(removeSubstring("oscar world", "o"));
        System.out.println(removeSubstring("this is a test", "is"));
        System.out.println(removeSubstring("banana", "a"));
        System.out.println(removeSubstring("mississippi", "ssi"));
        System.out.println(removeSubstring("hello", "z"));
    }

    /*StringBuilder - это класс в Java, предназначенный для работы с изменяемыми строками.
    Он обеспечивает более эффективную работу с динамическими операциями над строками, такими как добавление,
    удаление и изменение символов, по сравнению с обычными строками (класс String), которые неизменяемы.

    После создания объекта StringBuilder, вы можете выполнять различные операции с ним,
    такие как добавление или удаление символов, и изменение содержимого строки внутри StringBuilder.
    Этот класс полезен, когда вам нужно многократно изменять содержимое строки,
    так как он позволяет делать это без создания новых строк каждый раз,
    что может быть неэффективным с точки зрения производительности при работе с большими объемами данных.
        */
    public static String removeSubstring(String s, String w){
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(w);
        while (index != -1) {
            sb.delete(index, index + w.length());
            index = sb.indexOf(w);
        }
        return sb.toString();

    }


}


/*
Write a static method called removeSubstring()
takes a string and a substring to be removed as input from the user,
removes all occurrences of the given substring from the string, and returns the modified string.

Params:
2 Strings, 1st one for the sentence, 2nd one for the substring.

Return
a modified String


For example:

removeSubstring("oscar world", "o"); // Expected output: "scar wrld"
removeSubstring("this is a test", "is"); // Expected output: "th a test"
removeSubstring("banana", "a"); // Expected output: "bnn"
removeSubstring("mississippi", "ssi"); // Expected output: "mippi"
removeSubstring("hello", "z"); // Expected output: "hello"*/