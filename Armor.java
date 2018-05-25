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
class Armor {
    public String name;
    public int armor_rating;
    ImageIcon armor;
    
    //dem armors
    static Armor Armor1 = new Armor("Crest Armor", 40, new ImageIcon("./src/projectd/Image_Library/Armor/Crest_Armor.png"));
    static Armor Armor2 = new Armor("Ceasar's Armor", 55, new ImageIcon("./src/projectd/Image_Library/Armor/Ceasars_Armor.png"));
    static Armor Armor3 = new Armor("Dwaeven Armor", 47, new ImageIcon("./src/projectd/Image_Library/Armor/Dwarven_Armor.png"));
    static Armor Armor4 = new Armor("Fancy Trunk", 37, new ImageIcon("./src/projectd/Image_Library/Armor/Fancy_Trunk.png"));
    static Armor Armor5 = new Armor("Gluster Armor", 62, new ImageIcon("./src/projectd/Image_Library/Armor/Gluster_Armor.png"));
    static Armor Armor6 = new Armor("Hide Armor", 39, new ImageIcon("./src/projectd/Image_Library/Armor/Hide_Armor.png"));
    static Armor Armor7 = new Armor("Iren-Man Armor", 65, new ImageIcon("./src/projectd/Image_Library/Armor/Iren-man_Armor.png"));
    static Armor Armor8 = new Armor("Legion Armor", 51, new ImageIcon("./src/projectd/Image_Library/Armor/Legion_Armor.png"));
    static Armor Armor9 = new Armor("Nordic Armor", 53, new ImageIcon("./src/projectd/Image_Library/Armor/Nordic_Armor.png"));
    static Armor Armor10 = new Armor("Pure Steel Armor", 57, new ImageIcon("./src/projectd/Image_Library/Armor/Pure_Steel_Armor.png"));
    static Armor Armor11 = new Armor("Raseone Armor", 60, new ImageIcon("./src/projectd/Image_Library/Armor/Raseone_Armor.png"));
    static Armor Armor12 = new Armor("Steel Plate Armor", 52, new ImageIcon("./src/projectd/Image_Library/Armor/SteelPlate_Armor.png"));
    
    Armor(String name, int armor_rating, ImageIcon armor){
        this.name = name;
        this.armor_rating = armor_rating;
        this.armor = armor;
    }
    public static Armor rng_Armor(){
        Random rnd = new Random();
        int rnd_a = rnd.nextInt(12) + 1;
        switch(rnd_a){
            case 1:
                return Armor1;
            case 2:
                return Armor2;
            case 3:
                return Armor3;
            case 4:
                return Armor4;
            case 5:
                return Armor5;
            case 6:
                return Armor6;
            case 7:
                return Armor7;
            case 8:
                return Armor8;
            case 9:
                return Armor9;
            case 10:
                return Armor10;
            case 11:
                return Armor11;
            case 12:
                return Armor12;
            default:
                return Armor1;
        }
    }
    
    //toDO one method to return a default Armor
}
