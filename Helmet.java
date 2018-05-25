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
class Helmet {
    public String name;
    public int armor;
    ImageIcon helmet;
    
    //dem helmets
    static Helmet Helmet1 = new Helmet("Hat", 3, new ImageIcon(""));
    static Helmet Helmet2 = new Helmet("Baseball Helmet", 15, new ImageIcon(""));
    static Helmet Helmet3 = new Helmet("Motorbike Helmet", 23, new ImageIcon(""));
    //toDo one default Helmet
    Helmet(String name, int armor, ImageIcon helmet){
        this.name = name;
        this.armor = armor;
        this.helmet = helmet;
    }
    
    public static Helmet rng_Helmet(){
        Random rnd = new Random();
        int rnd_h = rnd.nextInt(2) + 1;
        switch(rnd_h){
            case 1:
                return Helmet1;
            case 2:
                return Helmet2;
            case 3:
                return Helmet3;
            default:
                return Helmet1;
        }
    }
    
    //toDO one method to return a default Helmet
}
