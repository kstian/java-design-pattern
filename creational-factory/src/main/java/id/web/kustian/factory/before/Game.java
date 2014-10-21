package id.web.kustian.factory.before;

import id.web.kustian.factory.character.Assassin;
import id.web.kustian.factory.character.Character;
import id.web.kustian.factory.character.Gunner;
import id.web.kustian.factory.character.Knight;
import id.web.kustian.factory.character.Ranger;
import id.web.kustian.factory.character.Wizard;

import java.util.Scanner;

public class Game {
    private static Scanner input;
    private static Character player1;
    private static Character player2;

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

        if (characterType1.equalsIgnoreCase("A")) {
            player1 = new Assassin();
        } else if (characterType1.equalsIgnoreCase("G")) {
            player1 = new Gunner();
        } else if (characterType1.equalsIgnoreCase("K")) {
            player1 = new Knight();
        } else if (characterType1.equalsIgnoreCase("R")) {
            player1 = new Ranger();
        } else if (characterType1.equalsIgnoreCase("W")) {
            player1 = new Wizard();
        }
        
        if (characterType2.equalsIgnoreCase("A")) {
            player2 = new Assassin();
        } else if (characterType2.equalsIgnoreCase("G")) {
            player2 = new Gunner();
        } else if (characterType2.equalsIgnoreCase("K")) {
            player2 = new Knight();
        } else if (characterType2.equalsIgnoreCase("R")) {
            player2 = new Ranger();
        } else if (characterType2.equalsIgnoreCase("W")) {
            player2 = new Wizard();
        }
        
        if (player1 != null && player2 != null) {
            player1.setPlayerName("Player 1");
            System.out.println(player1.getPlayerName() + ", You choosed : " + player1.getClassName());
            player1.attack();
            player2.setPlayerName("Player 2");
            System.out.println(player2.getPlayerName() + ", You choosed : " + player2.getClassName());
            player2.attack();
        } else {
            System.out
                    .println("You have not choosed available Character, game will exit!");
        }
    }
}
