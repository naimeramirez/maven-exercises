package mavenexercises;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Something");
        String userInput = sc.next();

        System.out.println("you entered: " + userInput);

        boolean isNumeric = StringUtils.isNumeric(userInput);
        System.out.println("Is Numeric: " + isNumeric);

        String swapCase = StringUtils.swapCase(userInput);
        System.out.println("Swap case: " + swapCase);

        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reverse String: " + reverseString);

    }
}
