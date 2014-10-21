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
package id.web.kustian.strategy.test;

import id.web.kustian.strategy.after.character.Character;
import id.web.kustian.strategy.after.character.Knight;
import id.web.kustian.strategy.after.character.Wizard;
import id.web.kustian.strategy.after.weapon.StaffWeapon;
import id.web.kustian.strategy.after.weapon.SwordWeapon;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class MainTest {

    @Test
    public void dummyTest(){
        // create wizard
        Character co1 = new Wizard();
        // use magic weapon
        co1.setWeapon(new StaffWeapon());
        System.out.println("Character class name : " + co1.getClassName());
        System.out.println("Character attack :");
        co1.attack();
        // use sword weapon
        co1.setWeapon(new SwordWeapon());
        System.out.println("Character class name : " + co1.getClassName());
        System.out.println("Character attack :");
        co1.attack();
        // create knight
        Character co2 = new Knight();
        // use sword weapon
        co2.setWeapon(new StaffWeapon());
        System.out.println("Character class name : " + co2.getClassName());
        System.out.println("Character attack :");
        co2.attack();
        assertTrue("Dummy test",true);
    }
}
