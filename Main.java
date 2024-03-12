import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        String answer = calc(input);
        System.out.println("Output:");
        System.out.print(answer);

    }

    public static String calc(String input) {
        int result = 0;


        String error = "Throws Exception";
        String[] inputSplit = input.split(" ");
        if (inputSplit.length != 3) {
            return error;
        }
        Integer a = 0;
        Integer b = 0;
        try {
            a = parseInt(inputSplit[0]);
            b = parseInt(inputSplit[2]);
        } catch (NumberFormatException e) {
            try {
                a = romaToArab(inputSplit[0]);
                b = romaToArab(inputSplit[2]);
            } catch (NumberFormatException ex) {
                return error;
            }

            String sign = inputSplit[1];
            if ((a < 1) || (a > 10) || (b < 1) || (b > 10)) {
                return error;
            }
            switch (sign) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                default -> {
                    return error;
                }
            }
        }
        String output = Integer.toString(result);
        return output;
    }


     static int romaToArab(String romaNumber) {
        int result = 0;
        int index = 0;
        int[] arab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] roma = {"X", "IX", "VIII", "VII", "VI", "V", "IV",  "III", "II", "I"};
        for (int i = 0; i < roma.length; i++) {
            if (roma[i].equals(romaNumber)) {
                index = i;

            }

        }
        result = arab[index];

        return result;
    }
}












