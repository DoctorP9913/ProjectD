/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

/**
 *
 * @author DoctorP
 */
class NewGame {
    
    //de char variables
    public static double Health;
    public static double Max_Health;
    public static int Damage;
    public static int Experience;
    public static int armor;
    public static int Char_Level = 1;
    public static int Room_Num = 1;
    public static int Exp_Level = 500;
    public final int Exp_NextLevel = Exp_Level + (Exp_Level / 2);      //this shit might create logical bugs!
    
}
