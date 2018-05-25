package projectd;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author DoctorP
 */
class Weapon {
    
    public String name;
    public int damage;
    ImageIcon sword;
    
    //dem weapons
    static Weapon Weap1 = new Weapon("Excalibutt",20,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    static Weapon Weap2 = new Weapon("Stick",8,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    static Weapon Weap3 = new Weapon("Toothbrush",7,new ImageIcon("./src/ImageLibrary/Sword_Default.png"));
    
    Weapon(String name, int damage, ImageIcon sword){
        this.name = name;
        this.damage = damage;
        this.sword = sword;
    }
    
    public static Weapon rng_Weap(){
        Random rnd = new Random();
        int rn_w = rnd.nextInt(2) + 1;
        switch(rn_w){
            case 1:
                return Weap1;
            case 2:
                return Weap2;
            case 3:
                return Weap3;
            default:
                return Weap1;
        }
    }
    
    //toDO one method to return a default Weapon
    
}
