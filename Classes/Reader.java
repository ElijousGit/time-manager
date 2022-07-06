package Classes;

import java.util.Scanner;

public class Reader {
    static Calculator calculator = new Calculator();
    static String response;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi, what time is it currently?");
        response = sc.nextLine();
        // System.out.println("It is currently " + calculator.ResponseToInts(response));
        if (response != null) {
            calculator.ResponseToInts(response);
        } else {
            System.out.println("No input was detected");
        }

    }

}
