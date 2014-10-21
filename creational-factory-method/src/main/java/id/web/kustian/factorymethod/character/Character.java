package id.web.kustian.factorymethod.character;

import id.web.kustian.factorymethod.weapon.Attack;
import id.web.kustian.factorymethod.weapon.DefaultWeapon;

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
