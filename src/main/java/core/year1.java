package core;

import static core.BasicClass.printHeader;

public class year1 {
    public static boolean goodSpell;
    static int defense = 0;
    public static void main(){
        introYear1();
        preBattleYear1();

    }

    public static void introYear1(){
        BasicClass.clearConsole();
        System.out.println("""
                Bienvenue dans ton premier cours de sortilège.
                Tu vas apprendre le sortilège Wingardium Leviosa.
                Répète après moi : Wingardium Leviosa
                1. Wingardium Leviosa
                2. Wingardium Levioooosa
                2. Wangardium Leviosa""");
        while (goodSpell){
            int input =BasicClass.readInt("Lequel à la bonne prononciation ?",3);
            if (input==1){
                System.out.println("Bravo, vous avez bien appris le sortilège");
            }else {
                goodSpell=false;
            }
        }
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear1(){
        BasicClass.clearConsole();
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
            BasicClass.printHeader(Enemy.troll.getName() + "\nHP : " + Enemy.troll.getCurrentHp() + "/" + Enemy.troll.getMaxHp());
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
                //Les potions
                return;
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
    }
}
