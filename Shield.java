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
    static Shield Shield1 = new Shield("Anti-Shield", 13,new ImageIcon("./src/projectd/Image_Library/Shields/Anti_Shield.png"));
    static Shield Shield2 = new Shield("Rondover", 12,new ImageIcon("./src/projectd/Image_Library/Shields/RoundLove_Shield.png"));
    static Shield Shield3 = new Shield("Fab Shield", 14,new ImageIcon("./src/projectd/Image_Library/Shields/Fab_Shield.png"));
    static Shield Shield4 = new Shield("Heal Shield", 13,new ImageIcon("./src/projectd/Image_Library/Shields/Heal_Shield.png"));
    static Shield Shield5 = new Shield("Knight Shield", 17,new ImageIcon("./src/projectd/Image_Library/Shields/Knight_Shield.png"));
    static Shield Shield6 = new Shield("PureSteel Shield", 15,new ImageIcon("./src/projectd/Image_Library/Shields/PureSteel_Armor.png"));
    static Shield Shield7 = new Shield("Software Shield", 12,new ImageIcon("./src/projectd/Image_Library/Shields/Software_Shield.png"));
    static Shield Shield8 = new Shield("Steel Shield", 16,new ImageIcon("./src/projectd/Image_Library/Shields/Steel_Shield.png"));
    
    Shield(String name, int armor, ImageIcon shield){
        this.name = name;
        this.armor = armor;
        this.shield = shield;
    }
    
    public static Shield rng_Shield(){
        Random rnd = new Random();
        int rn_s = rnd.nextInt(8) + 1;
        switch(rn_s) {
            case 1:
                return Shield1;
            case 2:
                return Shield2;
            case 3:
                return Shield3;
            case 4:
                return Shield4;
            case 5:
                return Shield5;
            case 6:
                return Shield6;
            case 7:
                return Shield7;
            case 8:
                return Shield8;
            default:
                return Shield1;
        }
    }

    //toDO one method to return a default Shield
}
