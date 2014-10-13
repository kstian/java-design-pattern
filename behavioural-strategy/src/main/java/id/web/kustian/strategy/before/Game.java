package id.web.kustian.strategy.before;

import id.web.kustian.strategy.before.character.CharacterObject;
import id.web.kustian.strategy.before.character.Knight;
import id.web.kustian.strategy.before.character.Wizard;

public class Game {
    public static void main(String[] args) {
        // create wizard
        CharacterObject co1 = new Wizard();
        System.out.println("Character class name : " + co1.getClassName());
        System.out.println("Character attack :");
        co1.attack();
       
        // create knight
        CharacterObject co2 = new Knight();        
        System.out.println("Character class name : " + co2.getClassName());
        System.out.println("Character attack :");
        co2.attack();
    }
}
