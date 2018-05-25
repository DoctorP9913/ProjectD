package projectd;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author DoctorP
 */
public class Enemies {
    
    public String name;
    public int health;
    public int damage;
    public int experience;
    public int gold;
    String enemyIdle;
    ImageIcon enemyDamaged = new ImageIcon();
    String enemyHit;
    
    //Icons:
    
        //Chinese King
        static String en12_0 = "/src/projectd/Image_Library/Enemies/ChineseIdle.gif";
        static ImageIcon en12_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/ChineseKingDamaged.png");
        static String en12_2 = "/src/projectd/Image_Library/Enemies/ChineseKingHit.gif";
        
        //Alien Warior
        static String en9_0 = "/src/projectd/Image_Library/Enemies/AlienWarior.gif";
        static ImageIcon en9_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/2_4.png");
        static String en9_2 = "/src/projectd/Image_Library/Enemies/2_3.gif";

        //Tiny Mummy
        static String en7_0 = "/src/projectd/Image_Library/Enemies/TinyMummyIdle.gif";
        static ImageIcon en7_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/TinyMummy_4.png");
        static String en7_2 = "/src/projectd/Image_Library/Enemies/TinyMummyHit.gif";
        
        //Alen the Alien
        static String en24_0 = "/src/projectd/Image_Library/Enemies/AlienIdle.gif";
        static ImageIcon en24_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/Alien6.png");
        static String en24_2 = "/src/projectd/Image_Library/Enemies/AlienHit.gif";
        
        //Skips
        static String en3_0 = "/src/projectd/Image_Library/Enemies/SkipsIdle.gif";
        static ImageIcon en3_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/Skips6.png");
        static String en3_2 = "/src/projectd/Image_Library/Enemies/SkipsHit.gif";
        
        //Android
        static String en14_0 = "/src/projectd/Image_Library/Enemies/AndroidIdle.gif";
        static ImageIcon en14_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/Android6.png");
        static String en14_2 = "/src/projectd/Image_Library/Enemies/AndroidHit.gif";
        
        //Almost a Pokemon
        static String en20_0 = "/src/projectd/Image_Library/Enemies/AlmostPokemonIdle.gif";
        static ImageIcon en20_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/Almost_Pokemon6.png");
        static String en20_2 = "/src/projectd/Image_Library/Enemies/AlmostPokemonHit.gif";
        
        //Darkness Knight
        static String en26_0 = "/src/projectd/Image_Library/Enemies/DarknessKnightIdle.gif";
        static ImageIcon en26_1 = new ImageIcon("./src/projectd/Image_Library/Enemies/DarknessKnight6.png");
        static String en26_2 = "/src/projectd/Image_Library/Enemies/DarknessKnightHit.gif";
        
    //dem enemies
    //static Enemies en1 = new Enemies("Harambe",800,40,2000,500,new ImageIcon("./src/projectd/Image_Library/Enemies/Harambe.jpg"));
   // static Enemies en2 = new Enemies("Zombie Farmer",80,18,100,25,new ImageIcon("./src/projectd/Image_Library/Enemies/ZombieFarmer.png"));
    static Enemies en3 = new Enemies("Skips",(int)(NewGame.Max_Health), (int)(NewGame.Max_Health*0.23),300,195,en3_0,en3_1,en3_2);
   // static Enemies en4 = new Enemies("Zombie Warior",120,23,150,35,new ImageIcon("./src/projectd/Image_Library/Enemies/ZombieWarior.png"));
  //  static Enemies en5 = new Enemies("Raptor",100,40,220,55,new ImageIcon("./src/projectd/Image_Library/Enemies/Raptor.png"));
  //  static Enemies en6 = new Enemies("Robot",220,30,210,50,new ImageIcon("./src/projectd/Image_Library/Enemies/Robot.png"));
    static Enemies en7 = new Enemies("Tiny Mummy",(int)(NewGame.Max_Health*0.6),(int)(NewGame.Max_Health*0.09),160,128,en7_0,en7_1,en7_2);
  //  static Enemies en8 = new Enemies("Army Zombie",140,23,170,29,new ImageIcon("./src/projectd/Image_Library/Enemies/ZombieZ.png"));
    static Enemies en9 = new Enemies("Alien Warior",(int)(NewGame.Max_Health*0.95),(int)(NewGame.Max_Health*0.13),240,170,en9_0,en9_1,en9_2);
  //  static Enemies en10 = new Enemies("Bokiblin",190,33,200,50,new ImageIcon("./src/projectd/Image_Library/Enemies/Bokiblin.png"));
  //  static Enemies en11 = new Enemies("Zombie Exposed",100,21,120,26,new ImageIcon("./src/projectd/Image_Library/Enemies/ExposedZ.png"));
    static Enemies en12 = new Enemies("Chinese King",(int)(NewGame.Max_Health*0.95),(int)(NewGame.Max_Health*0.14),280,158,en12_0,en12_1,en12_2);
 //   static Enemies en13 = new Enemies("Executioner",150,35,350,70,new ImageIcon("./src/projectd/Image_Library/Enemies/Executioner.png"));
    static Enemies en14 = new Enemies("Android",(int)(NewGame.Max_Health*2.5),(int)(NewGame.Max_Health*0.25),700,275,en14_0,en14_1,en14_2);
  //  static Enemies en15 = new Enemies("Chieftan",300,43,550,138,new ImageIcon("./src/projectd/Image_Library/Enemies/Chieftan.png"));
  //  static Enemies en16 = new Enemies("Goglla",700,57,800,200,new ImageIcon("./src/projectd/Image_Library/Enemies/Goglla.png"));
  //  static Enemies en17 = new Enemies("Ghost Enex",200,25,200,50,new ImageIcon("./src/projectd/Image_Library/Enemies/GhostEnex.png"));
 //   static Enemies en18 = new Enemies("Goblin",130,47,100,25,new ImageIcon("./src/projectd/Image_Library/Enemies/Goblin.png"));
  //  static Enemies en19 = new Enemies("Jack O' Lantern",1000,87,1800,450,new ImageIcon("./src/projectd/Image_Library/Enemies/JackOLantern.png"));
    static Enemies en20 = new Enemies("Almost a Pokemon",(int)(NewGame.Max_Health*1.5),(int)(NewGame.Max_Health*0.37),270,168,en20_0,en20_1,en20_2);
  //  static Enemies en21 = new Enemies("Nightmare",650,49,333,83,new ImageIcon("./src/projectd/Image_Library/Enemies/Nightmare.png"));
 //   static Enemies en22 = new Enemies("Trippy",80,55,80,20,new ImageIcon("./src/projectd/Image_Library/Enemies/Trippy.png"));
 //   static Enemies en23 = new Enemies("Ogre",400,44,400,100,new ImageIcon("./src/projectd/Image_Library/Enemies/ogre.png"));
    static Enemies en24 = new Enemies("Alen the Alien",(int)(NewGame.Max_Health*0.8),(int)(NewGame.Max_Health*0.20),190,148,en24_0,en24_1,en24_2);
 //   static Enemies en25 = new Enemies("Dungeon Guard",180,12,210,53,new ImageIcon("./src/projectd/Image_Library/Enemies/DungeonGuard.png"));
    static Enemies en26 = new Enemies("Darkness Knight",(int)(NewGame.Max_Health*1.75),(int)(NewGame.Max_Health*0.16),347,187,en26_0,en26_1,en26_2);
  //  static Enemies en27 = new Enemies("JackThug",140,16,290,73,new ImageIcon("./src/projectd/Image_Library/Enemies/JackThug.png"));
    
    Enemies(String name, int health, int damage,int experience,int gold, String enemyIdle, ImageIcon enemyDamaged, String enemyHit){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.experience = experience;
        this.gold = gold;
        this.enemyIdle = enemyIdle;
        this.enemyDamaged = enemyDamaged;
        this.enemyHit = enemyHit;
    }
    
    Enemies(){
        
    }
    
    public static Enemies get_Enemy(){
        Random r1 = new Random();
        int rnd = r1.nextInt(8) + 1;
        switch(rnd){
    //        case 1:
     //           return en1;
     //       case 2:
     //           return en2;
            case 4:
                  return en3;
     //       case 4:
     //           return en4;
     //       case 5:
     ///          return en5;
     //       case 6:
      //          return en6;
            case 3:
                  return en7;
     //       case 8:
     //           return en8;
            case 1:
                return en9;
     //       case 10:
     //           return en10;
     //       case 11:
     //           return en11;
            case 2:
                return en12;
     //       case 13:
     //           return en13;
            case 6:
                return en14;
     //       case 15:
     //           return en15;
     //       case 16:
     //           return en16;
     //       case 17:
     //           return en17;
     //       case 18:
     //           return en18;
     //       case 19:
     //           return en19;
            case 7:
                return en20;
     //       case 21:
     //           return en21;
     //       case 22:
     //           return en22;
     //       case 23:
      //          return en23;
            case 5:
                return en24;
    //        case 25:
    //            return en25;
            case 8:
                return en26;
    //        case 27:
    //            return en27;
            default:
                return en12;
        }
    }
    
}
