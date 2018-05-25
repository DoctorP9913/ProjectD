/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Harambe.java
 *
 * Created on Nov 7, 2016, 2:09:37 PM
 */
package projectd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author DoctorP
 */
public class Harambe extends javax.swing.JFrame {

    /** Creates new form Harambe */
    public Harambe() {
        initComponents();
    }
    
    String Version = "Build(0.26F(EB))";
    
    //de equipment
    private Weapon weapon_equiped;
    private Weapon weapon_dropped;
    private Shield Shield_equiped;
    private Shield Shield_dropped;
    private Helmet Helmet_equiped;
    private Helmet Helmet_dropped;
    private Armor Armor_equiped;
    private Armor Armor_dropped;
    
    //de flags
    private boolean drop_isWeapon;
    private boolean drop_isShield;
    private boolean drop_isHelmet;
    private boolean drop_isArmor;
    
    NewGame player = new NewGame();
    Enemies t1 = new Enemies();
    
    Enemies en1 = new Enemies();
    
    //misc Variables
    
        Weapon tempdropW;
        Shield tempdropS;
        Helmet tempdropH;
        Armor tempdropA;
        
        ImageIcon DropChest = new ImageIcon("./src/projectd/Image_Library/chest.png");
        
        int roomNum = 1;
    
        int enemyDamage = 0;
        int gold = 0;
        
    public void Level_Up() {
        
        XP_Bar.setValue(0);
        player.Damage += player.Damage / 10;
        XP_Bar.setMaximum(player.Exp_NextLevel);
        double ad_Health = player.Max_Health / 10;
        player.Health += ad_Health;
        player.Max_Health += ad_Health;
        player.armor += player.armor / 20;
        Max_Health.setText(Double.toString((int)player.Max_Health));
        Health_Bar.setMaximum((int)player.Max_Health);
        Health_Bar.setValue((int)player.Max_Health);
        Health_Bar.setString(Double.toString((int)player.Health));
        player.Exp_Level = player.Exp_NextLevel;
        player.Char_Level++;
        Level_num.setText(Integer.toString(player.Char_Level));
        Player_Damage.setText(Integer.toString(player.Damage));
        ArmorValue.setText(Integer.toString(player.armor));
        
    }
    
    public void rng_drop(){
        Random r1 = new Random();
        int rnd = r1.nextInt(99) + 1;
        if(rnd < 35 && rnd >= 1){
            get_drop();
            jFrame1.setVisible(true);
        }
    }
    
    public void get_drop() {
        Random rnd1 = new Random();
        int rnd = rnd1.nextInt(4) + 1;
        //reseting the flags
        drop_isWeapon = false;
        drop_isShield = false;
        drop_isHelmet = false;
        drop_isArmor = false;
        String eq;
        switch (rnd) {
            case 1:
                {
                    tempdropW = Weapon.rng_Weap();
                    if(tempdropW.damage<weapon_equiped.damage){
                        eq = String.valueOf(tempdropW.damage - weapon_equiped.damage);
                        lbDropStatEQ.setForeground(Color.red);
                    } else {
                        eq ="+" + String.valueOf(tempdropW.damage - weapon_equiped.damage);
                        lbDropStatEQ.setForeground(Color.green);
                    }
                    lbDropName.setText(tempdropW.name);
                    DropDropIcon.setIcon(tempdropW.sword);
                    DropDropIcon.setToolTipText(tempdropW.name);
                    lbDropStatNum.setText(String.valueOf(tempdropW.damage));
                    lbDropStat.setText("Damage:");
                    lbDropStatEQ.setText(eq);
                    drop_isWeapon = true;
                    break;
                }
            case 2:
                {
                    tempdropS = Shield.rng_Shield();
                    if(tempdropS.armor<Shield_equiped.armor){
                        eq = String.valueOf(tempdropS.armor - Shield_equiped.armor);
                        lbDropStatEQ.setForeground(Color.red);
                    } else {
                        eq ="+" + String.valueOf(tempdropS.armor - Shield_equiped.armor);
                        lbDropStatEQ.setForeground(Color.green);
                    }
                    lbDropName.setText(tempdropS.name);
                    DropDropIcon.setIcon(tempdropS.shield);
                    DropDropIcon.setToolTipText(tempdropS.name);
                    lbDropStatNum.setText(String.valueOf(tempdropS.armor));
                    lbDropStat.setText("Armor:");
                    lbDropStatEQ.setText(eq);
                    drop_isShield = true;
                    break;
                }
            case 3:
                {
                    tempdropH = Helmet.rng_Helmet();
                    if(tempdropH.armor<Helmet_equiped.armor){
                        eq = String.valueOf(tempdropH.armor - Helmet_equiped.armor);
                        lbDropStatEQ.setForeground(Color.red);
                    } else {
                        eq ="+" + String.valueOf(tempdropH.armor - Helmet_equiped.armor);
                        lbDropStatEQ.setForeground(Color.green);
                    }
                    lbDropName.setText(tempdropH.name);
                    DropDropIcon.setIcon(tempdropH.helmet);
                    DropDropIcon.setToolTipText(tempdropH.name);
                    lbDropStatNum.setText(String.valueOf(tempdropH.armor));
                    lbDropStat.setText("Armor:");
                    lbDropStatEQ.setText(eq);
                    drop_isHelmet = true;
                    break;
                }
            case 4:
                {
                    tempdropA = Armor.rng_Armor();
                    if(tempdropA.armor_rating<Armor_equiped.armor_rating){
                        eq = String.valueOf(tempdropA.armor_rating - Armor_equiped.armor_rating);
                        lbDropStatEQ.setForeground(Color.red);
                    } else {
                        eq ="+" + String.valueOf(tempdropA.armor_rating - Armor_equiped.armor_rating);
                        lbDropStatEQ.setForeground(Color.green);
                    }
                    lbDropName.setText(tempdropA.name);
                    DropDropIcon.setIcon(tempdropA.armor);
                    DropDropIcon.setToolTipText(tempdropA.name);
                    lbDropStatNum.setText(String.valueOf(tempdropA.armor_rating));
                    lbDropStat.setText("Armor:");
                    lbDropStatEQ.setText(eq);
                    drop_isArmor = true;
                    break;
                }   
            default:
                {
                    tempdropA = Armor.rng_Armor();
                    DropDropIcon.setIcon(tempdropA.armor);
                    DropDropIcon.setToolTipText(tempdropA.name);
                    lbDropStat.setText("Armor:");
                    drop_isArmor = true;
                    break;
                }
        }
    }
    
    public int get_Damage(){
        int ret_damage = enemyDamage - (player.armor / 10);
        if(ret_damage < 0) ret_damage = 1;
        return ret_damage;
    }
    
    public void Equip() {
        
        if(drop_isWeapon){
            Weapon equipdrop = tempdropW;
            Slot_Weapon.setIcon(equipdrop.sword);
            Slot_Weapon.setToolTipText(equipdrop.name);
            player.Damage += equipdrop.damage;
            Player_Damage.setText(Integer.toString(player.Damage));
            
        } else if(drop_isShield){
            Shield equipdrop = tempdropS;
            Slot_Shield.setIcon(equipdrop.shield);
            Slot_Shield.setToolTipText(equipdrop.name);
            player.armor = player.armor - Shield_equiped.armor;
            player.armor+=equipdrop.armor;
            ArmorValue.setText(Integer.toString(player.armor));
        } else if(drop_isHelmet){
            Helmet equipdrop = tempdropH;
            Slot_Helmet.setIcon(equipdrop.helmet);
            Slot_Shield.setToolTipText(equipdrop.name);
            player.armor = player.armor - Helmet_equiped.armor;
            player.armor+=equipdrop.armor;
            ArmorValue.setText(Integer.toString(player.armor));
        } else {
            Armor equipdrop = tempdropA;
            Slot_Armor.setIcon(equipdrop.armor);
            Slot_Armor.setToolTipText(equipdrop.name);
            player.armor = player.armor - Armor_equiped.armor_rating;
            player.armor+=equipdrop.armor_rating;
            ArmorValue.setText(Integer.toString(player.armor));
        }
        
    }
    
    public void start_game(){
        do{
        }while(NewGame.Health>0);
        
    }
    
    public void get_Igif(){
            try{
                URL qq = new URL(t1.enemyIdle);
                ImageIcon lel = new ImageIcon(qq);
                Slot_Enemy.setIcon(lel);
            }catch(MalformedURLException q1){
                ImageIcon qq = new ImageIcon("."+t1.enemyIdle);
                Slot_Enemy.setIcon(qq);
            }
    }
    
    public void get_CIgif(){
            try{
                URL qq = new URL("/src/projectd/Image_Library/CharIdle.gif");
                ImageIcon lel = new ImageIcon(qq);
                Slot_Player.setIcon(lel);
            }catch(MalformedURLException q1){
                ImageIcon qq = new ImageIcon("./src/projectd/Image_Library/CharIdle.gif");
                Slot_Player.setIcon(qq);
            }
    }
    
    public void get_CHgif(){
            try{
                URL qq = new URL("/src/projectd/Image_Library/CharHit.gif");
                ImageIcon lel = new ImageIcon(qq);
                Slot_Player.setIcon(lel);
            }catch(MalformedURLException q1){
                ImageIcon qq = new ImageIcon("./src/projectd/Image_Library/CharHit.gif");
                Slot_Player.setIcon(qq);
            }
    }
    
    public void get_Hgif(){
            try{
                URL qq = new URL(t1.enemyHit);
                ImageIcon lel = new ImageIcon(qq);
                Slot_Enemy.setIcon(lel);
            }catch(MalformedURLException q1){
                ImageIcon qq = new ImageIcon("."+t1.enemyHit);
                Slot_Enemy.setIcon(qq);
            }
    }
    
    public ImageIcon getHit(){
        return t1.enemyDamaged;
    }
    
    public void setup_Enemy(){
        
            //setup Enemy
            t1 = Enemies.get_Enemy();
            en1 = t1;
            get_Igif();
            Enemy_HealthBar.setMaximum(t1.health);
            Enemy_HealthBar.setValue(t1.health);
            Enemy_HealthBar.setStringPainted(true);
            Enemy_HealthBar.setString(Integer.toString(t1.health));
            LB_EnemyName.setText(t1.name);
            enemyDamage = t1.damage;
            gold = t1.gold;
               // do{
             //       try{
              //          Slot_Enemy.setIcon(t1.enemy1);
              //          wait(300);
             //           Slot_Enemy.setIcon(t1.enemy2);
              //          wait(300);
              //          Slot_Enemy.setIcon(t1.enemy3);
             //           wait(300);
            // /       }catch(InterruptedException q1){
            //            
            //        }
            //    }while(Enemy_HealthBar.getValue()!=0);
            
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lbDropName = new javax.swing.JLabel();
        DropDropIcon = new javax.swing.JLabel();
        lbDropStatNum = new javax.swing.JLabel();
        lbDropStat = new javax.swing.JLabel();
        lbDropStatEQ = new javax.swing.JLabel();
        DropEquip = new javax.swing.JButton();
        DropKeep = new javax.swing.JButton();
        DropDropIcon1 = new javax.swing.JLabel();
        Drop_ChestBack = new javax.swing.JLabel();
        Drop_Background = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        PerkTab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buXPInc = new javax.swing.JButton();
        buHealthInc = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbGold = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buDamageInc = new javax.swing.JButton();
        buCritCInc = new javax.swing.JButton();
        buCritDInc = new javax.swing.JButton();
        buHealthRInc = new javax.swing.JButton();
        buGoldInc = new javax.swing.JButton();
        buArmorInc = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Slot_Weapon = new javax.swing.JLabel();
        Slot_Helmet = new javax.swing.JLabel();
        Slot_Shield = new javax.swing.JLabel();
        Slot_Armor = new javax.swing.JLabel();
        Slot_Player = new javax.swing.JLabel();
        Player_Health = new javax.swing.JLabel();
        Slot_Enemy = new javax.swing.JLabel();
        Enemy_Health = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Room_num = new javax.swing.JLabel();
        Player_Level = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LB_PlayerDamage = new javax.swing.JLabel();
        LB_PlayerHealth = new javax.swing.JLabel();
        LB_Armor = new javax.swing.JLabel();
        Max_Health = new javax.swing.JLabel();
        Player_Damage = new javax.swing.JLabel();
        ArmorValue = new javax.swing.JLabel();
        XP_Bar = new javax.swing.JProgressBar();
        Health_Bar = new javax.swing.JProgressBar();
        Enemy_HealthBar = new javax.swing.JProgressBar();
        LB_Stats = new javax.swing.JLabel();
        test_drop = new javax.swing.JButton();
        LB_Version = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LB_EnemyName = new javax.swing.JLabel();
        Level_num = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();
        testWindow = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbGoldAmount = new javax.swing.JLabel();
        lbFullBg = new javax.swing.JLabel();

        jFrame1.setTitle("You got a random drop!");
        jFrame1.setAlwaysOnTop(true);
        jFrame1.setLocation(new java.awt.Point(500, 200));
        jFrame1.setMinimumSize(new java.awt.Dimension(466, 288));
        jFrame1.setName("You got a Random Drop!"); // NOI18N
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(466, 288));
        jFrame1.getContentPane().setLayout(null);

        lbDropName.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbDropName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDropName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jFrame1.getContentPane().add(lbDropName);
        lbDropName.setBounds(55, 0, 340, 50);

        DropDropIcon.setBackground(new java.awt.Color(240, 213, 106));
        DropDropIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/Backgrounds/Drop_DropB.png"))); // NOI18N
        DropDropIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        DropDropIcon.setPreferredSize(new java.awt.Dimension(70, 70));
        jFrame1.getContentPane().add(DropDropIcon);
        DropDropIcon.setBounds(190, 130, 70, 70);
        jFrame1.getContentPane().add(lbDropStatNum);
        lbDropStatNum.setBounds(390, 110, 30, 20);
        jFrame1.getContentPane().add(lbDropStat);
        lbDropStat.setBounds(330, 110, 70, 20);
        jFrame1.getContentPane().add(lbDropStatEQ);
        lbDropStatEQ.setBounds(420, 110, 40, 20);

        DropEquip.setText("Equip");
        DropEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropEquipActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(DropEquip);
        DropEquip.setBounds(190, 90, 70, 23);

        DropKeep.setText("Don't Equip");
        DropKeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropKeepActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(DropKeep);
        DropKeep.setBounds(165, 220, 120, 23);

        DropDropIcon1.setBackground(new java.awt.Color(240, 213, 106));
        DropDropIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/Backgrounds/Drop_DropB.png"))); // NOI18N
        DropDropIcon1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        DropDropIcon1.setPreferredSize(new java.awt.Dimension(70, 70));
        jFrame1.getContentPane().add(DropDropIcon1);
        DropDropIcon1.setBounds(190, 130, 70, 70);

        Drop_ChestBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Drop_ChestBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/treasure.png"))); // NOI18N
        jFrame1.getContentPane().add(Drop_ChestBack);
        Drop_ChestBack.setBounds(88, 30, 271, 230);

        Drop_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/Backgrounds/Drop_Background.jpg"))); // NOI18N
        jFrame1.getContentPane().add(Drop_Background);
        Drop_Background.setBounds(0, 0, 490, 280);

        jFrame2.setMinimumSize(new java.awt.Dimension(666, 389));
        jFrame2.setResizable(false);
        jFrame2.setSize(new java.awt.Dimension(666, 389));
        jFrame2.getContentPane().setLayout(null);

        PerkTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        PerkTab.setMinimumSize(new java.awt.Dimension(666, 389));
        PerkTab.setPreferredSize(new java.awt.Dimension(666, 389));

        jPanel2.setMinimumSize(new java.awt.Dimension(661, 361));
        jPanel2.setLayout(null);

        jLabel16.setText("Increase your character's");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 170, 160, 14);

        jLabel28.setText("Cost: 1500");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(510, 100, 60, 14);

        jLabel17.setText("armor.");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(30, 180, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Armor");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 150, 170, 50);

        jLabel18.setText("Increase your character's");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(30, 220, 150, 14);

        jLabel19.setText("damage.");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(30, 230, 50, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Damage");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 200, 170, 50);

        jLabel20.setText("Increase your character's");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(30, 270, 150, 14);

        jLabel21.setText("critical chance.");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(30, 280, 150, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Critical Chance");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 250, 170, 50);

        jLabel22.setText("Increase your character's");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(30, 320, 150, 14);

        jLabel23.setText("critical damage.");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(30, 330, 150, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Critical Damage");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 300, 170, 50);

        jLabel24.setText("Increase the amount of gold");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(350, 70, 136, 14);

        jLabel25.setText("gained per enemy.");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(350, 80, 130, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Health Regen");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 100, 170, 50);

        jLabel26.setText("Increase the amount of gold");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(350, 120, 150, 14);

        jLabel27.setText("gained per enemy.");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(350, 130, 110, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Gold Gain");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(340, 100, 170, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("XP Gain");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(340, 50, 170, 50);

        jLabel11.setText("health.");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 80, 60, 20);

        jLabel2.setText("Increase your character's");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 70, 150, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Health");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 50, 170, 50);

        buXPInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buXPInc.setText("+");
        buXPInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buXPIncActionPerformed(evt);
            }
        });
        jPanel2.add(buXPInc);
        buXPInc.setBounds(510, 64, 43, 25);

        buHealthInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buHealthInc.setText("+");
        buHealthInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buHealthIncActionPerformed(evt);
            }
        });
        jPanel2.add(buHealthInc);
        buHealthInc.setBounds(190, 65, 43, 25);

        jLabel14.setText("Increase the amount of health");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 120, 160, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("GOLD");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(330, 10, 60, 30);
        jPanel2.add(lbGold);
        lbGold.setBounds(400, 10, 60, 30);

        jLabel15.setText("you gain per room.");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(30, 130, 160, 14);

        buDamageInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buDamageInc.setText("+");
        buDamageInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buDamageIncActionPerformed(evt);
            }
        });
        jPanel2.add(buDamageInc);
        buDamageInc.setBounds(190, 215, 43, 25);

        buCritCInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buCritCInc.setText("+");
        buCritCInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCritCIncActionPerformed(evt);
            }
        });
        jPanel2.add(buCritCInc);
        buCritCInc.setBounds(190, 265, 43, 25);

        buCritDInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buCritDInc.setText("+");
        buCritDInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCritDIncActionPerformed(evt);
            }
        });
        jPanel2.add(buCritDInc);
        buCritDInc.setBounds(190, 315, 43, 25);

        buHealthRInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buHealthRInc.setText("+");
        buHealthRInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buHealthRIncActionPerformed(evt);
            }
        });
        jPanel2.add(buHealthRInc);
        buHealthRInc.setBounds(190, 114, 43, 25);

        buGoldInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buGoldInc.setText("+");
        buGoldInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buGoldIncActionPerformed(evt);
            }
        });
        jPanel2.add(buGoldInc);
        buGoldInc.setBounds(510, 115, 43, 25);

        buArmorInc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buArmorInc.setText("+");
        buArmorInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buArmorIncActionPerformed(evt);
            }
        });
        jPanel2.add(buArmorInc);
        buArmorInc.setBounds(190, 165, 43, 25);

        jLabel29.setText("Cost: 500");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(190, 150, 60, 14);

        jLabel30.setText("Cost: 500");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(190, 200, 60, 14);

        jLabel31.setText("Cost: 600");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(190, 250, 60, 14);

        jLabel32.setText("Cost: 900");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(190, 300, 60, 14);

        jLabel33.setText("Cost: 1200");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(510, 50, 60, 14);

        jLabel34.setText("Cost: 400");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(190, 100, 60, 14);

        jLabel35.setText("Cost: 300");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(190, 50, 60, 14);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/Backgrounds/fullbg.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(-50, -10, 710, 410);

        PerkTab.addTab("Skills", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        PerkTab.addTab("Perks", jPanel3);

        jFrame2.getContentPane().add(PerkTab);
        PerkTab.setBounds(0, 0, 666, 389);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setPreferredSize(new java.awt.Dimension(950, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(950, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Slot_Weapon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(Slot_Weapon);
        Slot_Weapon.setBounds(43, 95, 70, 70);

        Slot_Helmet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(Slot_Helmet);
        Slot_Helmet.setBounds(43, 247, 70, 70);

        Slot_Shield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(Slot_Shield);
        Slot_Shield.setBounds(43, 171, 70, 70);

        Slot_Armor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(Slot_Armor);
        Slot_Armor.setBounds(43, 323, 70, 70);
        getContentPane().add(Slot_Player);
        Slot_Player.setBounds(131, 95, 200, 266);

        Player_Health.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player_Health.setText("Health: ");
        getContentPane().add(Player_Health);
        Player_Health.setBounds(131, 55, 154, 14);

        Slot_Enemy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(Slot_Enemy);
        Slot_Enemy.setBounds(439, 95, 440, 274);

        Enemy_Health.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Enemy_Health.setText("Health: ");
        getContentPane().add(Enemy_Health);
        Enemy_Health.setBounds(667, 55, 212, 14);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(435, 20, 90, 24);

        Room_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Room_num);
        Room_num.setBounds(450, 35, 56, 26);

        Player_Level.setText("Level");
        getContentPane().add(Player_Level);
        Player_Level.setBounds(62, 35, 30, 14);

        jPanel1.setBackground(new java.awt.Color(253, 255, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setPreferredSize(new java.awt.Dimension(138, 105));

        LB_PlayerDamage.setText("Player Damage:");

        LB_PlayerHealth.setText("Max Health:");

        LB_Armor.setText("Armor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_PlayerHealth)
                    .addComponent(LB_PlayerDamage)
                    .addComponent(LB_Armor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Max_Health, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Player_Damage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArmorValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LB_PlayerHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Max_Health, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LB_PlayerDamage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player_Damage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LB_Armor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArmorValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(43, 427, 166, 80);

        XP_Bar.setString("XP");
        XP_Bar.setStringPainted(true);
        getContentPane().add(XP_Bar);
        XP_Bar.setBounds(131, 376, 154, 17);

        Health_Bar.setStringPainted(true);
        getContentPane().add(Health_Bar);
        Health_Bar.setBounds(131, 75, 154, 17);

        Enemy_HealthBar.setStringPainted(true);
        getContentPane().add(Enemy_HealthBar);
        Enemy_HealthBar.setBounds(667, 75, 212, 17);

        LB_Stats.setText("Stats");
        getContentPane().add(LB_Stats);
        LB_Stats.setBounds(43, 404, 40, 14);

        test_drop.setText("Hit");
        test_drop.setEnabled(false);
        test_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_dropActionPerformed(evt);
            }
        });
        getContentPane().add(test_drop);
        test_drop.setBounds(559, 412, 110, 23);

        LB_Version.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Version.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LB_VersionFocusGained(evt);
            }
        });
        getContentPane().add(LB_Version);
        LB_Version.setBounds(729, 495, 210, 16);

        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(438, 67, 90, 23);

        LB_EnemyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LB_EnemyName);
        LB_EnemyName.setBounds(667, 375, 212, 18);
        getContentPane().add(Level_num);
        Level_num.setBounds(93, 35, 34, 14);

        lbBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 112, 54), 3));
        getContentPane().add(lbBackground);
        lbBackground.setBounds(130, 90, 750, 280);

        testWindow.setText("Skills/Perks");
        testWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testWindowActionPerformed(evt);
            }
        });
        getContentPane().add(testWindow);
        testWindow.setBounds(560, 450, 110, 23);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("GOLD");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(750, 420, 39, 17);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/gold.png"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(710, 410, 50, 30);

        lbGoldAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbGoldAmount);
        lbGoldAmount.setBounds(800, 418, 80, 20);

        lbFullBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectd/Image_Library/Backgrounds/fullbg.jpg"))); // NOI18N
        getContentPane().add(lbFullBg);
        lbFullBg.setBounds(0, 0, 950, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void test_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_dropActionPerformed
        
        if(test_drop.getText().equals("Hit")){
            if(Enemy_HealthBar.getValue()>0){
        if(test_drop.getText().equalsIgnoreCase("hit"))get_CHgif();
        ActionListener ac1 = new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                if(Enemy_HealthBar.getValue()>0&&Health_Bar.getValue()>0){
                    get_CIgif();
                    get_Hgif();
                }
            }
        };
        ActionListener ac2 = new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                get_Igif();
                get_CIgif();
            }
        };
        ActionListener ac3 = new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                if(Health_Bar.getValue()>0)test_drop.setEnabled(true);
                if(Enemy_HealthBar.getValue()>0 && Health_Bar.getValue()>0){
                    Health_Bar.setValue(Health_Bar.getValue() - get_Damage());
                    Slot_Player.setIcon(new ImageIcon("./src/projectd/Image_Library/Char6.png"));
                    Health_Bar.setStringPainted(true);
                    Health_Bar.setString(Integer.toString(Health_Bar.getValue()));
                    if(Health_Bar.getValue()<=0){
                        Health_Bar.setString("DEAD");
                        test_drop.setEnabled(false);
                        jButton1.setEnabled(true);
                        
                    }
                }
            }
        };
                int hit_enemyHealth = Enemy_HealthBar.getValue() - Integer.parseInt(Player_Damage.getText());
                Random crit = new Random();
                int crit1 = crit.nextInt(100)+1;
                if(NewGame.crit_chance >= crit1 && NewGame.crit_chance!=0){
                    Enemy_HealthBar.setValue(Enemy_HealthBar.getValue() - NewGame.crit_damage_Multi*(Integer.parseInt(Player_Damage.getText())));
                    Enemy_HealthBar.setString(Integer.toString(Enemy_HealthBar.getValue()));
                } else{
                    Enemy_HealthBar.setValue(Enemy_HealthBar.getValue() - Integer.parseInt(Player_Damage.getText()));
                    Enemy_HealthBar.setString(Integer.toString(Enemy_HealthBar.getValue()));
                }
                int hit_playerHealth = Health_Bar.getValue() - get_Damage();
                test_drop.setEnabled(false);
                Timer tim1 = new Timer(600,ac1);
                Timer tim2 = new Timer(3000,ac2);
                Timer tim3 = new Timer(2500,ac3);
                tim1.setRepeats(false);
                tim2.setRepeats(false);
                tim3.setRepeats(false);
                Slot_Enemy.setIcon(getHit());
                    tim1.start();
                    tim2.start();
                    tim3.start();
                    if(Health_Bar.getValue()<=0){
                        Health_Bar.setString("DEAD");
                        test_drop.setEnabled(false);
                        jButton1.setEnabled(true);
                }
                if(Enemy_HealthBar.getValue() <= 0){
                    if(Health_Bar.getValue()>0){
                        rng_drop(); 
                        NewGame.gold += (gold*NewGame.gold_Multi);
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
                        Health_Bar.setValue(Health_Bar.getValue() + ((int)NewGame.Health_regen));
                        Health_Bar.setString(Integer.toString(Health_Bar.getValue()));
                        int xp = XP_Bar.getValue();
                        xp += (en1.experience*NewGame.XP_Multi);
                        XP_Bar.setValue(xp);
                        if(XP_Bar.getValue() == XP_Bar.getMaximum())Level_Up();
                        test_drop.setText("Next Battle");
                    }
                }
            } else {
                test_drop.setText("Next Battle");
                
            }
        } else {
                setup_Enemy();
                roomNum++;
                Room_num.setText(Integer.toString(roomNum));
                test_drop.setText("Hit");
            
        }
       
    }//GEN-LAST:event_test_dropActionPerformed

    private void LB_VersionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LB_VersionFocusGained
        
    }//GEN-LAST:event_LB_VersionFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LB_Version.setText(Version);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        test_drop.setEnabled(true);
        NewGame.Health = 200;
        NewGame.Max_Health = 200;
        NewGame.Damage = 0;
        NewGame.armor = 0;
        NewGame.gold = 0;
        NewGame.crit_chance=0;
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
            Level_num.setText("1");
            test_drop.setText("Hit");
            XP_Bar.setMaximum(500);
            XP_Bar.setValue(0);
            Health_Bar.setMaximum((int) NewGame.Max_Health);
            Health_Bar.setValue((int)NewGame.Health);
            Health_Bar.setStringPainted(true);
            Health_Bar.setString(Integer.toString(Health_Bar.getValue()));
            Player_Damage.setText(Integer.toString(NewGame.Damage));
            Max_Health.setText(Double.toString((int)NewGame.Health));
            ArmorValue.setText(Integer.toString(NewGame.armor));
            setup_Enemy();
            get_CIgif();
            lbBackground.setIcon(new ImageIcon("./src/projectd/Image_Library/Backgrounds/park1.png"));
        jButton1.setEnabled(false);
        test_drop.setEnabled(true);
        roomNum = 1;
        Room_num.setText(Integer.toString(roomNum));
        //Weapon
        Weapon w1 = Weapon.rng_Weap();
        weapon_equiped = w1;
        Slot_Weapon.setIcon(w1.sword);
        Slot_Weapon.setToolTipText(w1.name);
        NewGame.Damage += w1.damage;
        //Shield
        Shield s1 = Shield.rng_Shield();
        Shield_equiped = s1;
        Slot_Shield.setIcon(s1.shield);
        Slot_Shield.setToolTipText(s1.name);
        NewGame.armor += s1.armor;
        //Helmet
        Helmet h1 = Helmet.rng_Helmet();
        Helmet_equiped = h1;
        Slot_Helmet.setIcon(h1.helmet);
        Slot_Helmet.setToolTipText(h1.name);
        NewGame.armor += h1.armor;
        //Armor
        Armor a1 = Armor.rng_Armor();
        Armor_equiped = a1;
        Slot_Armor.setIcon(a1.armor);
        Slot_Armor.setToolTipText(a1.name);
        NewGame.armor += a1.armor_rating;
        
        Max_Health.setText(Double.toString(NewGame.Max_Health));
        Player_Damage.setText(Integer.toString(NewGame.Damage));
        ArmorValue.setText(Integer.toString(NewGame.armor));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void testWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testWindowActionPerformed
        jFrame2.setVisible(true);
    }//GEN-LAST:event_testWindowActionPerformed

    private void DropEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropEquipActionPerformed
        if(DropDropIcon.getIcon()!=new ImageIcon("./src/projectd/Image_Library/Backgrounds/Drop_DropB.png")){
            Equip();
            jFrame1.setVisible(false);
        }
    }//GEN-LAST:event_DropEquipActionPerformed

    private void DropKeepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropKeepActionPerformed
        jFrame1.setVisible(false);
    }//GEN-LAST:event_DropKeepActionPerformed

    private void buHealthIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buHealthIncActionPerformed
        if(NewGame.gold>=300){
            NewGame.gold-=300;
            NewGame.Health+=(NewGame.Health*0.1);
            Health_Bar.setMaximum((int)NewGame.Health);
            Max_Health.setText(String.valueOf(NewGame.Health));
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buHealthIncActionPerformed

    private void buHealthRIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buHealthRIncActionPerformed
        if(NewGame.gold>=400){
            NewGame.gold-=400;
            NewGame.Health_regen+=5;
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buHealthRIncActionPerformed

    private void buDamageIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buDamageIncActionPerformed
        if(NewGame.gold>=500){
            NewGame.gold-=500;
            NewGame.Damage+=(NewGame.Damage*0.1);
            Player_Damage.setText(String.valueOf(NewGame.Damage));
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buDamageIncActionPerformed

    private void buArmorIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buArmorIncActionPerformed
        if(NewGame.gold>=500){
            NewGame.gold-=500;
            NewGame.armor+=(NewGame.armor*0.1);
            ArmorValue.setText(String.valueOf(NewGame.armor));
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buArmorIncActionPerformed

    private void buCritCIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCritCIncActionPerformed
        if(NewGame.gold>=600){
            NewGame.gold-=600;
            NewGame.crit_chance+=5;
            ArmorValue.setText(String.valueOf(NewGame.armor));
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buCritCIncActionPerformed

    private void buCritDIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCritDIncActionPerformed
        if(NewGame.gold>=900){
            NewGame.gold-=900;
            NewGame.crit_damage_Multi+=1;
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buCritDIncActionPerformed

    private void buXPIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buXPIncActionPerformed
        if(NewGame.gold>=1200){
            NewGame.gold-=1200;
            NewGame.XP_Multi+=(NewGame.XP_Multi*0.4);
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buXPIncActionPerformed

    private void buGoldIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buGoldIncActionPerformed
        if(NewGame.gold>=1500){
            NewGame.gold-=1500;
            NewGame.gold_Multi+=(NewGame.gold_Multi*0.5);
                        lbGoldAmount.setText(String.valueOf(NewGame.gold));
                        lbGold.setText(String.valueOf(NewGame.gold));
        }
    }//GEN-LAST:event_buGoldIncActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Harambe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Harambe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Harambe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Harambe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final Harambe t1 = new Harambe();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                t1.setVisible(true);
            }
            
        });
            t1.start_game();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmorValue;
    private javax.swing.JLabel DropDropIcon;
    private javax.swing.JLabel DropDropIcon1;
    private javax.swing.JButton DropEquip;
    private javax.swing.JButton DropKeep;
    private javax.swing.JLabel Drop_Background;
    private javax.swing.JLabel Drop_ChestBack;
    private javax.swing.JLabel Enemy_Health;
    private javax.swing.JProgressBar Enemy_HealthBar;
    private javax.swing.JProgressBar Health_Bar;
    private javax.swing.JLabel LB_Armor;
    private javax.swing.JLabel LB_EnemyName;
    private javax.swing.JLabel LB_PlayerDamage;
    private javax.swing.JLabel LB_PlayerHealth;
    private javax.swing.JLabel LB_Stats;
    private javax.swing.JLabel LB_Version;
    private javax.swing.JLabel Level_num;
    private javax.swing.JLabel Max_Health;
    private javax.swing.JTabbedPane PerkTab;
    private javax.swing.JLabel Player_Damage;
    private javax.swing.JLabel Player_Health;
    private javax.swing.JLabel Player_Level;
    private javax.swing.JLabel Room_num;
    private javax.swing.JLabel Slot_Armor;
    private javax.swing.JLabel Slot_Enemy;
    private javax.swing.JLabel Slot_Helmet;
    private javax.swing.JLabel Slot_Player;
    private javax.swing.JLabel Slot_Shield;
    private javax.swing.JLabel Slot_Weapon;
    private javax.swing.JProgressBar XP_Bar;
    private javax.swing.JButton buArmorInc;
    private javax.swing.JButton buCritCInc;
    private javax.swing.JButton buCritDInc;
    private javax.swing.JButton buDamageInc;
    private javax.swing.JButton buGoldInc;
    private javax.swing.JButton buHealthInc;
    private javax.swing.JButton buHealthRInc;
    private javax.swing.JButton buXPInc;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbDropName;
    private javax.swing.JLabel lbDropStat;
    private javax.swing.JLabel lbDropStatEQ;
    private javax.swing.JLabel lbDropStatNum;
    private javax.swing.JLabel lbFullBg;
    private javax.swing.JLabel lbGold;
    private javax.swing.JLabel lbGoldAmount;
    private javax.swing.JButton testWindow;
    private javax.swing.JButton test_drop;
    // End of variables declaration//GEN-END:variables

}
