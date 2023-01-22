package Exer05_Repetition;
import javax.swing.*;
public class Exer05a_Grocery {
    public static void main(String[] args) {
        String ws = " ", selct = """
                    Choose what you want to buy:
                    =============================
                    [1] Food
                    [2] Utensils
                    [3] Ingredients
                    [4] Soaps
                    [5] Others
                    [6] Checkout
                    =============================
                    [0] Exit""";
        int qty, slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
        float price, u_price ,t_price = 0;
        StringBuilder rcpt = new StringBuilder();
        while(slct <7 && slct > -1) {
            while (slct>6 || slct<0){
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            if (slct == 1)
            {
                String fd = """
                        Enter your food choice/s:
                        ==========================
                        [1] Bread
                        [2] Junk foods
                        [3] Biscuits
                        [4] Nuts
                        [5] Canned good
                        [6] Drinks
                        ==========================
                        [7] Back
                        """;
                int food = Integer.parseInt(JOptionPane.showInputDialog(fd));
                while (food != 7)
                {
                    if (food == 1) {
                        String bred =
                                "Enter your bread choice:\n" +
                                "=================================================================\n"+
                                "[1] Loaf" + ws.repeat(84) + "PHP 35.00 each\n" +
                                "[2] Star Bread" + ws.repeat(72) + "PHP 6.00 each\n" +
                                "[3] Pan de Leche" + ws.repeat(67) + "PHP 5.00 each\n" +
                                "[4] Cheese Bread" + ws.repeat(66) + "PHP 6.00 each\n" +
                                "[5] Choco Bread" + ws.repeat(68) + "PHP 6.00 each\n" +
                                "[6] Coco Bread" + ws.repeat(70) + "PHP 6.00 each\n" +
                                "=================================================================\n"+
                                "[7] Back";
                        int brd = Integer.parseInt(JOptionPane.showInputDialog(bred));
                        while (brd != 7)
                        {
                            if (brd == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much loaf do you want:"));
                                price = 35;
                                String lprod = "Loaf";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(lprod).append(ws.repeat(43 - (2*lprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much star bread do you want:"));
                                price = 6;
                                String sbprod = "Star bread";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(sbprod).append(ws.repeat(43 - (2*sbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much Pan de Leche do you want:"));
                                price = 5;
                                String pdlprod = "Pan de Leche";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(pdlprod).append(ws.repeat(43 - (2*pdlprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much cheese bread do you want:"));
                                price = 5;
                                String cbprod = "Cheese Bread";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cbprod).append(ws.repeat(43 - (2*cbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd == 5) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much choco bread do you want:"));
                                price = 5;
                                String chbprod = "Choco Bread";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(chbprod).append(ws.repeat(43 - (2*chbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd == 6) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much coco bread do you want:"));
                                price = 6;
                                String cobprod = "Coco Bread";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cobprod).append(ws.repeat(43 - (2*cobprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (brd >7 || brd<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            brd = Integer.parseInt(JOptionPane.showInputDialog(bred));
                        }
                    } else if (food == 2) {
                        String jkf =
                                "Enter your junk food choice/s:\n" +
                                "===================================================================\n"+
                                "[1] Piatos"   +ws.repeat(80)+       "PHP 12.00 each\n" +
                                "[2] Nova"     +ws.repeat(84)+      "PHP 12.00 each\n"+
                                "[3] Cheese rings"  +ws.repeat(68)+  "PHP 12.00 each\n"+
                                "[4] Patatas"    +ws.repeat(78)+     "PHP 12.00 each\n"+
                                "[5] Ringbee"   +ws.repeat(78)+      "PHP 12.00 each\n" +
                                "===================================================================\n"+
                                "[6] Back";
                        int jk_food = Integer.parseInt(JOptionPane.showInputDialog(jkf));
                        while (jk_food != 6) {
                            if (jk_food == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much piatos do you want:"));
                                price = 12;
                                String piaprod = "Piatos";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(piaprod).append(ws.repeat(43 - (2*piaprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (jk_food == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much nova do you want:"));
                                price = 12;
                                String novprod = "Nova";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(novprod).append(ws.repeat(43 - (2*novprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (jk_food == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much cheese ring do you want:"));
                                price = 12;
                                String crprod = "Cheese Ring";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(crprod).append(ws.repeat(43 - (2*crprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (jk_food == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much patatas do you want:"));
                                price = 12;
                                String patprod = "Patatas";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(patprod).append(ws.repeat(43 - (2*patprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (jk_food == 5) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much ringbee do you want:"));
                                price = 12;
                                String riprod = "Ringbee";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(riprod).append(ws.repeat(43 - (2*riprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            }else if (jk_food >6||jk_food<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            jk_food = Integer.parseInt(JOptionPane.showInputDialog(jkf));
                        }
                    } else if (food == 3)
                    {
                        String bisct =
                                "Enter your biscuit choice/s:\n"+
                                "=====================================================================\n"+
                                "[1] Skyflakes plain" +ws.repeat(62)+  "php 45.00 per pack"+ "\n"+
                                "[2] Rebisco plain"    +ws.repeat(66)+ "php 45.00 per pack"+ "\n"+
                                "[3] Marie"        +ws.repeat(82)+     "php 55.00 per pack"+ "\n"+
                                "[4] Fita plain"   +ws.repeat(72)+     "php 45.00 per pack"+ "\n"+
                                "=====================================================================\n"+
                                "[5] Back";
                        int bsct = Integer.parseInt(JOptionPane.showInputDialog(bisct));
                        while (bsct != 5) {
                            if (bsct == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much pack/s of skyflakes plain do you want:"));
                                price = 45;
                                String skyprod = "Skyflakes";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(skyprod).append(ws.repeat(43 - (2*skyprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bsct == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much pack/s of rebisco plain do you want:"));
                                price = 45;
                                String rebprod = "Rebisco";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(rebprod).append(ws.repeat(43 - (2*rebprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bsct == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much pack/s of marie do you want:"));
                                price = 55;
                                String marprod = "Marie";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(marprod).append(ws.repeat(43 - (2*marprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bsct == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much pack/s of fita plain do you want:"));
                                price = 45;
                                String fitprod = "Fita";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(fitprod).append(ws.repeat(43 - (2*fitprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bsct >5 || bsct<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            bsct = Integer.parseInt(JOptionPane.showInputDialog(bisct));
                        }
                    } else if (food == 4)
                    {
                        String nt =
                                "Enter your nuts choice/s:\n"+
                                "===================================================================\n"+
                                "[1] Almond "   +ws.repeat(80)+   "PHP 100.00 per kilo"+ "\n"+
                                "[2] Pistachio" +ws.repeat(74)+   "PHP 125.00 per kilo"+ "\n"+
                                "[3] Cashew"   +ws.repeat(80)+    "PHP 200.00 per kilo"+ "\n"+
                                "[4] Peanut"   +ws.repeat(80)+    "PHP 75.00 per kilo"+ "\n"+
                                "===================================================================\n"+
                                "[5] Back";
                        int nuts = Integer.parseInt(JOptionPane.showInputDialog(nt));
                        while (nuts !=5) {
                            if (nuts == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kilo/s of almonds do you want:"));
                                price = 100;
                                String alprod = "Almonds";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(alprod).append(ws.repeat(43 - (2*alprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (nuts == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much kilo/s of pistachio do you want:"));
                                price = 125;
                                String pistprod = "Pistachio";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(pistprod).append(ws.repeat(43 - (2*pistprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (nuts == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much kilo/s of cashew do you want:"));
                                price = 200;
                                String caprod = "Cashew";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(caprod).append(ws.repeat(43 - (2*caprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (nuts == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much kilo/s of peanuts do you want:"));
                                price = 75;
                                String peaprod = "Peanuts";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(peaprod).append(ws.repeat(43 - (2*peaprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (nuts >5 || nuts<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            nuts = Integer.parseInt(JOptionPane.showInputDialog(nt));
                        }
                    } else if (food == 5)
                    {
                        String cdg =
                                "Enter your canned goods choice/s:\n"+
                                "===================================================================\n"+
                                "[1] Sardines"      +ws.repeat(76)+   "PHP 25.00 per can\n"+
                                "[2] Meat loaf"    +ws.repeat(74)+    "PHP 35.00 per can\n"+
                                "[3] Pork 'n beans" +ws.repeat(66)+   "PHP 25.00 per can\n"+
                                "[4] Corned beef"  +ws.repeat(80)+    "PHP 35.00 per can\n"+
                                "===================================================================\n"+
                                "[5] Back";
                        int cnd_goods = Integer.parseInt(JOptionPane.showInputDialog(cdg));
                        while (cnd_goods != 5) {
                            if (cnd_goods == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many can/s of sardines do you want:"));
                                price = 25;
                                String sardprod = "Sardines";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(sardprod).append(ws.repeat(43 - (2*sardprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (cnd_goods == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much can/s of meat loaf do you want:"));
                                price = 35;
                                String mlprod = "Meat Loaf";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(mlprod).append(ws.repeat(43 - (2*mlprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (cnd_goods == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much can/s of pork 'n beans do you want:"));
                                price = 25;
                                String pnbprod = "Pork 'n Beans";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(pnbprod).append(ws.repeat(43 - (2*pnbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (cnd_goods == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much can/s of corned beef do you want:"));
                                price = 35;
                                String cbprod = "Corned Beef";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cbprod).append(ws.repeat(43 - (2*cbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (cnd_goods >5 || cnd_goods<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            cnd_goods = Integer.parseInt(JOptionPane.showInputDialog(cdg));
                        }
                    } else if (food == 6)
                    {
                        String drk =
                                "Enter your drinks choice/s:\n"+
                                "========================================================\n"+
                                "[1] Coke"  +ws.repeat(84)+   "PHP 25.00 per bottle\n"+
                                "[2] Sprite"  +ws.repeat(80)+ "PHP 25.00 per bottle\n"+
                                "[3] Royal"  +ws.repeat(82)+  "PHP 25.00 per bottle\n"+
                                "[4] Water"  +ws.repeat(82)+  "PHP 15.00 per bottle\n"+
                                "========================================================\n"+
                                "[5] Back";
                        int drnks = Integer.parseInt(JOptionPane.showInputDialog(drk));
                        while (drnks != 5) {
                            if (drnks == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many bottle/s of coke do you want:"));
                                price = 25;
                                String cokprod = "Coke";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cokprod).append(ws.repeat(43 - (2*cokprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (drnks == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much bottle/s of sprite do you want:"));
                                price = 25;
                                String sprprod = "Sprite";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(sprprod).append(ws.repeat(43 - (2*sprprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (drnks == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much bottle/s of royal do you want:"));
                                price = 25;
                                String royprod = "Royal";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(royprod).append(ws.repeat(43 - (2*royprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (drnks == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much bottle/s of water do you want:"));
                                price = 25;
                                String watprod = "Water";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(watprod).append(ws.repeat(43 - (2*watprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (drnks >5 || drnks<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            drnks = Integer.parseInt(JOptionPane.showInputDialog(drk));
                        }

                    } else if (food >7 || food<0)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid food section");
                    }
                    food = Integer.parseInt(JOptionPane.showInputDialog(fd));
                }
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            else if (slct == 2)
            {
                String util = """
                        Enter the utensils you want to buy:
                        ====================================
                        [1] Fork
                        [2] Knife
                        [3] Spatula
                        [4] Pot
                        [5] Spoon
                        ====================================
                        [6] Back""";
                int utls = Integer.parseInt(JOptionPane.showInputDialog(util));
                while (utls != 6) {
                    if (utls == 1) {
                        String fork =
                                "Enter your fork choice/s:\n"+
                                "=============================================================\n"+
                                "[1] Plastic fork" +ws.repeat(68)+ "PHP 5.00 each\n"+
                                "[2] Metal fork"  +ws.repeat(72)+  "PHP 25.00 each\n"+
                                "=============================================================\n"+
                                "[3] Back";
                        int frk = Integer.parseInt(JOptionPane.showInputDialog(fork));
                        while (frk !=3) {
                            if (frk == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much plastic fork/s do you want:"));
                                price = 5;
                                String pfprod = "Plastic Fork";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(pfprod).append(ws.repeat(43 - (2*pfprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (frk == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much metal Fork/s do you want:"));
                                price = 25;
                                String mefprod = "Metal Fork";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(mefprod).append(ws.repeat(43 - (2*mefprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (frk >3 || frk<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            frk = Integer.parseInt(JOptionPane.showInputDialog(fork));
                        }
                    } else if (utls == 2) {
                        String knif =
                                "Enter your knife choice/s:\n"+
                                "============================================================\n"+
                                "[1] Clever knife" +ws.repeat(68)+   "PHP 550.00\n"+
                                "[2] Butcher knife"  +ws.repeat(66)+ "PHP 600.00\n"+
                                "[3] Bread knife"   +ws.repeat(70)+  "PHP 400.00\n"+
                                "[4] Butter knife" +ws.repeat(68)+   "PHP 200.00\n"+
                                "============================================================\n"+
                                "[5] Back";
                        int knf = Integer.parseInt(JOptionPane.showInputDialog(knif));
                        while (knf !=5) {
                            if (knf == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many clever knives do you want:"));
                                price = 550;
                                String ckprod = "Clever Knife";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(ckprod).append(ws.repeat(43 - (2*ckprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (knf == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many butcher knives do you want:"));
                                price = 600;
                                String bkprod = "Butcher Knife";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(bkprod).append(ws.repeat(43 - (2*bkprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (knf == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many bread knives do you want:"));
                                price = 400;
                                String brkprod = "Bread Knife";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(brkprod).append(ws.repeat(43 - (2*brkprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (knf == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many butter knives do you want:"));
                                price = 400;
                                String buprod = "Butter Knife";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(buprod).append(ws.repeat(43 - buprod.length())).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (knf >5 || knf<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            knf = Integer.parseInt(JOptionPane.showInputDialog(knif));
                        }
                    } else if (utls == 3) {
                        qty = Integer.parseInt(JOptionPane.showInputDialog("How much spatula (php 75.00) do you want:"));
                        price = 75;
                        String spprod = "Spatula";
                        u_price = qty * price;
                        t_price += u_price;
                        rcpt.append(spprod).append(ws.repeat(43 - (2*spprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                    } else if (utls == 4) {
                        String pt =
                                "Enter your nuts choice/s:\n"+
                                "======================================================\n"+
                                "[1] Hotpot"   +ws.repeat(80)+   "PHP 1000.00\n"+
                                "[2] Sauce pot" +ws.repeat(74)+  "PHP 700.00\n"+
                                "[3] Clay pot"  +ws.repeat(76)+  "PHP 350.00\n"+
                                "======================================================\n"+
                                "[4] Back";
                        int pot = Integer.parseInt(JOptionPane.showInputDialog(pt));
                        while (pot != 4) {
                            if (pot == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many hotpot/s do you want:"));
                                price = 100;
                                String hpprod = "Hotpot";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(hpprod).append(ws.repeat(43 - (2*hpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (pot == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many sauce pot/s do you want:"));
                                price = 700;
                                String spprod = "Sauce Pot";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(spprod).append(ws.repeat(43 - (2*spprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (pot == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many clay pot/s do you want:"));
                                price = 350;
                                String cpprod = "Clay Pot";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cpprod).append(ws.repeat(43 - (2*cpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (pot >4 || pot<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            pot = Integer.parseInt(JOptionPane.showInputDialog(pt));
                        }
                    } else if (utls == 5) {
                        String spon =
                                "Enter your canned goods choice/s:\n"+
                                "=============================================================\n"+
                                "[1] Plastic spoon"  +ws.repeat(66)+ "PHP 5.00 each\n"+
                                "[2] Metal spoon"   +ws.repeat(70)+  "PHP 25.00 each\n"+
                                "=============================================================\n"+
                                "[3] Back";
                        int spn = Integer.parseInt(JOptionPane.showInputDialog(spon));
                        while (spn != 3) {
                            if (spn == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many plastic spoons do you want:"));
                                price = 5;
                                String psprod = "Plastic Spoon";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(psprod).append(ws.repeat(43 - (2*psprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spn == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much metal spoons do you want:"));
                                price = 25;
                                String msprod = "Metal Spoon";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(msprod).append(ws.repeat(43 - (2*msprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spn >3 || spn<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            spn = Integer.parseInt(JOptionPane.showInputDialog(spon));
                        }
                    } else if (utls >6 || utls<0){
                        JOptionPane.showMessageDialog(null, "Invalid utensils section");
                    }
                    utls = Integer.parseInt(JOptionPane.showInputDialog(util));
                }
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            else if (slct == 3)
            {
                String ing = """
                        Enter the ingredient/s you want to buy:
                        =======================================
                        [1] Spices
                        [2] Meat
                        =======================================
                        [3] Back
                        """;
                int ingdts = Integer.parseInt(JOptionPane.showInputDialog(ing));
                while (ingdts != 3) {
                    if (ingdts == 1) {
                        String spice =
                                "Enter your spice choice/s:\n"+
                                "====================================================================\n"+
                                "[1] Black pepper"    +ws.repeat(68)+   "PHP 25.00 per pack\n"+
                                "[2] Chili powder"    +ws.repeat(68)+   "PHP 30.00 per pack\n"+
                                "[3] Turmeric powder"  +ws.repeat(62)+  "PHP 60.00 per pack\n"+
                                "[4] Ginger powder"    +ws.repeat(66)+  "PHP 35.00 per pack\n"+
                                "====================================================================\n"+
                                "[5] Back";
                        int spcs = Integer.parseInt(JOptionPane.showInputDialog(spice));
                        while (spcs != 5) {
                            if (spcs == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many pack/s of black pepper do you want:"));
                                price = 25;
                                String bpprod = "Black Pepper";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(bpprod).append(ws.repeat(43 - (2*bpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spcs == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many pack/s of chili powder do you want:"));
                                price = 30;
                                String cpprod = "Chili Powder";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cpprod).append(ws.repeat(43 - (2*cpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spcs == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many pack/s of turmeric powder do you want:"));
                                price = 60;
                                String tpprod = "Turmeric Powder";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(tpprod).append(ws.repeat(43 - (2*tpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spcs == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many pack/s of ginger powder do you want:"));
                                price = 35;
                                String gpprod = "Ginger Powder";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(gpprod).append(ws.repeat(43 - (2*gpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (spcs >5 || spcs<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            spcs = Integer.parseInt(JOptionPane.showInputDialog(spice));
                        }
                    } else if (ingdts == 2) {
                        String mt =
                                "Enter your meat of choice/s:\n"+
                                "=========================================================================\n"+
                                "[1] Pork (Pierna)"   +ws.repeat(66)+      "PHP 300.00 per kilo\n"+
                                "[2] Fish (Matambaka)"  +ws.repeat(60)+    "PHP 160.00 per kilo\n"+
                                "[3] Beef (Tenderloin)"  +ws.repeat(58)+   "PHP 360.00 per kilo\n"+
                                "[4] Chicken (Drumstick)"  +ws.repeat(54)+ "PHP 280.00 per kilo\n"+
                                "=========================================================================\n"+
                                "[5] Back";
                        int meat = Integer.parseInt(JOptionPane.showInputDialog(mt));
                        while (meat != 5) {
                            if (meat == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kilo/s of pork (pierna) do you want:"));
                                price = 35;
                                String popiprod = "Pork (Pierna)";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(popiprod).append(ws.repeat(43 - (2*popiprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (meat == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kilo/s of fish (Matambaka) do you want:"));
                                price = 6;
                                String fmprod = "Fish (Matambaka)";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(fmprod).append(ws.repeat(43 - (2*fmprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (meat == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kilo/s of beef (tenderloin) do you want:"));
                                price = 5;
                                String btprod = "Beef Tenderloin";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(btprod).append(ws.repeat(43 - (2*btprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (meat == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kilo/s of chicken (Drumstick) do you want:"));
                                price = 5;
                                String cdprod = "Chicken (Drumstick)";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cdprod).append(ws.repeat(43 - (2*cdprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (meat >5 || meat<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            meat = Integer.parseInt(JOptionPane.showInputDialog(mt));
                        }
                    } else if (ingdts >3 || ingdts<0){
                        JOptionPane.showMessageDialog(null, "Invalid ingredient section");
                    }
                    ingdts = Integer.parseInt(JOptionPane.showInputDialog(ing));
                }
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            else if (slct == 4)
            {
                String sp = """
                        Enter the kind of soap you want to buy:
                        =======================================
                        [1] Baby soap
                        [2] Kitchen soap
                        [3] Bath soap
                        [4] Laundry soap
                        =======================================
                        [5] Back
                        """;
                int soap = Integer.parseInt(JOptionPane.showInputDialog(sp));
                while (soap != 5) {
                    if (soap == 1) {
                        String bsp =
                                "Enter the brand of baby soap choice/s:\n"+
                                "===============================================================================================\n"+
                                "[1] Aveeno"  +ws.repeat(80)+ "PHP 917.00 per bottle"+ "\n"+
                                "[2] Euricin"   +ws.repeat(78)+ "PHP 969.00 per bottle"+ "\n"+
                                "[3] Nature's Baby"   +ws.repeat(66)+ "PHP 1270.00 per bottle"+ "\n"+
                                "[4] CeraVe"    +ws.repeat(80)+   "PHP 1000.00 per bottle"+ "\n"+
                                "[5] Babyganics Shampoo + Body wash"  +ws.repeat(32)+ "PHP 845.00 per bottle"+ "\n"+
                                "[6] Burt's Bees"     +ws.repeat(70)+   "PHP 1255.00 per bottle"+ "\n"+
                                "[7] Johnson's Head-to-Toe Wash and Shampoo"  +ws.repeat(18)+  "PHP 460.00 per bottle"+ "\n"+
                                "==============================================================================================\n"+
                                "[8] Back";
                        int b_soap = Integer.parseInt(JOptionPane.showInputDialog(bsp));
                        while (b_soap != 8) {
                            if (b_soap == 1)
                            {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Aveeno do you want:"));
                                price = 917;
                                String avprod = "Aveeno";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(avprod).append(ws.repeat(43 - (2*avprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Euricin do you want:"));
                                price = 969;
                                String euprod = "Euricin";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(euprod).append(ws.repeat(43 - (2*euprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Nature's Baby do you want:"));
                                price = 1270;
                                String nsbprod = "Nature's Baby";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(nsbprod).append(ws.repeat(43 - (2*nsbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many CeraVe do you want:"));
                                price = 1000;
                                String crprod = "Cerave";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(crprod).append(ws.repeat(43 - (2*crprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 5) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Babyganics Shampoo + Body wash do you want:"));
                                price = 845;
                                String bsprod = "Babyganics Shampoo";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(bsprod).append(ws.repeat(43 - (2*bsprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 6) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Burt's Bees do you want:"));
                                price = 1255;
                                String bbprod = "Burt's Bees";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(bbprod).append(ws.repeat(43 - (2*bbprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap == 7) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Johnson's Head-to-Toe Wash and Shampoo do you want:"));
                                price = 460;
                                String jhyywnaprod = "Johnson's Head-to-Toe Wash and Shampoo";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(jhyywnaprod).append(ws.repeat(43 - (2*jhyywnaprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (b_soap >8 || b_soap<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            b_soap = Integer.parseInt(JOptionPane.showInputDialog(bsp));
                        }
                    } else if (soap == 2) {
                        String ksp =
                                "Enter the kind of kitchen soap choice/s:\n"+
                                "==============================================================\n"+
                                "[1] Joy paste"     +ws.repeat(74)+  "php 50.00 each\n"+
                                "[2] Joy liquid"   +ws.repeat(72)+   "php 35.00 each\n"+
                                "[3] Smart paste"   +ws.repeat(70)+  "php 35.00 each\n"+
                                "[4] Smart liquid"  +ws.repeat(68)+  "php 25.00 each\n"+
                                "==============================================================\n"+
                                "[5] Back";
                        int k_soap = Integer.parseInt(JOptionPane.showInputDialog(ksp));
                        while (k_soap != 5) {
                            if (k_soap == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many joy paste do you want:"));
                                price = 50;
                                String jpprod = "Joy Paste";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(jpprod).append(ws.repeat(43 - (2*jpprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (k_soap == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many joy liquid do you want:"));
                                price = 35;
                                String jlprod = "Joy Liquid";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(jlprod).append(ws.repeat(43 - (2*jlprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (k_soap == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many smart paste do you want:"));
                                price = 35;
                                String spaprod = "Smart Paste";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(spaprod).append(ws.repeat(43 - (2*spaprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (k_soap == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many smart liquid do you want:"));
                                price = 25;
                                String slprod = "Smart Liquid";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(slprod).append(ws.repeat(43 - (2*slprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (k_soap >5 || k_soap<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            k_soap = Integer.parseInt(JOptionPane.showInputDialog(ksp));
                        }
                    } else if (soap == 3) {
                        String btsp =
                                "Enter your bath soap choice/s:\n"+
                                "==============================================================================\n"+
                                "[1] Dr. S Wong - sulfur soap"  +ws.repeat(44)+   "PHP 35.00 per bar\n"+
                                "[2] Safeguard"   +ws.repeat(74)+   "PHP 30.00 per bar\n"+
                                "[3] Caoi"       +ws.repeat(84)+     "PHP 50.00 per bar\n"+
                                "==============================================================================\n"+
                                "[4] Back";
                        int bth_soap = Integer.parseInt(JOptionPane.showInputDialog(btsp));
                        while (bth_soap != 4) {
                            if (bth_soap == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Dr. S Wong - sulfur soap/s plain do you want:"));
                                price = 35;
                                String drwprod = "Dr. S Wong - Sulfur Soap";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(drwprod).append(ws.repeat(43 - (2*drwprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bth_soap == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Safeguard soap/s do you want:"));
                                price = 30;
                                String sgprod = "Safeguard";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(sgprod).append(ws.repeat(43 - (2*sgprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (bth_soap == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many Caoi/s do you want:"));
                                price = 50;
                                String cprod = "Caoi";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cprod).append(ws.repeat(43 - (2*cprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if(bth_soap >4 || bth_soap<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            bth_soap = Integer.parseInt(JOptionPane.showInputDialog(btsp));
                        }
                    } else if (soap == 4) {
                        String lsp =
                                "Enter your laundry soap choice/s:\n"+
                                "============================================================\n"+
                                "[1] Surf"  +ws.repeat(84)+   "PHP 8.00 per sachet\n"+
                                "[2] Wings"  +ws.repeat(82)+  "PHP 6.00 per sachet\n"+
                                "[3] Calla"   +ws.repeat(82)+ "PHP 10.00 per sachet\n"+
                                "[4] Speed"   +ws.repeat(82)+ "PHP 5.00 per sachet\n"+
                                "============================================================\n"+
                                "[5] Back";
                        int l_soap = Integer.parseInt(JOptionPane.showInputDialog(lsp));
                        while (l_soap != 5) {
                            if (l_soap == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many sachet/s of surf do you want:"));
                                price = 35;
                                String sprod = "Surf";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(sprod).append(ws.repeat(43 - (2*sprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (l_soap == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much sachet/s of wings do you want:"));
                                price = 6;
                                String wprod = "Wings";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(wprod).append(ws.repeat(43 - (2*wprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (l_soap == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much sachet/s of calla do you want:"));
                                price = 5;
                                String calprod = "Calla";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(calprod).append(ws.repeat(43 - (2*calprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (l_soap == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How much sachet/s of speed do you want:"));
                                price = 5;
                                String speprod = "Speed";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(speprod).append(ws.repeat(43 - (2*speprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (l_soap >5 || l_soap<0) {
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            l_soap = Integer.parseInt(JOptionPane.showInputDialog(lsp));
                        }
                    } else if (soap >6 || soap<0){
                        JOptionPane.showMessageDialog(null, "Invalid soap section");
                    }
                    soap = Integer.parseInt(JOptionPane.showInputDialog(sp));
                }
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            else if (slct == 5)
            {
                String other ="""
                        Enter the other things you want to buy:
                        =======================================
                        [1] Tissue/ table napkin
                        [2] Towel
                        [3] Disinfectant
                        =======================================
                        [4] Back""";
                int oth = Integer.parseInt(JOptionPane.showInputDialog(other));
                while (oth !=4) {
                    if (oth == 1) {
                        String tiss =
                                "Enter your tissue choice/s:\n"+
                                "===============================================================\n"+
                                "[1] Joy"      +ws.repeat(86)+    "PHP 45.00 per roll\n"+
                                "[2] Puff"     +ws.repeat(84)+    "PHP 30.00 per roll\n"+
                                "[3] Kleenex"   +ws.repeat(78)+   "PHP 30.00 per roll\n"+
                                "[4] Cushelle"   +ws.repeat(76)+  "PHP 30.00 per roll\n"+
                                "[5] Lotus"      +ws.repeat(82)+  "PHP 40.00 per roll\n"+
                                "===============================================================\n"+
                                "[6] Back";
                        int tsu = Integer.parseInt(JOptionPane.showInputDialog(tiss));
                        while (tsu != 6) {
                            if (tsu == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many roll/s of joy do you want:"));
                                price = 45;
                                String jtisprod = "Joy Tissue";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(jtisprod).append(ws.repeat(43 - (2*jtisprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (tsu == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many roll/s of puff do you want:"));
                                price = 30;
                                String ptisprod = "Puff Tissue";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(ptisprod).append(ws.repeat(43 - (2*ptisprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (tsu == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many roll/s of kleenex do you want:"));
                                price = 30;
                                String ktisprod = "Kleenex Tissue";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(ktisprod).append(ws.repeat(43 - (2*ktisprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (tsu == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many roll/s of cushelle do you want:"));
                                price = 30;
                                String cutisprod = "Cushelle Tissue";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(cutisprod).append(ws.repeat(43 - (2*cutisprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (tsu == 5) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many roll/s of lotus do you want:"));
                                price = 40;
                                String lottisprod = "Lotus Tissue";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(lottisprod).append(ws.repeat(43 - (2*lottisprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (tsu >6 || tsu<0){
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            tsu = Integer.parseInt(JOptionPane.showInputDialog(tiss));
                        }
                    } else if (oth == 2) {
                        String towl =
                                "Enter your towel choice/s:\n"+
                                "==================================================================\n"+
                                "[1] Bath towel"    +ws.repeat(72)+   "PHP 125.00 each\n"+
                                "[2] Kitchen towel"  +ws.repeat(66)+  "PHP 35.00 each\n"+
                                "[3] Sweat towel"    +ws.repeat(70)+  "PHP 60.00 each\n"+
                                "==================================================================\n"+
                                "[4] Back";
                        int twl = Integer.parseInt(JOptionPane.showInputDialog(towl));
                        while (twl != 4) {
                            if (twl == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many bath towel/s do you want:"));
                                price = 125;
                                String btprod = "Bath Towel";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(btprod).append(ws.repeat(43 - (2*btprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (twl == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many kitchen towel/s do you want:"));
                                price = 35;
                                String ktowprod = "Kitchen Towel";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(ktowprod).append(ws.repeat(43 - (2*ktowprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (twl == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many sweat towel/s do you want:"));
                                price = 60;
                                String stowprod = "Sweat Towel";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(stowprod).append(ws.repeat(43 - (2*stowprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (twl >4 || twl<0) {
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            twl = Integer.parseInt(JOptionPane.showInputDialog(towl));
                        }
                    } else if (oth == 3) {
                        String disft =
                                "Enter your disinfectant choice/s:\n"+
                                "===============================================================================\n"+
                                "[1] Alcohol"		+ws.repeat(78)+	"PHP 150.00 per gallon\n"+
                                "[2] Bleach"	+ws.repeat(80)+		"PHP 100.00 per gallon\n"+
                                "[3] Hand sanitizer"	+ws.repeat(64)+"PHP 145.00 per bottle\n"+
                                "[4] Aerosol"	+ws.repeat(78)+		"PHP 235.00 per can (170 grams)\n"+
                                "===============================================================================\n"+
                                "[5] Back";
                        int dsft = Integer.parseInt(JOptionPane.showInputDialog(disft));
                        while (dsft != 5) {
                            if (dsft == 1) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many gallon/s of alcohol do you want:"));
                                price = 150;
                                String alcprod = "Alcohol";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(alcprod).append(ws.repeat(43 - (2*alcprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (dsft == 2) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many gallon/s of bleach do you want:"));
                                price = 100;
                                String blhprod = "Bleach";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(blhprod).append(ws.repeat(43 - (2*blhprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (dsft == 3) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many bottle/s of hand sanitizer do you want:"));
                                price = 145;
                                String hsprod = "Hand Sanitizer";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(hsprod).append(ws.repeat(43 - (2*hsprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            } else if (dsft == 4) {
                                qty = Integer.parseInt(JOptionPane.showInputDialog("How many can/s of aerosol do you want:"));
                                price = 235;
                                String aeroprod = "Aerosol";
                                u_price = qty * price;
                                t_price += u_price;
                                rcpt.append(aeroprod).append(ws.repeat(43 - (2*aeroprod.length()))).append("PHP ").append(price).append(ws.repeat(7)).append(qty).append(ws.repeat(5)).append(u_price).append("\n");
                            }else if (dsft >5 || dsft<0) {
                                JOptionPane.showMessageDialog(null, "Invalid product");
                            }
                            dsft = Integer.parseInt(JOptionPane.showInputDialog(disft));
                        }
                    } else if (oth >4 || oth<0){
                        JOptionPane.showMessageDialog(null, "Invalid food section");
                    }
                    oth = Integer.parseInt(JOptionPane.showInputDialog(other));
                }
                slct = Integer.parseInt(JOptionPane.showInputDialog(selct));
            }
            else if(slct == 6)
            {
                JOptionPane.showMessageDialog(null, "Products" + ws.repeat(30)+"Price" + ws.repeat(7)+"Qty"+ws.repeat(8)+"Sub Total" +
                        "\n=============================================\n"
                        + rcpt +
                        "==============================================\n" +
                        "Total" +ws.repeat(62)+"PHP "+ t_price);
                float cash = Float.parseFloat(JOptionPane.showInputDialog("Enter cash amount:")), change;
                if (cash >= t_price){
                    change = cash- t_price;
                    JOptionPane.showMessageDialog(null,"Your change is PHP "+ change);
                    JOptionPane.showMessageDialog(null, "Thank you for visiting our store! Please come again!");
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient cash");
                }
            }
            else if (slct == 0)
            {
                System.exit(0);
            }
            else if (slct >6 || slct<1){
                JOptionPane.showMessageDialog(null, "Invalid choice");
                }
            }

        }
    }