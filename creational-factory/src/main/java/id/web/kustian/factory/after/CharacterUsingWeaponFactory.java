/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42): <phk@FreeBSD.ORG> wrote this file. As
 * long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a
 * beer in return Poul-Henning Kamp
 * ----------------------------------------------------------------------------
 * 
 * /src/main/java/id/web/kustian/factory/after/CharacterUsingWeaponFactory.java
 * 
 */
package id.web.kustian.factory.after;

import id.web.kustian.factory.character.Assassin;
import id.web.kustian.factory.character.CharacterObject;
import id.web.kustian.factory.character.Gunner;
import id.web.kustian.factory.character.Knight;
import id.web.kustian.factory.character.Ranger;
import id.web.kustian.factory.character.Wizard;

public class CharacterUsingWeaponFactory {
    public static CharacterObject createPlayer(String jobClass) {
        if (jobClass.equalsIgnoreCase("A")) {
            Assassin c = new Assassin();
            c.setWeapon(WeaponFactory.createWeapon("rifle"));
            return c;
        } else if (jobClass.equalsIgnoreCase("G")) {
            Gunner c = new Gunner();
            c.setWeapon(WeaponFactory.createWeapon("rifle"));
            return c;
        } else if (jobClass.equalsIgnoreCase("K")) {
            Knight c = new Knight();
            c.setWeapon(WeaponFactory.createWeapon("sword"));
            return c;
        } else if (jobClass.equalsIgnoreCase("R")) {
            Ranger c =  new Ranger();
            c.setWeapon(WeaponFactory.createWeapon("bow"));
            return c;
        } else if (jobClass.equalsIgnoreCase("W")) {
            Wizard c = new Wizard();
            c.setWeapon(WeaponFactory.createWeapon("staff"));
            return c;
        }else {
            return null;
        }
    }
}
