package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList numbers = new ArrayList(); //"Čísla si program uloží."
        int sum = 0;
        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) break;
            numbers.add(input);
            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
