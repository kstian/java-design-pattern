/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.kustian.factorymethod.character.factory;

import id.web.kustian.factorymethod.character.Character;
/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public abstract class CharacterFactory {
    public Character createCharacter(){
       return buildCharacter();
    }
    protected abstract Character buildCharacter();
}
