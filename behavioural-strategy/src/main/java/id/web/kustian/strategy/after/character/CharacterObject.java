package id.web.kustian.strategy.after.character;

import id.web.kustian.strategy.after.weapon.Attack;
import id.web.kustian.strategy.after.weapon.DefaultWeapon;

public class CharacterObject {
    private String className="Base Character";
    private Attack weapon = new DefaultWeapon();
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
