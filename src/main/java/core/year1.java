package core;

import static core.BasicClass.*;

public class year1 {
    static boolean goodSpell = false;

    static int defense = 0;
    public static void main(){
        introYear1();
        preBattleYear1();
        battle();
        outroYear1();

    }

    public static void introYear1(){
        BasicClass.clearConsole();
        BasicClass.printHeader("Année 1");
        System.out.println("""
                Bienvenue dans ton premier cours de sortilège.
                L'objectif est de soulever une plume.
                Tu vas donc apprendre le sortilège Wingardium Leviosa.
                Répète après moi : Wingardium Leviosa
                1. Wingardium Leviosa
                2. Wingardium Levioooosa
                3. Wangardium Leviosa""");
        while (goodSpell == false){
            int input = BasicClass.readInt("Lequel à la bonne prononciation ?",3);
            if (input==1){
                System.out.println("Bravo, vous avez bien appris le sortilège.");
                BasicClass.anythingToContinue();
                goodSpell = true;
            }else {
                goodSpell=false;
                System.out.println("Ce n'est pas la bonne prononciation. La plume que tu essaies de bouger ne s'envole pas...");
            }
        }
    }

    public static void preBattleYear1(){
        BasicClass.anythingToContinue();
        BasicClass.clearConsole();
        BasicClass.printHeader(BasicClass.places[1]);
        System.out.println("""
                Votre année se déroule sans encombre, un soir, vous passez devant les Toilettes du Donjon, et vous y entendez un bruit suspect.
                Vous décidez d'aller jeter un oeil.
                Vous entrez et vous voyez un Troll, qui tente de vous assenez un coup de massue, vous parvenez à l'esquiver, mais l'entrée et maintenant condamnée.
                Pas le choix, il va falloir l'affronter !""");
        BasicClass.anythingToContinue();
        BasicClass.clearConsole();
    }

    public static void attack1(){
        int attack = Character.attack();
        if(defense == 0){
            System.out.println("On vous attaque !");
            int hit = Enemy.attack();
            System.out.println("Vous avez subit "+hit+" de dégats.");
        } else if (defense == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                int attack = Character.attack();
            }else {
                int hit = Enemy.attack();
                System.out.println("Vous avez subit "+hit+" de dégats.");
            }
        }else if (defense==2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                int attack = Character.attack();
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
            } else {
                int hit = Enemy.attack();
                System.out.println("Vous avez subit " + hit + " de dégats.");
            }
        }else if (defense==3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                int attack = Character.attack();
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
            } else {
                int hit = Enemy.attack();
                System.out.println("Vous avez subit " + hit + " de dégats.");
            }
        }else {
            int hit = Enemy.attack();
            System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
        }
    }
    public static void battle(Enemy detraqueurs, Boss boss){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.troll.getName()+"\nHP : " + Enemy.troll.getCurrentHp() + "/" + Enemy.troll.getMaxHp());
            BasicClass.printHeader("Votre sorcier\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                attack1();
            } else if (input==2) {
                //Se protéger
                int defense = 0;
                defense = defense + 1;
                int hit = Enemy.attack;
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+defense+"/4 de protection.\r\nVous avez subit "+hit+" de dégats.");
            }else {
                System.out.println("Vous vous soignez");
                wizard.setCurrentHp(wizard.getCurrentHp()+20);
                if(wizard.getCurrentHp()>100){
                    wizard.setCurrentHp(100);
                }
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.troll.getAttack());
                System.out.println("Vous avez subit "+Enemy.troll.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(Character.currentHp < 0){
                Battle.gameOver();
                break;
            } else if (enemy.currentHp < 0) {
                Enemy.currentHp=0;
                BasicClass.clearConsole();
                printHeader("Vous avez tué le "+Enemy.enemy[0]+" ! ");

            }

        }
        BasicClass.anythingToContinue();
    }

    public static void outroYear1(){
        System.out.println("""
                Les professeurs arrivent juste après que vous ayiez battu le Troll.
                Vous craignez les ennuies mais ils semblent soulagés.
                Le reste de votre année se passe sans encombre, vous passez en seconde année.
                """);
        BasicClass.anythingToContinue();
    }
}
