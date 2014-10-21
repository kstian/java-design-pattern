/*
 *  ----------------------------------------------------------------------------
 *  The MIT-Zero License
 *  
 *  Copyright (c) <year> <copyright holders>
 *  
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *  ----------------------------------------------------------------------------
 */
package id.web.kustian.factorymethod;

import id.web.kustian.factorymethod.character.factory.CharacterFactory;
import id.web.kustian.factorymethod.character.factory.WizardFactory;
import id.web.kustian.factorymethod.character.Character;
/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class Game {
    public static void main(String[] args) {
        // create wizard
        CharacterFactory cf = new WizardFactory();
        Character c1 = cf.createCharacter();
        // use magic weapon
        System.out.println("Character class name : " + c1.getClassName());
        System.out.println("Character attack :");
        c1.attack();
    }
}
