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
    public double Health;
    public double Max_Health;
    public int Damage;
    public int Experience;
    public int armor;
    public int Char_Level = 1;
    public int Room_Num = 1;
    public int Exp_Level = 500;
    public final int Exp_NextLevel = Exp_Level + (Exp_Level / 2);      //this shit might create logical bugs!
}
