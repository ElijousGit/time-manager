package Classes;

import java.util.ArrayList;

public class Calculator {
    String response;
    ArrayList<Integer> iResponse = new ArrayList<Integer>(); // iResponse, or integer response, is used to organize each
                                                             // int in response (chronological)

    // Calculator constructor
    public Calculator(String response) {
        this.response = response;
    }

    public ArrayList<Integer> StringToArray(String response) {

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

    public int ArrayToInt() {
        ArrayList<Integer> a = StringToArray(this.response);
        int minutes = 0;

        for (int i = 0; i < a.size(); i++) {
            switch (i) {
                case 0:
                    minutes += (a.get(i)) * 600;
                    break;

                case 1:
                    minutes += (a.get(i)) * 60;
                    break;

                case 2:
                    minutes += (a.get(i)) * 10;
                    break;

                case 3:
                    minutes += (a.get(i)) * 1;
                    break;
            }
        }

        return minutes;
    }

    public static void main(String[] args) {
    }

}
