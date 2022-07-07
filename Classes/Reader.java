package Classes;

import java.util.Scanner;

public class Reader {
    static String response;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hi, what time is it currently?");
        response = sc.nextLine(); // Sets response as whatever the person types in. The person's input will be
                                  // saved as a String

        // This executes once response is given a value, AKA when the person presses
        // enter after typing
        if (response != null) {
            Calculator calculator = new Calculator(response);
            System.out.println(calculator.ArrayToInt());
        } else {
            System.out.println("No input was detected");
        }

    }
}
