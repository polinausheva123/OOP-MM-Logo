package com.mm.internship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // input validation
        if (N % 2 == 0) {
            System.err.println("Invalid input. Must be an odd number.");
            return;
        }

        // class that generates a row for a single (vertically split in half) M letter
        LetterRowGenerator generator = new LetterRowGenerator(N);

        for (int i = 0; i < N + 1; i++) {
            String row = generator.generateRow();
            System.out.println(row.repeat(2));
        }
    }
}
