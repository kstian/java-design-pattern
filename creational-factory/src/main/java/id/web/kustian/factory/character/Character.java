package id.web.kustian.factory.character;

import id.web.kustian.factory.weapon.Attack;
import id.web.kustian.factory.weapon.DefaultWeapon;


public class Character {
    private String playerName = "Player";
    private String className = "Base Character";
    private Attack weapon = new DefaultWeapon();
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Attack getWeapon() {
        return weapon;
    }

    public void setWeapon(Attack weapon) {
        this.weapon = weapon;
    }
    
    public void attack() {
        this.weapon.attack();
    }
}
