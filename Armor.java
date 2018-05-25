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
    static Armor Armor1 = new Armor("Wool Armor", 20, new ImageIcon(""));
    static Armor Armor2 = new Armor("Steel Armor",50, new ImageIcon(""));
    static Armor Armor3 = new Armor("Leather Armor", 25, new ImageIcon(""));
    
    Armor(String name, int armor_rating, ImageIcon armor){
        this.name = name;
        this.armor_rating = armor_rating;
        this.armor = armor;
    }
    
    public static Armor rng_Armor(){
        Random rnd = new Random();
        int rnd_a = rnd.nextInt(2) + 1;
        switch(rnd_a){
            case 1:
                return Armor1;
            case 2:
                return Armor2;
            case 3:
                return Armor3;
            default:
                return Armor1;
        }
    }
    
    //toDO one method to return a default Armor
}
