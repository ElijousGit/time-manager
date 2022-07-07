package Classes;

import java.util.ArrayList;

public class Calculator {
    Reader reader = new Reader();
    String response = Reader.response; // instantiates response from Reader class to use in this class
    ArrayList<Integer> iResponse = new ArrayList<Integer>(); // iResponse, or integer response, is used to organize each
                                                             // int in response (chronological).

    public ArrayList<Integer> ResponseToInts(String response) {

        for (int i = 0; i < response.length(); i++) {

            try {
                iResponse.add(Integer.parseInt("" + response.charAt(i)));
            } catch (Exception e) {
                System.out.println("Woops, this character isn't a number: " + e);
                // This will probably be changed to say or do something else
            }

        }
        return iResponse;

    }

    public static void main(String[] args) {
    }

}
