package core;

import static core.BasicClass.printHeader;

public class year2 {

    public static boolean goodSpell;
    static int defense = 0;
    public static void main(){
        introYear2();
        preBattleYear2();
    }

    public static void introYear2(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous affrontez votre rivale en duel. Il faut a tout prix le ridiculiser.
                Quel sort utilisez vous ?
                1. Avada Kedavra
                2. Accio
                2. Bombarda Maxima""");
        while (goodSpell){
            int input =BasicClass.readInt("Quel sort choisissez vous ?",3);
            if (input==2){
                System.out.println("Vous avez réussi a attraper sa peruque. Vous remportez le duel en le ridiculisant de la plus belle des manières !");
            }else {
                goodSpell=false;
                System.out.println("Pas ici voyons !");
            }
        }
        System.out.println("Vous vous dites que Accio est un sort plutôt utile ! Il faudrait le garder en mémoire...");
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear2(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous décidez d'aller aux toilettes du 5ème étage. Vous voyez un étrange symbole. C'est un serpent incrusté sur un robinet.
                Vous décider de parler en langue des serpents. Une porte s'ouvre devant vous, vous décidez d'entrer.
                Vous êtes maintenant dans une grande pièce.
                Un immense basilic se dresse devant vous.
                Attention à ne pas croiser son regard...""");
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
            BasicClass.printHeader(Enemy.enemy[0] + "\nHP : " + Enemy.currentHp + "/" + Enemy.maxHp);
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