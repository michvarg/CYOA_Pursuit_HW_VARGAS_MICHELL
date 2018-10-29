package com.company;

import java.util.Scanner;


public class Game implements gameStart {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);

    public void startGame() {
        sephoraEntrance();


    }

    int choice;
    int coupon;
    boolean kickedout = false;

    private void sephoraEntrance() {


        System.out.println("Welcome to Saphora, where you can make your self unimaginably beautiful with what you chose \n" +
                "there is a catch, you must find the unlimited coupon that can get you everything free!");

        while (!kickedout) {

                System.out.println("You are the front store and need to find the coupon, where do you look \n" +
                        "1-behind the counter\n" +
                        "2-by the lip gloss stand \n" +
                        "3-by the front entrance \n" +
                        "4-by the grumpy customer");

                choice = myScanner.nextInt();

                if (choice == 1) {
                    if (coupon == 1) {
                        break;
                    } else {
                        System.out.println("You check behind the counter and are asked by the manager what it is exactly that you are doing? \n" +
                                "You look up cluelessly and are escorted out, THE END");
                        kickedout = true;
                        enterScanner.nextLine();
                    }

                } else if (choice == 2) {
                    System.out.println("You go look by the lip gloss stand and suddenly attacked by and angry customer that just got left by \n" +
                            "her boyfriend, damm life sucks like that... but you tell the manager and she is escorted out");
                    enterScanner.nextLine();
                } else if (choice == 3) {
                    System.out.println("You check the front entrance and as you look around the bouncer asks if you lost something. \n" +
                            "You say, im looking for a coupon that will get me everything free. He lookd at you sideways and says 'Free?! \n" +
                            "they still pay me 7.25 and they're give you free stuff, nah man i want that coupon!. He frames you for stealing \n" +
                            "and walks you out! YOU LOST!");
                    kickedout = true;
                } else if (choice == 4) {
                    System.out.println("You see the grumpy customer and ask her what is going on. She tells you that he boyfriend just broke \n" +
                            "up with her and that her life is in shambles! \n" +
                            "\n You have a choice \n" +
                            "\n1-tell her that she is amazing and that its his lose \n" +
                            "\n2-tell her it seems that shes always angry and that's proabably why he left her");

                    choice = myScanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("She looks up at and and starts crying her eyes out and says 'Thank you so much \n" +
                                    "for your kind words, i was going to use this coupon to get really pretty and go on a date \n" +
                                    "with his best friend but i want to give it you insted\n" +
                                    "\n" +
                                    "\nYou have the unlimited coupon and have gone on a shopping spree! THE END");
                            kickedout = true;

                            break;
                        case 2:
                            System.out.println("You tell her that she is always angry and for some reason that infuriates her. \n" +
                                    "she goes to the manager and complains that you are harrasing her, but before \n" +
                                    " she slaps you a whole bunch of times and the bouncer comes \n" +
                                    "and escorts you out! YOU LOST");
                            for (int i = 0; i <3 ; i++) {
                                System.out.println("SLAP");
                            }
                            kickedout = true;
                            break;
                    }

                }
        }
    }


}



