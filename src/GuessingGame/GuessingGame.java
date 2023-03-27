package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame () {
        System.out.printf("Hello there");
        System.out.println("(type in your name");


        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        while (true) {
            System.out.println("Your guess?");
            Scanner guess = new Scanner(System.in);
            int numberGuess;

            try {
                numberGuess = guess.nextInt();
            } catch (Exception e) {
                System.out.println("That's not an integer");
                continue;
            }


            if (numberGuess != randomNumber) {
                if (numberGuess < randomNumber) {
                    System.out.println("Your guess is too low, try again.");

                }
                else {
                    System.out.println("Your guess is too high, try again.");
                }

            }
            else {
                System.out.println("Congratulations, you are correct!");
                break;
            }
        }
    }




}
