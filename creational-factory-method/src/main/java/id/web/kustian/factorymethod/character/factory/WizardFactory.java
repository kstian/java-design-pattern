/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.kustian.factorymethod.character.factory;

import id.web.kustian.factorymethod.character.Wizard;
import id.web.kustian.factorymethod.weapon.StaffWeapon;
import id.web.kustian.factorymethod.character.Character;
import id.web.kustian.factorymethod.weapon.factory.StaffWeaponFactory;
import id.web.kustian.factorymethod.weapon.factory.WeaponFactory;
/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class WizardFactory extends CharacterFactory{

    @Override
    protected Character buildCharacter() {
        Character c = new Wizard();
        c.setWeapon(new StaffWeapon());
        // we can use weapon factory also
        // WeaponFactory wf = new StaffWeaponFactory();
        // c.setWeapon(wf.createWeapon());
        return c;
    }
    
}
