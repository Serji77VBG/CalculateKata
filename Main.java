import java.util.Scanner;

import static java.lang.Integer.parseInt;

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
        }catch(NumberFormatException e){
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
        String output = Integer.toString(result);

        return output;


    }
}








