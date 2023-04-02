package MarsExpedition;

import java.util.Scanner;

public class MarsExpedition {

    public static void main(String[] args) {
        new MarsExpedition();
    }
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Program is Starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Welcome, what's your name and are you ready to begin?");
        String name =  input.nextLine();
        System.out.println("Hello " + ""+ name + " " + "Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String newWorld = input.nextLine();

        if(newWorld.equalsIgnoreCase("y")){
            System.out.println("I knew you would say that. You are team leader for a reason." +
                    "");
        }

    }
}

