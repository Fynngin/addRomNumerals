package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String num1;
        String num2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter first Roman numeral: ");
            num1 = br.readLine();
            System.out.print("Enter second Roman numeral: ");
            num2 = br.readLine();

            String rom = addRom(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + rom);
        } catch (IOException e) {
            System.out.println("Invalid input.");
        }

    }

    public static String addRom(String num1, String num2) {
        return num1+num2;
    }
}
