
package id.web.kustian.factory.after;

import id.web.kustian.factory.character.Assassin;
import id.web.kustian.factory.character.Character;
import id.web.kustian.factory.character.Gunner;
import id.web.kustian.factory.character.Knight;
import id.web.kustian.factory.character.Ranger;
import id.web.kustian.factory.character.Wizard;

public class CharacterFactory {
    public static Character createPlayer(String jobClass) {
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
