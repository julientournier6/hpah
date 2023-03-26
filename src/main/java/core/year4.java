package core;

import static core.BasicClass.printHeader;
import static core.BasicClass.wizard;

public class year4 {
    static boolean goodWay1 = false;
    static boolean goodWay2 = false;
    static boolean goodWay3 = false;
    static int defense = 0;

    public static void main() {
        introYear4();
        preBattleYear4();
        battle();
        battle2();


    }

    public static void introYear4() {
        BasicClass.clearConsole();
        System.out.println("""
                Bienvenue en 4ème année !
                Cette année est quelque peu particulière, Poudlard accueil le Tournoi des 3 Sorciers.
                Seul les sorciers de 17 ans ou plus peuvent y participer, et un sorcier de Poudlard, Beauxbâtons et Durmstrang sera sélectionné.
                Vous aurez un mois pour déposer votre nom dans la coupe pour participer.""");
        System.out.println("");
        BasicClass.anythingToContinue();

    }

    public static void preBattleYear4(){
        maze1();
        maze2();
        maze3();
    }

    public static void maze1(){
        System.out.println("""
                Vous êtes en final du tournoi des 3 sorciers !
                Vous entrez dans le labyrinthe. Il faut maintenant trouver le chemin vers la coupe des trois Sorciers
                Vous allez :
                1. A gauche
                2. A droite
                3. Tout droit""");

        while (goodWay1==false) {
            int input1 = BasicClass.readInt("->", 3);
            if (input1 == 2) {
                goodWay1 = true;
                System.out.println("Vous avancez sereinement.");
                BasicClass.anythingToContinue();
            } else if (input1 == 1) {
                goodWay1 = true;
                System.out.println("Des buits étrange sont se font entendre autour de vous, mais vous arrivez à avancer");
                BasicClass.anythingToContinue();
            } else {
                goodWay1 = false;
                System.out.println("Pas ici voyons !");
            }
        }
    }
    public static void maze2(){
        System.out.println("""
                Vous êtes en final du tournoi des 3 sorciers !
                Vous entrez dans le labyrinthe. Il faut maintenant trouver le chemin vers la coupe des trois Sorciers
                Vous allez :
                1. A gauche
                2. A droite
                3. Tout droit""");
        while (goodWay2==false) {
            int input2 = BasicClass.readInt("->", 3);
            if (input2 == 2) {
                System.out.println("Vous avancez sereinement. Vous voyez quelque chose briller derriere une haie");
                goodWay2 = true;
                BasicClass.anythingToContinue();
            } else if (input2 == 1) {
                System.out.println("Un monstre, rebroussez chemin rapidement pour qu'il ne vous vois pas.");
                goodWay2 = false;
            } else {
                System.out.println("Vous entendez un sifflement, par prudence vous reculez");
                goodWay2 = false;
            }
        }
    }

    public static void maze3(){
        System.out.println("""
                Vous sentez que le trophée est tout proche. Vous pouvez même dicerner une lumière de plus en plus puissante.
                Vous allez :
                1. A gauche
                2. A droite
                3. Tout droit""");
        while (goodWay3=false) {
            int input3 = BasicClass.readInt("->", 3);
            if (input3 == 2) {
                System.out.println("Une racine vous attrape le pied, vous arrivez à vous en défaire tant bien que mal.");
                goodWay3 = false;
            } else if (input3 == 1) {
                System.out.println("Un monstre, rebroussez chemin rapidement pour qu'il ne vous vois pas.");
                goodWay3 = false;
            } else {
                System.out.println("Vous apercrevez le Trophée, vous courrez vers lui pour le brandir, mais au moment ou vous l'effleurez vous vous sentez aspiré...");
                goodWay3 = true;
                BasicClass.anythingToContinue();
            }

        }
    }

    public static void attack4(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
            System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.peterpettigrow.setCurrentHp(Enemy.peterpettigrow.getCurrentHp()- Enemy.peterpettigrow.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.peterpettigrow.getName() + " a subi " + Enemy.peterpettigrow.getAttack() +", il lui reste " + Enemy.peterpettigrow.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
                System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.peterpettigrow.setCurrentHp(Enemy.peterpettigrow.getCurrentHp()- Enemy.peterpettigrow.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.peterpettigrow.getName() + " a subi " + Enemy.peterpettigrow.getAttack() +", il lui reste " + Enemy.peterpettigrow.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
                System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.peterpettigrow.setCurrentHp(Enemy.peterpettigrow.getCurrentHp()- Enemy.peterpettigrow.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.peterpettigrow.getName() + " a subi " + Enemy.peterpettigrow.getAttack() +", il lui reste " + Enemy.peterpettigrow.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
                System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.peterpettigrow.setCurrentHp(Enemy.peterpettigrow.getCurrentHp()- Enemy.peterpettigrow.getAttack());
            System.out.println("Le " + Enemy.peterpettigrow.getName() + " a subi " + Enemy.peterpettigrow.getAttack() +", il lui reste " + Enemy.peterpettigrow.getCurrentHp() + "points de vie");
        }
    }
    public static void battle(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.voldemort.getName() + "\nHP : " + Enemy.voldemort.getCurrentHp() + "/" + Enemy.voldemort.getMaxHp());
            BasicClass.printHeader(Enemy.peterpettigrow.getName() + "\nHP : " + Enemy.peterpettigrow.getCurrentHp() + "/" + Enemy.peterpettigrow.getMaxHp());
            BasicClass.printHeader(wizard.getName()+ "\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printHeader("\nLe "+Enemy.trophy.getName() + " est à " + Enemy.trophy.getCurrentHp() + "! Il faudrait que vous puissiez le toucher pour retourner à Poudlard.\n Vous ne pouvez pas bouger ou l'on vous assassinera.");
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Accio\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.peterpettigrow.setCurrentHp(Enemy.peterpettigrow.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.peterpettigrow.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
                System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack4();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.peterpettigrow.getAttack());
                System.out.println("Vous avez subit "+Enemy.peterpettigrow.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.peterpettigrow.getCurrentHp() < 0) {
                Enemy.peterpettigrow.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez mit K.O "+Enemy.peterpettigrow.getName()+" ! ");
                break;


            }

        }
    }

    public static void battle2(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.voldemort.getName() + "\nHP : " + Enemy.voldemort.getCurrentHp() + "/" + Enemy.voldemort.getMaxHp());
            BasicClass.printHeader(wizard.getName()+ "\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printHeader("\nLe "+Enemy.trophy.getName() + " est à " + Enemy.trophy.getCurrentHp() + "! Il faudrait que vous puissiez le toucher pour retourner à Poudlard.\n Vous ne pouvez pas bouger ou l'on vous assassinera.");
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Accio\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez réussi à rapprocher le Trophée de " + Enemy.trophy.getName() + " mètres." );
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
                System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack4();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
                System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.voldemort.getCurrentHp() < 0) {
                Enemy.voldemort.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous effleurez le "+Enemy.trophy.getName()+" ! \n Vous vous sentez aspiré en voyant des lumières verte jaillissant autour de votre tête.");
                break;


            }

        }
    }

}

