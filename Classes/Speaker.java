package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Speaker {
    static ArrayList<String> responses = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);
    static int minutes;

    public static void main(String[] args) {

        System.out.println("Hi, what time is it currently?");
        responses.add(0, sc.nextLine()); // Sets response as whatever the person types in. The person's input will be
        // saved as a String inside an Arraylist.

        // This executes once response is given a value, AKA when the person presses
        // enter after typing
        if (responses.get(0) != "") {
            Calculator calculator = new Calculator(responses.get(0));
            calculator.ReturnMinutes();

            // The program then asks whether it is AM or PM (This applies to the time system
            // in NA)
            System.out.println("AM or PM?");
            responses.add(1, sc.nextLine());
            if (responses.get(1) != "") {
                Calculator calculator1 = new Calculator(responses.get(1));
                calculator1.AMorPm();
                minutes = calculator1.minutes + calculator.minutes;
                System.out.println(minutes);
            }
        } else {
            System.out.println("No input was detected");
        }

    }
}
