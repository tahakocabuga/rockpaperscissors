/*
This project is made by Taha Kocabuga
You can ask me questions github.com/tahakocabuga
 */

import java.util.Scanner;

public class Main {

    private static int userChoice;
    private static int aiChoice;
    private static boolean start = true;
    private static int score;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("hi boi welcome to rps (too lazy to write Rock Paper Scissors) i just wrote but ok");
        System.out.print("what is ur name: ");
        input.nextLine();

        System.out.println("so we have to start? lol");

        while(start) {
            System.out.println("choose 1 for rock 2 for paper and 3 for scissors");
            userChoice = input.nextInt();

            aiChoice = (int)(Math.random() * ((3 - 1) + 1)) + 1;

            if(aiChoice == 1) {
                if(userChoice == 1) {
                    System.out.println("ai chose rock lol tie");
                    continue;
                } else if(userChoice == 2) {
                    System.out.println("ai chose rock omg u win");
                    score++;
                    continue;
                } else if(userChoice == 3) {
                    System.out.println("ai chose rock rip u losttt");
                    break;
                }
            } else if(aiChoice == 2) {
                if(userChoice == 1) {
                    System.out.println("ai chose paper so u win");
                    score++;
                    continue;
                } else if(userChoice == 2) {
                    System.out.println("ai chose paper hehe tie boi");
                    continue;
                } else if(userChoice == 3) {
                    System.out.println("ai chose paper cool, u lost");
                    break;
                }
            } else if(aiChoice == 3) {
                if(userChoice == 1) {
                    System.out.println("ai chose scissors ur so pro u win");
                    score++;
                    continue;
                } else if(userChoice == 2) {
                    System.out.println("ai chose scissors good job ai u beat him lol");
                    break;
                } else if(userChoice == 3) {
                    System.out.println("ai chose scissors get tie!!!");
                    continue;
                }
            }
            input.close();
        }
        System.out.println("Your score: " + score);

        System.out.println("I hope you enjoyed this simple game. I tried to make it fun by conversations.");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){} // waits for 1 second


        System.out.println("if u liked plez donate me a star :(");
    }

}
