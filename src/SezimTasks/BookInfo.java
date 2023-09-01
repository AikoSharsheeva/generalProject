package SezimTasks;
/*Create a class called Main.

Create an instance method displayInfo() that prints out the book's information in three separate lines: the title, the author, and the year published.

Create a main method that creates a Main object sets its instance variables, and then calls the displayInfo() method.

Expected Output:

Title: Leonardo da Vinci
Author: Isaacson, Walter
Year published: October 17, 2017*/
public class BookInfo {
    public static void main(String[] args) {
        BookInfo o = new BookInfo();
        o.displayInfo("Leonardo da Vinci", "Isaacson, Walter", "October17, 2017");


    }

    public void displayInfo(String title, String author, String year){
        System.out.printf("Title: %s\nAuthor: %s\nYear published: %s", title, author, year);
    }

}
