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
    static Random my_s = new Random();
    static int mys_sword = my_s.nextInt(100);
    
    //dem weapons
    static Weapon Weap1 = new Weapon("Excalibutt",35,new ImageIcon("./src/projectd/Image_Library/Swords/Excalibur.png"));
    static Weapon Weap2 = new Weapon("Stick",4,new ImageIcon("./src/projectd/Image_Library/Stick_Sword.png"));
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
    static Weapon Weap18 = new Weapon("Long Sword", 27, new ImageIcon("./src/projectd/Image_Library/Swords/LongSword.png"));
    static Weapon Weap19 = new Weapon("Clutch Sword", 30, new ImageIcon("./src/projectd/Image_Library/Swords/ClutchSword.png"));
    static Weapon Weap20 = new Weapon("Perlotte", 29, new ImageIcon("./src/projectd/Image_Library/Swords/Perlotte.png"));
    static Weapon Weap21 = new Weapon("Soldier's Sword", 25, new ImageIcon("./src/projectd/Image_Library/Swords/SoldiersSword.png"));
    static Weapon Weap22 = new Weapon("White Knight's Sword", 33, new ImageIcon("./src/projectd/Image_Library/Swords/WhiteKnight.png"));
    static Weapon Weap23 = new Weapon("England's Straight", 20, new ImageIcon("./src/projectd/Image_Library/Swords/EnglandsStraight.png"));
    static Weapon Weap24 = new Weapon("Pure Steel Sword", 28, new ImageIcon("./src/projectd/Image_Library/Swords/PureSteelSword.png"));
    static Weapon Weap25 = new Weapon("Katana", 32, new ImageIcon("./src/projectd/Image_Library/Swords/Katana.png"));
    static Weapon Weap26 = new Weapon("Broken Sword", 60, new ImageIcon("./src/projectd/Image_Library/Swords/BrokenSword.png"));
    static Weapon Weap27 = new Weapon("Daedric Sword", 38, new ImageIcon("./src/projectd/Image_Library/Swords/Daedric.png"));
    static Weapon Weap28 = new Weapon("Advanced Sword", 31, new ImageIcon("./src/projectd/Image_Library/Swords/AdvancedSword.png"));
    static Weapon Weap29 = new Weapon("Futuristic Sword", 36, new ImageIcon("./src/projectd/Image_Library/Swords/FuturisticSword.png"));
    static Weapon Weap30 = new Weapon("Black Knight's Sword", 37, new ImageIcon("./src/projectd/Image_Library/Swords/BlackKnight.png"));
    static Weapon Weap31 = new Weapon("Boalder", 38, new ImageIcon("./src/projectd/Image_Library/Swords/Boalder.png"));
    static Weapon Weap32 = new Weapon("Devourer", 37, new ImageIcon("./src/projectd/Image_Library/Swords/Devourer.png"));
    static Weapon Weap33 = new Weapon("Linnopolis Sword", 36, new ImageIcon("./src/projectd/Image_Library/Swords/LinopolisSword.png"));
    static Weapon Weap34 = new Weapon("FFSword", 50, new ImageIcon("./src/projectd/Image_Library/Swords/FFSword.png"));
    static Weapon Weap35 = new Weapon("Flower Sword", 27, new ImageIcon("./src/projectd/Image_Library/Swords/FlowerSword.png"));
    static Weapon Weap36 = new Weapon("Mech Sword", 57, new ImageIcon("./src/projectd/Image_Library/Swords/MechSword.png"));
    static Weapon Weap37 = new Weapon("Ice Queen", 55, new ImageIcon("./src/projectd/Image_Library/Swords/IceQueen.png"));
    static Weapon Weap38 = new Weapon("Neon Sword", 24, new ImageIcon("./src/projectd/Image_Library/Swords/Neon_Sword.png"));
    static Weapon Weap39 = new Weapon("Glass Sword", 29, new ImageIcon("./src/projectd/Image_Library/Swords/Glass_Sword.png"));
    static Weapon Weap40 = new Weapon("Elven Sword", 26, new ImageIcon("./src/projectd/Image_Library/Swords/Elven_Sword.png"));
    static Weapon Weap41 = new Weapon("Blade", 80, new ImageIcon("./src/projectd/Image_Library/Swords/Blade_Sword.png"));
    static Weapon Weap42 = new Weapon("Rotern's Sword", 25, new ImageIcon("./src/projectd/Image_Library/Swords/Warcens_Sword.png"));
    static Weapon Weap43 = new Weapon("Imperial Sword", 21, new ImageIcon("./src/projectd/Image_Library/Swords/Imperial_Sword.png"));
    static Weapon Weap44 = new Weapon("Sea Sword", 33, new ImageIcon("./src/projectd/Image_Library/Swords/Sea_Sword.png"));
    static Weapon Weap45 = new Weapon("Mystery Sword", mys_sword, new ImageIcon("./src/projectd/Image_Library/Swords/Mystery_Sword.png"));
    static Weapon Weap46 = new Weapon("Carwen's Sword", 34, new ImageIcon("./src/projectd/Image_Library/Swords/Carwens_Sword.png"));
    static Weapon Weap47 = new Weapon("Soul Taker", 100, new ImageIcon("./src/projectd/Image_Library/Swords/SoulTaker_Sword.png"));
    
    
    Weapon(String name, int damage, ImageIcon sword){
        this.name = name;
        this.damage = damage;
        this.sword = sword;
    }
    
    public static Weapon rng_Weap(){
        Random rnd = new Random();
        int rn_w = rnd.nextInt(47) + 1;
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
            case 18:
                return Weap18;
            case 19:
                return Weap19;
            case 20:
                return Weap20;
            case 21:
                return Weap21;
            case 22:
                return Weap22;
            case 23:
                return Weap23;
            case 24:
                return Weap24;
            case 25:
                return Weap25;
            case 26:
                return Weap26;
            case 27:
                return Weap27;
            case 28:
                return Weap28;
            case 29:
                return Weap29;
            case 30:
                return Weap30;
            case 31:
                return Weap31;
            case 32:
                return Weap32;
            case 33:
                return Weap33;
            case 34:
                return Weap34;
            case 35:
                return Weap35;
            case 36:
                return Weap36;
            case 37:
                return Weap37;
            case 38:
                return Weap38;
            case 39:
                return Weap39;
            case 40:
                return Weap40;
            case 41:
                return Weap41;
            case 42:
                return Weap42;
            case 43:
                return Weap43;
            case 44:
                return Weap44;
            case 45:
                return Weap45;
            case 46:
                return Weap46;
            case 47:
                return Weap47;
            default:
                return Weap1;
        }
    }
    
    //toDO one method to return a default Weapon
    
}
