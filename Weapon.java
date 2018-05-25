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
    static Weapon Weap1 = new Weapon("Excalibutt",35,new ImageIcon("./src/projectd/Image_Library/Swords/Excalibur.png"));
    static Weapon Weap2 = new Weapon("Stick",4,new ImageIcon("./src/projectd/Image_Library/Sword_Default.png"));
    static Weapon Weap3 = new Weapon("Toothbrush",9,new ImageIcon("./src/projectd/Image_Library/Sword_Default.png"));
    static Weapon Weap4 = new Weapon("Almost a Sword", 12,new ImageIcon("./src/projectd/Image_Library/Swords/AlmostSword_Sword.png"));
    static Weapon Weap5 = new Weapon("Chicky Sword", 17, new ImageIcon("./src/projectd/Image_Library/Swords/Chicky_Sword.png"));
    static Weapon Weap6 = new Weapon("Crisis Core", 28, new ImageIcon("./src/projectd/Image_Library/Swords/CrisisCore_Sword.png"));
    static Weapon Weap7 = new Weapon("Crystal Sword", 25, new ImageIcon("./src/projectd/Image_Library/Swords/Crystal_Sword.png"));
    static Weapon Weap8 = new Weapon("Dark Sword", 32, new ImageIcon("./src/projectd/Image_Library/Swords/Dark_Sword.png"));
    static Weapon Weap9 = new Weapon("Demon Sword", 40, new ImageIcon("./src/projectd/Image_Library/Swords/Demon_Sword.png"));
    static Weapon Weap10 = new Weapon("Earth Sword", 37, new ImageIcon("./src/projectd/Image_Library/Swords/EarthSword_Sword.png"));
    static Weapon Weap11 = new Weapon("Golden Sword", 31, new ImageIcon("./src/projectd/Image_Library/Swords/Gold_Sword.png"));
    static Weapon Weap12 = new Weapon("Heavy Sword", 29, new ImageIcon("./src/projectd/Image_Library/Swords/HeavySword_Sword.png"));
    static Weapon Weap13 = new Weapon("Pirate's Soul", 33, new ImageIcon("./src/projectd/Image_Library/Swords/PiratesSoul_Sword.png"));
    static Weapon Weap14 = new Weapon("Pure Sword", 30, new ImageIcon("./src/projectd/Image_Library/Swords/Pure_Sword.png"));
    static Weapon Weap15 = new Weapon("Short Sword", 20, new ImageIcon("./src/projectd/Image_Library/Swords/Short_Sword.png"));
    static Weapon Weap16 = new Weapon("Simple Sword", 19, new ImageIcon("./src/projectd/Image_Library/Swords/Simple_Sword.png"));
    static Weapon Weap17 = new Weapon("Walfas Sword", 32, new ImageIcon("./src/projectd/Image_Library/Swords/Walfas_Sword.png"));
    
    
    Weapon(String name, int damage, ImageIcon sword){
        this.name = name;
        this.damage = damage;
        this.sword = sword;
    }
    
    public static Weapon rng_Weap(){
        Random rnd = new Random();
        int rn_w = rnd.nextInt(16) + 1;
        switch(rn_w){
            case 1:
                return Weap1;
            case 2:
                return Weap2;
            case 3:
                return Weap3;
            case 4:
                return Weap4;
            case 5:
                return Weap5;
            case 6:
                return Weap6;
            case 7:
                return Weap7;
            case 8:
                return Weap8;
            case 9:
                return Weap9;
            case 10:
                return Weap10;
            case 11:
                return Weap11;
            case 12:
                return Weap12;
            case 13:
                return Weap13;
            case 14:
                return Weap14;
            case 15:
                return Weap15;
            case 16:
                return Weap16;
            case 17:
                return Weap17;
            default:
                return Weap1;
        }
    }
    
    //toDO one method to return a default Weapon
    
}
