package SezimTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
done: Create a class called  Ferrari458 .

done: Create an instance method startEngine() that prints out a message saying "Starting the Ferrari 458 Speciale engine!".

Create a main method that creates a Main object, and then calls the startEngine() method.
Expected Output:
Starting the Ferrari 458 Speciale engine!
 */
public class Ferrari458 {



    public static void main(String[] args) {
        Ferrari458 obj = new Ferrari458();
        obj.startEngine();




    }
    public void startEngine(){
        System.out.println("Starting the Ferrari 458 Speciale engine!");
    }
}
