package id.web.kustian.strategy.after;

import id.web.kustian.strategy.after.character.CharacterObject;
import id.web.kustian.strategy.after.character.Knight;
import id.web.kustian.strategy.after.character.Wizard;
import id.web.kustian.strategy.after.weapon.StaffWeapon;
import id.web.kustian.strategy.after.weapon.SwordWeapon;

/**
 * Hello world!
 *
 */
public class Game {
    public static void main(String[] args) {
        // create wizard
        CharacterObject co1 = new Wizard();
        // use magic weapon
        co1.setWeapon(new StaffWeapon());
        System.out.println("Character class name : " + co1.getClassName());
        System.out.println("Character attack :");
        co1.attack();
        // use sword weapon
        co1.setWeapon(new SwordWeapon());
        System.out.println("Character class name : " + co1.getClassName());
        System.out.println("Character attack :");
        co1.attack();
        // create knight
        CharacterObject co2 = new Knight();
        // use sword weapon
        co2.setWeapon(new StaffWeapon());
        System.out.println("Character class name : " + co2.getClassName());
        System.out.println("Character attack :");
        co2.attack();
    }
}
