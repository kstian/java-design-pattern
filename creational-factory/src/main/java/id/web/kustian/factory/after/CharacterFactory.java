/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42): <phk@FreeBSD.ORG> wrote this file. As
 * long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a
 * beer in return Poul-Henning Kamp
 * ----------------------------------------------------------------------------
 * 
 * /src/main/java/id/web/kustian/factory/after/CharacterFactory.java
 * 
 */
package id.web.kustian.factory.after;

import id.web.kustian.factory.character.Assassin;
import id.web.kustian.factory.character.CharacterObject;
import id.web.kustian.factory.character.Gunner;
import id.web.kustian.factory.character.Knight;
import id.web.kustian.factory.character.Ranger;
import id.web.kustian.factory.character.Wizard;

public class CharacterFactory {
    public static CharacterObject createPlayer(String jobClass) {
        if (jobClass.equalsIgnoreCase("A")) {
            return new Assassin();
        } else if (jobClass.equalsIgnoreCase("G")) {
            return new Gunner();
        } else if (jobClass.equalsIgnoreCase("K")) {
            return new Knight();
        } else if (jobClass.equalsIgnoreCase("R")) {
            return new Ranger();
        } else if (jobClass.equalsIgnoreCase("W")) {
            return new Wizard();
        }else {
            return null;
        }
    }
}
