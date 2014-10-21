/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.kustian.factorymethod.weapon.factory;

import id.web.kustian.factorymethod.weapon.Attack;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public abstract class WeaponFactory {
    public Attack createWeapon(){
        return buildWeapon();
    }
    protected abstract Attack buildWeapon();
}
