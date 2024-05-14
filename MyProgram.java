public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        
        
            // VARIABLES
        String sRoll = "";
        String sShop = "";
        String sTree = "";
        String sPath = "";
        String sUpgrade = "";
        String sBuy = "";
        String sYesRebirth = "";
        String sRebirth = "";
        
        String sGauntOwned = " [Not Owned]";
        String sHelmOwned = " [Not Owned]";
        String sChestOwned = " [Not Owned]";
        String sLeggOwned = " [Not Owned]";
        String sBootOwned = " [Not Owned]";
        String sNeckOwned = " [Not Owned]";
        String sSockOwned = " [Not Owned]";
        String sMetJackOwned = " [Not Owned]";
        String sFullMetOwned = " [Not Owned]";
        
        boolean bCont = true;
        boolean bCheck = true;
        
        int iUpgrade1 = 0;
        int iUpgrade2 = 0;
        int iUpgrade3 = 0;
        int iFighter = 0;
        int iWizz = 0;
        int iCount = 0;
        int iCount2 = 0;
        int iCount3 = 0;
        int iOption = 0;
        int iLevel = 0;
        int iGaunt = 0;
        int iHelm = 0;
        int iChest = 0;
        int iLegg = 0;
        int iBoot = 0;
        int iNeck = 0;
        int iSock = 0;
        int iMetJack = 0;
        int iFullMet = 0;
        int iRebirth = 0;
        int iDungeon = 0;
        
        double dSkillPoint = 0;
        double dRarity = 0;
        double dCoins = 50;
        double dLuck = 1;
        double dMulti = 1;
        double dXp = 0;
        double dXpMulti = 1;
        double dXpCap = 100;
        double dDamage = 1;
        double dDamageMulti = 1;
        double dHealth = 10;
        double dHealthMulti = 1;
        double dGearMulti = 1;
        double dSkillMulti = 1;
        
            // LOOP For Rolling
        
        while (bCont == true) {
         
            dRarity = ((Math.random() * 100000) + 1) / dLuck; // Makes The Random Number For The Roll
        
            System.out.println(" ");
            System.out.println("Level Progress: " + dXp + " / " + dXpCap + "              Your Level: [" + iLevel + "] |  Your Skill Points: " + dSkillPoint);
            System.out.println(" ");
            System.out.println("                    You Have " + dCoins + " Coins  ------  Rolls: " + iCount);
            System.out.println(" ");
            System.out.println("                                [1] Roll!");
            System.out.println("                                [2] Shop!");
            System.out.println("                                [3] Upgrade Tree! (Need LVL 5)");
            System.out.println("                                [4] Rebirth");
            System.out.println(" ");
            System.out.println("                            =======================================");
            sRoll = TextIO.getlnString();
            
            // For EXP and LEVELS
        if (iCount3 == 0) {
            
            iCount3 = iCount3 - 1;
            dXp = (dXp + 5); //Gives Xp to Player
            
        }
        
        while (dXp >= dXpCap) {
            
            dXp = dXp - dXpCap; // Resets Xp For Level Ups
            iLevel = iLevel + 1;
            iCount2 = iCount2 - 100; // Gives Skill Points
            dSkillPoint = dSkillPoint + (1 * dSkillMulti);
            dXpCap = dXpCap + 100; // Increases The Level Cap
            dSkillMulti = dSkillMulti + 2.5;
            dMulti = dMulti + 0.10;
            dLuck = dLuck + 0.05;
            dGearMulti = dGearMulti + 0.075;
            dXpMulti = dXpMulti + 0.05;
            dHealthMulti = dHealthMulti + 0.075;
            dDamage = dDamage + 0.075;
            
        }
       
        // Rounding
            dXp = Math.round(dXp * 100) / 100;
            dSkillPoint = Math.round(dSkillPoint * 100) / 100;
            
        // CHECK IF ITEM IS OWN FOR SHOP
        if (iGaunt == 1) 
            sGauntOwned = " [Owned]";
        
        if (iHelm == 1) 
            sHelmOwned = " [Owned]";
        
        if (iChest == 1) 
            sChestOwned = " [Owned]";
            
        if (iLegg == 1) 
            sLeggOwned = " [Owned]";
            
        if (iBoot == 1) 
            sBootOwned = " [Owned]";
            
        if (iNeck == 1) 
            sNeckOwned = " [Owned]";
            
        if (iSock == 1) 
            sSockOwned = " [Owned]";
            
        if (iMetJack == 1) 
            sMetJackOwned = " [Owned]";
            
        if (iFullMet == 1) 
            sFullMetOwned = " [Owned]";

        // ALL RARITIES
        
        if (sRoll.equals("1")) {
            iCount++;
            iCount2++;
            iCount3++;
        
            if (dRarity < 2) {
        
                System.out.println("                               You Got THE RAREST OF THEM ALL!!!"); // These are all the rarities!!!
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (1000000 * dMulti);
                dXp = dXp + (5000 * dXpMulti);
        
    }
            else if (dRarity < 2) {
        
                System.out.println("                                       You Got Invincible!!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (100000 * dMulti);
                dXp = dXp + (1500 * dXpMulti);
        
    }
            else if (dRarity < 4) {
        
                System.out.println("                                       You Got Goddess!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (75000 * dMulti);
                dXp = dXp + (1000 * dXpMulti);
        
    }
            else if (dRarity < 8) {
        
                System.out.println("                                      You Got Developt GOD!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (25000 * dMulti);
                dXp = dXp + (750 * dXpMulti);
        
    }
            else if (dRarity < 16) {
        
                System.out.println("                                     You Got EXTREME Divine!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (10000 * dMulti);
                dXp = dXp + (500 * dXpMulti);
        
    } 
            else if (dRarity < 32) {
        
                System.out.println("                                      You Got Supernatural!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (7500 * dMulti);
                dXp = dXp + (300 * dXpMulti);
        
    } 
            else if (dRarity < 64) {
        
                System.out.println("                                       You Got Superior!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (5000 * dMulti);
                dXp = dXp + (250 * dXpMulti);
        
    }    
            else if (dRarity < 128) {
        
                System.out.println("                                       You Got Divine");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (2000 * dMulti);
                dXp = dXp + (150 * dXpMulti);
        
    } 
            else if (dRarity < 256) {
        
                System.out.println("                                       You Got Nature!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (1500 * dMulti);
                dXp = dXp + (100 * dXpMulti);
        
    } 
            else if (dRarity < 512) {
        
                System.out.println("                                       You Got Mystic!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (1000 * dMulti);
                dXp = dXp + (50 * dXpMulti);
        
    } 
            else if (dRarity < 1024) {
        
                System.out.println("                                       You Got Mythic!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (750 * dMulti);
                dXp = dXp + (20 * dXpMulti);
        
    }    
            else if (dRarity < 2048) {
        
                System.out.println("                                       You Got Legendary!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (500 * dMulti);
                dXp = dXp + (10 * dXpMulti);
        
    } 
            else if (dRarity < 4096) {
        
                System.out.println("                                        You Got Epic!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (250 * dMulti);
                dXp = dXp + (7.5 * dXpMulti);
        
    } 
            else if (dRarity < 8192) {
        
                System.out.println("                                        You Got Rare!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (150 * dMulti);
                dXp = dXp + (5 * dXpMulti);
        
    } 
            else if (dRarity < 16384) {
        
                System.out.println("                                        You Got Rarish!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (100 * dMulti);
                dXp = dXp + (4 * dXpMulti);
        
    }    
            else if (dRarity < 32768) {
        
                System.out.println("                                         You Got Uncommon");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (50 * dMulti);
                dXp = dXp + (3 * dXpMulti);        
    } 
            else if (dRarity < 65536) {
        
                System.out.println("                                          You Got Mid!");
                System.out.println(" ");
                System.out.println("                            =======================================");
                dCoins = dCoins + (25 * dMulti);
                dXp = dXp + (2 * dXpMulti);
        
    }       else { 
                System.out.println("                                       You Got Common!");
                System.out.println(" ");
                System.out.println("                            =======================================");
        
    }
    
   
 } 
            // SHOP 
            
 else if (sRoll.equals("2")) {
        
        System.out.println("        You Have " + dCoins + " Coins"); // This is the shop for upgrades to get better luck.
        System.out.println(" ");
        System.out.println("Welcome! Browse The Shop As You Wish.");
        System.out.println(" ");
        System.out.println("    [1] Metal Gauntlet: Gives 15% Luck And 5% More XP, Costs 5000 Coins" + sGauntOwned);
        System.out.println(" ");
        System.out.println("    [2] Paladin's Helmet: Gives 5% Luck And 2.5% More XP, Costs 2500 Coins" + sHelmOwned);
        System.out.println(" ");
        System.out.println("    [3] Paladin's Chestplate: Gives 10% Luck And 5% More XP, Costs 5000 Coins" + sChestOwned);
        System.out.println(" ");
        System.out.println("    [4] Paladin's Leggings: Gives 5% Luck And 2.5% More XP, Costs 5000 Coins" + sLeggOwned);
        System.out.println(" ");
        System.out.println("    [5] Paladan's Boots: Gives 5% Luck And 2.5% More XP, Costs 2500 Coins" + sBootOwned);
        System.out.println(" ");
        System.out.println("    [6] Emerald Necklace: Gives A LOT Of Coin, XP, And Luck Multiplier, Costs 1,000,000 Coins" + sNeckOwned);
        System.out.println(" ");
        System.out.println("    [7] Adventurer's Socks: Gives 5% Luck And 2.5% More XP, Costs 500 Coins" + sSockOwned);
        System.out.println(" ");
        System.out.println("    [8] Metal Jacket: Gives 1.5x Coin Multiplier, Costs 50,000 Coins" + sMetJackOwned);
        System.out.println(" ");
        System.out.println("    [9] Full Metal Jacket: Gives 2x Coin Multiplier, Costs 100,000 Coins" + sFullMetOwned);
        System.out.println(" ");
        System.out.println("    [0] Quit Shop");
        System.out.println(" ");

        sShop = readLine("Please Choose One: ");
        
        // SHOP ITEMS
        
    if (sShop.equals("1")) {
            if (dCoins >= 5000 && iGaunt == 0) {
        
                dCoins = dCoins - 5000;
                dLuck = dLuck + 0.15;
                dXpMulti = dXpMulti + 0.05;
                iGaunt = iGaunt + 1;
        
    } else { System.out.println("You Do Not Have Enough Coins / You Can't Have More Than One! Keep Rolling To Gain More!"); // These are for checking to see if the user has 1 or none of a certain shop item and saying they can't have more than one.
                System.out.println(" ");
    }
    
    }
    else if (sShop.equals("2")) {
            if (dCoins >= 2500 && iHelm == 0) {
        
                dCoins = dCoins - 2500;
                dLuck = dLuck + 0.05;
                dXpMulti = dXpMulti + 0.025;
                iHelm = iHelm + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("3")) {
            if (dCoins >= 5000 && iChest == 0) {
        
                dCoins = dCoins - 5000;
                dLuck = dLuck + 0.10;
                dXpMulti = dXpMulti + 0.025;
                iChest = iChest + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("4")) {
            if (dCoins >= 5000 && iLegg == 0) {
        
                dCoins = dCoins - 5000;
                dLuck = dLuck + 0.05;
                dXpMulti = dXpMulti + 0.05;
                iLegg = iLegg + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("5")) {
            if (dCoins >= 2500 && iBoot == 0) {
        
                dCoins = dCoins - 2500;
                dLuck = dLuck + 0.05;
                dXpMulti = dXpMulti + 0.025;
                iBoot = iBoot + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("6")) {
            if (dCoins >= 1000000 && iNeck == 0) {
        
                dCoins = dCoins - 1000000;
                dLuck = dLuck + 0.50;
                dMulti = dMulti + 1.5;
                dXpMulti = dXpMulti + 0.20;
                iNeck = iNeck + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("7")) {
            if (dCoins >= 500 && iSock == 0) {
        
                dCoins = dCoins - 500;
                dLuck = dLuck + 0.05;
                dXpMulti = dXpMulti + 0.025;
                iSock = iSock + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("8")) {
            if (dCoins >= 50000 && iMetJack == 0) {
        
                dCoins = dCoins - 50000;
                dMulti = dMulti + 0.5;
                iMetJack = iMetJack + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }

    }
    else if (sShop.equals("9")) {
            if (dCoins >= 100000 && iFullMet == 0) {
        
                dCoins = dCoins - 100000;
                dMulti = dMulti + 0.75;
                iFullMet = iFullMet + 1;
        
    } else { System.out.println("You Do Not Have Enough / You Can Have More Than One! Keep Rolling To Gain More!"); 
                System.out.println(" ");
    }
        
    }
    else if (sShop.equals("0")) {  }
 }
 
 else if (sRoll.equals("3") && iLevel >= 5) {
     

        if (iOption < 1) {
            
             System.out.println(" ");
             System.out.println("                      [1]Fighter   -   [2]Roll Wizz  "); // A choice for either skill tree
             System.out.println(" ");
             sTree = readLine("                              -Choose A Path- ");
            
             iOption = iOption + 1;
             
        if (sTree.equals("1")) {
            
            dGearMulti = dGearMulti + 1;
            dXpMulti = dXpMulti + 0.25;
            dDamage = dDamage + 0.75;
            dHealthMulti = dHealthMulti + 1;
            dSkillMulti = dSkillMulti + 0.5;
        }
        else if (sTree.equals("2")) {
            
            dLuck = dLuck + 0.2;
            dXpMulti = dXpMulti + 1;
            dMulti = dMulti + 1;
            dSkillMulti = dSkillMulti + 0.5;
        }
    }
        
        System.out.println("Press Enter For Your Skill Tree"); 
        sUpgrade = TextIO.getlnString();
        
    if (sTree.equals("1")) {
        
        if (iUpgrade1 == 0) {
            
            System.out.println("=============================="); // This part is all of the skill trees and the benefits they give
            System.out.println(" ");
            System.out.println("Root One - Costs 1 Skill Point");
            System.out.println("Benefits: 2.5% More Exp");
            System.out.println("          2.5% More Coins");
            System.out.println("          5% More Damage");
            System.out.println("          5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 1) {
        
            dXpMulti = dXpMulti + 0.025;
            dMulti = dMulti + 0.025;
            dDamage = dDamage + 0.05;
            dHealthMulti = dHealthMulti + 0.05;
            dSkillPoint = dSkillPoint - 1;
            iUpgrade1++;
            
            } else { System.out.println("You Can't Afford This!"); }
            

    }
        else if (iUpgrade1 == 1) {
            
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Two - Costs 3 Skill Points");
            System.out.println("Benefits: 5% More Exp");
            System.out.println("          5% More Coins");
            System.out.println("          2.5% More Damage");
            System.out.println("          2.5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 3) {
            
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dDamage = dDamage + 0.025;
            dHealthMulti = dHealthMulti + 0.025;
            dSkillPoint = dSkillPoint - 3;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
        
    }
        else if (iUpgrade1 == 2) {
            
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Three - Costs 5 Skill Points");
            System.out.println("Benefits: 7.5% More Exp");
            System.out.println("          7.5% More Coins");
            System.out.println("          2.5% More Damage");
            System.out.println("          2.5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 5) {
        
            dXpMulti = dXpMulti + 0.075;
            dMulti = dMulti + 0.075;
            dDamage = dDamage + 0.025;
            dHealthMulti = dHealthMulti + 0.025;
            dSkillPoint = dSkillPoint - 5;
            iUpgrade1++;
        
        } else { System.out.println("You Can't Afford This!"); }
        
            
    }
        else if (iUpgrade1 == 3) {
            
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Four - Costs 10 Skill Points");
            System.out.println("Benefits: 10% More Exp");
            System.out.println("          10% More Coins");
            System.out.println("          4% More Damage");
            System.out.println("          4% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 10) {
        
            dXpMulti = dXpMulti + 0.10;
            dMulti = dMulti + 0.10;
            dDamage = dDamage + 0.04;
            dHealthMulti = dHealthMulti + 0.04;
            dSkillPoint = dSkillPoint - 10;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
        
        
    }
        else if (iUpgrade1 == 4) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Five - Costs 15 Skill Points");
            System.out.println("Benefits: 15% More Exp");
            System.out.println("          15% More Coins");
            System.out.println("          2.5% More Damage");
            System.out.println("          2.5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 15) {
        
            dXpMulti = dXpMulti + 0.15;
            dMulti = dMulti + 0.15;
            dDamage = dDamage + 0.025;
            dHealthMulti = dHealthMulti + 0.025;
            dSkillPoint = dSkillPoint - 15;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
        
           
    }
        else if (iUpgrade1 == 5) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Six - Costs 20 Skill Points");
            System.out.println("Benefits: 5% More Exp");
            System.out.println("          5% More Coins");
            System.out.println("          10% More Damage");
            System.out.println("          10% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 20) {
        
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dDamage = dDamage + 0.10;
            dHealthMulti = dHealthMulti + 0.10;
            dSkillPoint = dSkillPoint - 20;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
          
    }
        else if (iUpgrade1 == 6) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Seven - Costs 30 Skill Points");
            System.out.println("Benefits: 5% More Exp");
            System.out.println("          5% More Coins");
            System.out.println("          5% More Damage");
            System.out.println("          5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 30) {
        
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dDamage = dDamage + 0.05;
            dHealthMulti = dHealthMulti + 0.05;
            dSkillPoint = dSkillPoint - 30;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade1 == 7) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Eight - Costs 50 Skill Points");
            System.out.println("Benefits: 25% More Exp");
            System.out.println("          25% More Coins");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 50) {
        
            dXpMulti = dXpMulti + 0.25;
            dMulti = dMulti + 0.25;
            dSkillPoint = dSkillPoint - 50;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade1 == 8) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Nine - Costs 75 Skill Points");
            System.out.println("          25% More Damage");
            System.out.println("          25% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 75) {
    
            dDamage = dDamage + 0.25;
            dHealthMulti = dHealthMulti + 0.25;
            dSkillPoint = dSkillPoint - 75;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
        
           
    }
        else if (iUpgrade1 == 9) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch One - Costs 100 Skill Points");
            System.out.println("Benefits: 50% More Exp");
            System.out.println("          50% More Coins");
            System.out.println("          25% More Damage");
            System.out.println("          25% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 100) {
        
            dXpMulti = dXpMulti + 0.50;
            dMulti = dMulti + 0.50;
            dDamage = dDamage + 0.25;
            dHealthMulti = dHealthMulti + 0.25;
            dSkillPoint = dSkillPoint - 100;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade1 == 10) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Two - Costs 200 Skill Points");
            System.out.println("Benefits: 10% More Exp");
            System.out.println("          10% More Coins");
            System.out.println("          5% More Damage");
            System.out.println("          5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 200) {
        
            dXpMulti = dXpMulti + 0.10;
            dMulti = dMulti + 0.10;
            dDamage = dDamage + 0.05;
            dHealthMulti = dHealthMulti + 0.05;
            dSkillPoint = dSkillPoint - 200;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade1 == 11) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Three - Costs 300 Skill Points");
            System.out.println("Benefits: 15% More Exp");
            System.out.println("          15% More Coins");
            System.out.println("          2.5% More Damage");
            System.out.println("          2.5% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 300) {
        
            dXpMulti = dXpMulti + 0.15;
            dMulti = dMulti + 0.15;
            dDamage = dDamage + 0.025;
            dHealthMulti = dHealthMulti + 0.025;
            dSkillPoint = dSkillPoint - 300;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade1 == 12) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Four - Costs 500 Skill Points");
            System.out.println("Benefits: 5% More Exp");
            System.out.println("          5% More Coins");
            System.out.println("          10% More Damage");
            System.out.println("          10% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 500) {
        
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dDamage = dDamage + 0.10;
            dHealthMulti = dHealthMulti + 0.10;
            dSkillPoint = dSkillPoint - 500;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade1 == 13) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Five - Costs 750 Skill Points");
            System.out.println("Benefits: 5% More Exp");
            System.out.println("          5% More Coins");
            System.out.println("          35% More Damage");
            System.out.println("          10% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 750) {
        
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dDamage = dDamage + 0.35;
            dHealthMulti = dHealthMulti + 0.10;
            dSkillPoint = dSkillPoint - 750;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade1 == 14) {
          
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("The Tree - Costs 1000 Skill Points");
            System.out.println("Benefits: 100% More Exp");
            System.out.println("          100% More Coins");
            System.out.println("          100% More Damage");
            System.out.println("          100% More Health");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 1000) {
        
            dXpMulti = dXpMulti + 1;
            dMulti = dMulti + 1;
            dDamage = dDamage + 1;
            dHealthMulti = dHealthMulti + 1;
            dSkillPoint = dSkillPoint - 1000;
            iUpgrade1++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    } 
        else if (iUpgrade1 >= 15 ) {
            System.out.println("You Have Reached MAX Skill Tree!");
    }
    }
    
    else if (sTree.equals("2")) {
        
        if (iUpgrade2 == 0) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root One - Costs 1 Skill Point");
            System.out.println("Benefits: 2.5% More Luck");
            System.out.println("          2.5% More Coins");
            System.out.println("          5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 1) {
        
            dLuck = dLuck + 0.025;
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.025;
            dSkillPoint = dSkillPoint - 1;
            iUpgrade2++;
        
            } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade2 == 1) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Two - Costs 3 Skill Point");
            System.out.println("Benefits: 5% More Luck");
            System.out.println("          5% More Coins");
            System.out.println("          2.5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 3) {
        
            dLuck = dLuck + 0.05;
            dXpMulti = dXpMulti + 0.025;
            dMulti = dMulti + 0.025;
            dSkillPoint = dSkillPoint - 3;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade2 == 2) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Three - Costs 5 Skill Point");
            System.out.println("Benefits: 10% More Luck");
            System.out.println("          10% More Coins");
            System.out.println("          5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 5) {
        
            dLuck = dLuck + 0.10;
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.10;
            dSkillPoint = dSkillPoint - 5;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade2 == 3) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Four - Costs 10 Skill Point");
            System.out.println("Benefits: 5% More Luck");
            System.out.println("          5% More Coins");
            System.out.println("          5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 10) {
        
            dLuck = dLuck + 0.05;
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.05;
            dSkillPoint = dSkillPoint - 10;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
            
    }
        else if (iUpgrade2 == 4) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Five - Costs 15 Skill Point");
            System.out.println("Benefits: 15% More Luck");
            System.out.println("          15% More Coins");
            System.out.println("          10% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 15) {
        
            dLuck = dLuck + 0.15;
            dXpMulti = dXpMulti + 0.10;
            dMulti = dMulti + 0.15;
            dSkillPoint = dSkillPoint - 15;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade2 == 5) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Six - Costs 20 Skill Point");
            System.out.println("Benefits: 2.5% More Luck");
            System.out.println("          2.5% More Coins");
            System.out.println("          7.5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 20) {
        
            dLuck = dLuck + 0.025;
            dXpMulti = dXpMulti + 0.075;
            dMulti = dMulti + 0.025;
            dSkillPoint = dSkillPoint - 20;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
           
    }
        else if (iUpgrade2 == 6) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Seven - Costs 30 Skill Point");
            System.out.println("Benefits: 20% More Luck");
            System.out.println("          20% More Coins");
            System.out.println("          15% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 30) {
        
            dLuck = dLuck + 0.20;
            dXpMulti = dXpMulti + 0.15;
            dMulti = dMulti + 0.20;
            dSkillPoint = dSkillPoint - 30;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade2 == 7) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Eight - Costs 50 Skill Point");
            System.out.println("Benefits: 5% More Luck");
            System.out.println("          5% More Coins");
            System.out.println("          2.5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 50) {
        
            dLuck = dLuck + 0.05;
            dXpMulti = dXpMulti + 0.025;
            dMulti = dMulti + 0.05;
            dSkillPoint = dSkillPoint - 50;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 8) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Root Nine - Costs 75 Skill Point");
            System.out.println("Benefits: 50% More Luck");
            System.out.println("          50% More Coins");
            System.out.println("          25% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 75) {
        
            dLuck = dLuck + 0.50;
            dXpMulti = dXpMulti + 0.25;
            dMulti = dMulti + 0.50;
            dSkillPoint = dSkillPoint - 75;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 9) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch One - Costs 100 Skill Point");
            System.out.println("Benefits: 15% More Luck");
            System.out.println("          15% More Coins");
            System.out.println("          7.5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 100) {
        
            dLuck = dLuck + 0.15;
            dXpMulti = dXpMulti + 0.075;
            dMulti = dMulti + 0.15;
            dSkillPoint = dSkillPoint - 100;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 10) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Two - Costs 200 Skill Point");
            System.out.println("Benefits: 10% More Luck");
            System.out.println("          10% More Coins");
            System.out.println("          10% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 200) {
        
            dLuck = dLuck + 0.10;
            dXpMulti = dXpMulti + 0.10;
            dMulti = dMulti + 0.10;
            dSkillPoint = dSkillPoint - 200;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 11) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Three - Costs 300 Skill Point");
            System.out.println("Benefits: 15% More Luck");
            System.out.println("          7.5% More Coins");
            System.out.println("          5% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 300) {
        
            dLuck = dLuck + 0.15;
            dXpMulti = dXpMulti + 0.05;
            dMulti = dMulti + 0.075;
            dSkillPoint = dSkillPoint - 300;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 12) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Four - Costs 500 Skill Point");
            System.out.println("Benefits: 20% More Luck");
            System.out.println("          10% More Coins");
            System.out.println("          15% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 500) {
        
            dLuck = dLuck + 0.20;
            dXpMulti = dXpMulti + 0.15;
            dMulti = dMulti + 0.10;
            dSkillPoint = dSkillPoint - 500;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            


    }
        else if (iUpgrade2 == 13) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("Branch Five - Costs 1000 Skill Point");
            System.out.println("Benefits: 25% More Luck");
            System.out.println("          25% More Coins");
            System.out.println("          25% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 1000) {
        
            dLuck = dLuck + 0.25;
            dXpMulti = dXpMulti + 0.25;
            dMulti = dMulti + 0.25;
            dSkillPoint = dSkillPoint - 1000;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            
            
    }
        else if (iUpgrade2 == 14) {
        
            System.out.println("==============================");
            System.out.println(" ");
            System.out.println("The Tree - Costs 5000 Skill Point");
            System.out.println("Benefits: 100% More Luck");
            System.out.println("          100% More Coins");
            System.out.println("          100% More EXP");
            System.out.println(" ");
            System.out.println("Do You Want To Purchase This Upgrade? (Y/N)");
            sBuy = TextIO.getlnString();
            System.out.println(" ");
            System.out.println("===============================");
            
            if (sBuy.equalsIgnoreCase("Yes") || sBuy.equalsIgnoreCase("Y") && dSkillPoint >= 5000) {
        
            dLuck = dLuck + 1;
            dXpMulti = dXpMulti + 1;
            dMulti = dMulti + 1;
            dSkillPoint = dSkillPoint - 5000;
            iUpgrade2++;
            
        } else { System.out.println("You Can't Afford This!"); }
            

    }
        else if (iUpgrade2 >= 15 ) {
            System.out.println("You Have Reached MAX Skill Tree!");
    }
        
}
     
   } 
else if (sRoll.equals("3") && iLevel <= 5) { System.out.println("You Aren't High Enough Level!"); }
 
 
else if (sRoll.equals("4")) {
    
    while (sRoll.equals("4")) {
    
        System.out.println(" ");
        System.out.println("Would You Like To Rebirth? (Y/N)");
        sRebirth = TextIO.getlnString();
        break;
    
    } 
    
    if (sRebirth.equalsIgnoreCase("Yes") || sRebirth.equalsIgnoreCase("Y")) {
        
        
        if (iRebirth == 0) {
            
            System.out.println("RESETS ALL STATS EXPECT ROLLS AND DUNGEON PROGRESS");
            System.out.println(" ");
            System.out.println("You Need: 500 Skill Points");
            System.out.println("          1,000,000 Coins");
            System.out.println("          5000 Total Rolls");
            System.out.println("___________________________");
            System.out.println(" ");
            System.out.println("You Get:  2x Coins");
            System.out.println("          2x Exp");
            System.out.println("          2x Luck");
            System.out.println("          2x Skill Points");
            System.out.println("          Access To Dungeons");
        
            System.out.println("Rebirth?");
            sYesRebirth = TextIO.getlnString();
            
            if ((sYesRebirth.equalsIgnoreCase("No")) || (sYesRebirth.equalsIgnoreCase("N"))) {  }
        
            else if ((sYesRebirth.equalsIgnoreCase("Yes")) || (sYesRebirth.equalsIgnoreCase("Y")) && (dSkillPoint >= 500) && (dCoins >= 1000000) && (iCount >= 5000)) {
                
                    // Take Away Pay
                
                dSkillPoint = dSkillPoint * 0;
                dCoins = dCoins * 0;
                dLuck = 1;
                dMulti = 1;
                dSkillMulti = 1;
                iLevel = 0;
                iUpgrade1 = 0;
                iUpgrade2 = 0;
                dXp = 0;
                dXpMulti = 1;
                iGaunt = 0;
                iHelm = 0;
                iChest = 0;
                iLegg = 0;
                iBoot = 0;
                iNeck = 0;
                iSock = 0;
                iMetJack = 0;
                iFullMet = 0;
                iRebirth = iRebirth + 1;
                sTree = "";
                
                    //Give Rewards For Rebirth
                dMulti = dMulti * 2;
                dXpMulti = dXpMulti * 2;
                dLuck = dLuck * 2;
                dSkillMulti = dSkillMulti * 2;
                iDungeon = iDungeon + 1;
                
            } else if (!(dSkillPoint >= 500) || !(dCoins >= 1000000) || !(iCount >= 5000)) { System.out.println("You Don't Have Enough!"); }
        
        }
        
        if (iRebirth == 1) {
            
            System.out.println("RESETS ALL STATS EXPECT ROLLS AND DUNGEON PROGRESS");
            System.out.println(" ");
            System.out.println("You Need: 1000 Skill Points");
            System.out.println("          10,000,000 Coins");
            System.out.println("          15,000 Total Rolls");
            System.out.println("___________________________");
            System.out.println(" ");
            System.out.println("You Get:  2x Coins");
            System.out.println("          2x Exp");
            System.out.println("          2x Dungeon Stats");
            System.out.println("          2x Skill Points");
            
            System.out.println("Rebirth?");
            sYesRebirth = TextIO.getlnString();
            
            if ((sYesRebirth.equalsIgnoreCase("No")) || (sYesRebirth.equalsIgnoreCase("N"))) {  }
        
            else if ((sYesRebirth.equalsIgnoreCase("Yes")) || (sYesRebirth.equalsIgnoreCase("Y")) && (dSkillPoint >= 1000) && (dCoins >= 10000000) && (iCount >= 15000)) {
                
                    // Take Away Pay
                
                dSkillPoint = dSkillPoint * 0;
                dCoins = dCoins * 0;
                dLuck = 1;
                dMulti = 1;
                dSkillMulti = 1;
                iLevel = 0;
                iUpgrade1 = 0;
                iUpgrade2 = 0;
                dXp = 0;
                dXpMulti = 1;
                iGaunt = 0;
                iHelm = 0;
                iChest = 0;
                iLegg = 0;
                iBoot = 0;
                iNeck = 0;
                iSock = 0;
                iMetJack = 0;
                iFullMet = 0;
                iRebirth = iRebirth + 1;
                sTree = "";
                
                    //Give Rewards For Rebirth
                dMulti = dMulti * 2;
                dXpMulti = dXpMulti * 2;
                dHealthMulti = dHealthMulti * 2;
                dDamageMulti = dDamageMulti * 2;
                dGearMulti = dGearMulti * 2;
                dSkillMulti = dSkillMulti * 2;
                iDungeon = iDungeon + 1;
                
            } else if (!(dSkillPoint >= 1000) || !(dCoins >= 10000000) || !(iCount >= 15000)) { System.out.println("You Don't Have Enough!"); }
        
            if ((sYesRebirth.equalsIgnoreCase("No")) || (sYesRebirth.equalsIgnoreCase("N"))) {  }
        
        }
        
        if (iRebirth == 2) {
            
            System.out.println("RESETS ALL STATS EXPECT ROLLS AND DUNGEON PROGRESS");
            System.out.println(" ");
            System.out.println("You Need: 5000 Skill Points");
            System.out.println("          100,000,000 Coins");
            System.out.println("          50,000 Total Rolls");
            System.out.println("___________________________");
            System.out.println(" ");
            System.out.println("You Get:  5x ALL STATS");
            
            System.out.println("Rebirth?");
            sYesRebirth = TextIO.getlnString();
            
            if ((sYesRebirth.equalsIgnoreCase("No")) || (sYesRebirth.equalsIgnoreCase("N"))) {  }
        
            else if ((sYesRebirth.equalsIgnoreCase("Yes")) || (sYesRebirth.equalsIgnoreCase("Y")) && (dSkillPoint >= 5000) && (dCoins >= 100000000) && (iCount >= 50000)) {
                
                    // Take Away Pay
                
                dSkillPoint = dSkillPoint * 0;
                dCoins = dCoins * 0;
                dLuck = 1;
                dMulti = 1;
                dSkillMulti = 1;
                iLevel = 0;
                iUpgrade1 = 0;
                iUpgrade2 = 0;
                dXp = 0;
                dXpMulti = 1;
                iGaunt = 0;
                iHelm = 0;
                iChest = 0;
                iLegg = 0;
                iBoot = 0;
                iNeck = 0;
                iSock = 0;
                iMetJack = 0;
                iFullMet = 0;
                iRebirth = iRebirth + 1;
                sTree = "";
                
                    //Give Rewards For Rebirth
                dMulti = dMulti * 5;
                dXpMulti = dXpMulti * 5;
                dHealthMulti = dHealthMulti * 5;
                dDamageMulti = dDamageMulti * 5;
                dGearMulti = dGearMulti * 5;
                dSkillMulti = dSkillMulti * 5;
                dLuck = dLuck * 5;
                
                iDungeon = iDungeon + 1;
                
            } else if (!(dSkillPoint >= 5000) || !(dCoins >= 100000000) || !(iCount >= 50000)) { System.out.println("You Don't Have Enough!"); }
        
            if ((sYesRebirth.equalsIgnoreCase("No")) || (sYesRebirth.equalsIgnoreCase("N"))) {  }
        
        } else if (iRebirth >= 3) { System.out.println("You Maxed Out Rebirths!"); 
        
    }
    
}
    else if (sRebirth.equalsIgnoreCase("No") || sRebirth.equalsIgnoreCase("N")) {
        
    }

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 }
}
}
