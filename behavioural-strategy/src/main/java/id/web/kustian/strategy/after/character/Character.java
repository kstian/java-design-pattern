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
package id.web.kustian.strategy.after.character;

import id.web.kustian.strategy.after.weapon.Attack;
import id.web.kustian.strategy.after.weapon.DefaultWeapon;

/**
 *
 * @author Ken Kustian <ken.kustian at gmail.org>
 */
public class Character {

    private String className = "Base Character";
    private Attack weapon = new DefaultWeapon();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    /**
     * 
     * @return  The weapon (default {@link DefaultWeapon})
     */
    public Attack getWeapon() {
        return weapon;
    }
    /**
     * 
     * @param weapon The weapon to be used
     */
    public void setWeapon(Attack weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        this.weapon.attack();
    }
}
