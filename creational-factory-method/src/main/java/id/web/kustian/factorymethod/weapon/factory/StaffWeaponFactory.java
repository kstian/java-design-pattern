/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.kustian.factorymethod.weapon.factory;

import id.web.kustian.factorymethod.weapon.Attack;
import id.web.kustian.factorymethod.weapon.StaffWeapon;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class StaffWeaponFactory extends WeaponFactory{

    @Override
    protected Attack buildWeapon() {
        return new StaffWeapon();
    }
    
}
