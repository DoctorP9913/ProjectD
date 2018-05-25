/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author DoctorP
 */
class Shield {
    public String name;
    public int armor;
    ImageIcon shield;
    
    //dem shields
    static Shield Shield1 = new Shield("Asscover", 13,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    static Shield Shield2 = new Shield("Rondover", 16,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    static Shield Shield3 = new Shield("Hand", 1,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    
    Shield(String name, int armor, ImageIcon shield){
        this.name = name;
        this.armor = armor;
        this.shield = shield;
    }
    
    public static Shield rng_Shield(){
        Random rnd = new Random();
        int rn_s = rnd.nextInt(2) + 1;
        switch(rn_s) {
            case 1:
                return Shield1;
            case 2:
                return Shield2;
            case 3:
                return Shield3;
            default:
                return Shield1;
        }
    }

    //toDO one method to return a default Shield
}
