package Classes;

public class Calculator {
    Reader reader = new Reader(); // New reader class
    String response = Reader.response; // instantiates response from Reader class to use in this class
    static String cResponse;
    int iResponse;

    public /* int */void ResponseToInts(String response) {
        cResponse = "" + response.charAt(1);
        System.out.println("hi");

        for (int i = 1; i == response.length(); i++) {

            /*
             * try {
             * iResponse = Integer.parseInt(cResponse);
             * } catch (Exception e) {
             * System.out.println("Woops, that's not a time! Try again. " + e);
             * }
             */}
        // return iResponse;

    }

    public static void main(String[] args) {
    }

}
