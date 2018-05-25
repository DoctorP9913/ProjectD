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
    static Helmet Helmet1 = new Helmet("Hat", 3, new ImageIcon("./src/projectd/Image_Library/Helmets/Viking_Helmet.png"));
    static Helmet Helmet2 = new Helmet("Football Helmet", 17, new ImageIcon("./src/projectd/Image_Library/Helmets/Football_Helmet.png"));
    static Helmet Helmet3 = new Helmet("Motorbike Helmet", 23, new ImageIcon("./src/projectd/Image_Library/Helmets/Motorbike_Helmet.png"));
    static Helmet Helmet4 = new Helmet("Army Helmet", 27, new ImageIcon("./src/projectd/Image_Library/Helmets/Army_Helmet.png"));
    static Helmet Helmet5 = new Helmet("Knight Helmet", 28, new ImageIcon("./src/projectd/Image_Library/Helmets/Knight_Helmet.png"));
    static Helmet Helmet6 = new Helmet("Miner's Helmet", 15, new ImageIcon("./src/projectd/Image_Library/Helmets/Miner_Helmet.png"));
    static Helmet Helmet7 = new Helmet("Myrmidon Helmet", 35, new ImageIcon("./src/projectd/Image_Library/Helmets/Myrmidon_Helmet.png"));
    static Helmet Helmet8 = new Helmet("Spaceman Helmet", 25, new ImageIcon("./src/projectd/Image_Library/Helmets/Spaceman_Helmet.png"));
    static Helmet Helmet9 = new Helmet("Viking Helmet", 26, new ImageIcon("./src/projectd/Image_Library/Helmets/Viking_Helmet.png"));
    static Helmet Helmet10 = new Helmet("Winged Helmet", 33, new ImageIcon("./src/projectd/Image_Library/Helmets/Winged_Helmet.png"));
    
    //toDo one default Helmet
    Helmet(String name, int armor, ImageIcon helmet){
        this.name = name;
        this.armor = armor;
        this.helmet = helmet;
    }
    
    public static Helmet rng_Helmet(){
        Random rnd = new Random();
        int rnd_h = rnd.nextInt(10) + 1;
        switch(rnd_h){
            case 1:
                return Helmet1;
            case 2:
                return Helmet2;
            case 3:
                return Helmet3;
            case 4:
                return Helmet4;
            case 5:
                return Helmet5;
            case 6:
                return Helmet6;
            case 7:
                return Helmet7;
            case 8:
                return Helmet8;
            case 9:
                return Helmet9;
            case 10:
                return Helmet10;
            default:
                return Helmet1;
        }
    }
    
    //toDO one method to return a default Helmet
}
