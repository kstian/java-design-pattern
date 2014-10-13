package id.web.kustian.factory.after;

import id.web.kustian.factory.weapon.Attack;
import id.web.kustian.factory.weapon.BowWeapon;
import id.web.kustian.factory.weapon.DefaultWeapon;
import id.web.kustian.factory.weapon.RifleWeapon;
import id.web.kustian.factory.weapon.StaffWeapon;
import id.web.kustian.factory.weapon.SwordWeapon;

public class WeaponFactory {
    public static Attack createWeapon(String weaponType) {
        if(weaponType.equalsIgnoreCase("staff")) {
            return new StaffWeapon();
        }else if (weaponType.equalsIgnoreCase("sword")) {
            return new SwordWeapon();
        }else if (weaponType.equalsIgnoreCase("rifle")) {
            return new RifleWeapon();
        }else if (weaponType.equalsIgnoreCase("bow")) {
            return new BowWeapon();
        }else {
            return new DefaultWeapon();
        }
    }
}
