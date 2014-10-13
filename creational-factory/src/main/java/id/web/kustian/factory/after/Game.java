/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42): <phk@FreeBSD.ORG> wrote this file. As
 * long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a
 * beer in return Poul-Henning Kamp
 * ----------------------------------------------------------------------------
 * 
 * /creational-factory/src/main/java/id/web/kustian/factory/after/Game.java
 * 
 * Author : Kustian
 */
package id.web.kustian.factory.after;

import id.web.kustian.factory.character.CharacterObject;

import java.util.Scanner;

public class Game {
    private static Scanner input;
    private static CharacterObject player1;
    private static CharacterObject player2;

    public static void main(String[] args) {
        System.out.println("Choose your Character : ");
        System.out.println("A for Assasin");
        System.out.println("G for Gunner");
        System.out.println("K for Knight");
        System.out.println("R for Ranger");
        System.out.println("W for Wizzard");
        System.out.println("Player 1 : ");
        input = new Scanner(System.in);
        String characterType1 = input.next();
        System.out.println("Player 2 : ");
        input = new Scanner(System.in);
        String characterType2 = input.next();

        player1 = CharacterFactory.createPlayer(characterType1);

        player2 = CharacterFactory.createPlayer(characterType2);

        if (player1 != null && player2 != null) {
            player1.setPlayerName("Player 1");
            System.out.println(player1.getPlayerName() + ", You choosed : "
                    + player1.getClassName());
            player1.attack();
            player2.setPlayerName("Player 2");
            System.out.println(player2.getPlayerName() + ", You choosed : "
                    + player2.getClassName());
            player2.attack();
        } else {
            System.out
                    .println("You have not choosed available Character, game will exit!");
        }
    }
}
