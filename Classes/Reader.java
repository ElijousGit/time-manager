package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    static Calculator calculator = new Calculator();
    static String response;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi, what time is it currently?");
        response = sc.nextLine(); // Sets response as whatever the person types in. The person's input will be
                                  // saved as a String

        // This executes once response is given a value, AKA when the person presses
        // enter after typing
        if (response != null) {
            GetArrayListIntegers(calculator.ResponseToInts(response));
        } else {
            System.out.println("No input was detected");
        }

    }

    private static void GetArrayListIntegers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
