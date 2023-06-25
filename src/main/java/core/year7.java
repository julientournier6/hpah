package core;

import static core.BasicClass.*;

public class year7  {
    public static void main(){
        introYear7();
        preBattleYear7();
        battle7();
        interBattle();
        battle75();
        outroYear7();
    }

    public static void introYear7(){
        BasicClass.clearConsole();
        BasicClass.printHeader("Année 7");
        System.out.println("""
                Bienvenue en septième année. Vous ne serez pas à Poudlard cette année, vous partez à la chasse aux Horcruxe pour tuer Voldemort. Il est devenu bien trop dangereux
                Personne ne sait où vous vous cachez, et personne ne doit le savoir.
                """);
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear7(){

    }

    public static void attack7(){
        BasicClass.printHeader(BasicClass.places[7]);
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
            System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.bellatrix.setCurrentHp(Enemy.bellatrix.getCurrentHp()- Enemy.bellatrix.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.bellatrix.getName() + " a subi " + Enemy.bellatrix.getAttack() +", il lui reste " + Enemy.bellatrix.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
                System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.bellatrix.setCurrentHp(Enemy.bellatrix.getCurrentHp()- Enemy.bellatrix.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.bellatrix.getName() + " a subi " + Enemy.bellatrix.getAttack() +", il lui reste " + Enemy.bellatrix.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
                System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.bellatrix.setCurrentHp(Enemy.bellatrix.getCurrentHp()- Enemy.bellatrix.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.bellatrix.getName() + " a subi " + Enemy.bellatrix.getAttack() +", il lui reste " + Enemy.bellatrix.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
                System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.bellatrix.setCurrentHp(Enemy.bellatrix.getCurrentHp()- Enemy.detraqueurs.getAttack());
            System.out.println("Le " + Enemy.bellatrix.getName() + " a subi " + Enemy.bellatrix.getAttack() +", il lui reste " + Enemy.bellatrix.getCurrentHp() + "points de vie");
        }
    }
    public static void battle7(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.bellatrix.getName() + "\nHP : " + Enemy.bellatrix.getCurrentHp() + "/" + Enemy.bellatrix.getMaxHp());
            BasicClass.printHeader("Votre sorcier\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.bellatrix.setCurrentHp(Enemy.bellatrix.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.bellatrix.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
                System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack7();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("Vous vous soignez");
                wizard.setCurrentHp(wizard.getCurrentHp()+20);
                if(wizard.getCurrentHp()>100){
                    wizard.setCurrentHp(100);
                }
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.bellatrix.getAttack());
                System.out.println("Vous avez subit "+Enemy.bellatrix.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.bellatrix.getCurrentHp() < 0) {
                Enemy.bellatrix.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez tué le "+Enemy.bellatrix.getName()+" ! ");
                break;


            }

        }
    }

    public static void interBattle(){
        BasicClass.clearConsole();
        System.out.println("Bellatrix est à terre, plus aucun rempart ne vous sépare de Voldemort. C'est entre lui et vous.\nA vous de jouer !");
        BasicClass.anythingToContinue();
    }

    public static void attack75(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
            System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- Enemy.voldemort.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.voldemort.getName() + " a subi " + Enemy.voldemort.getAttack() +", il lui reste " + Enemy.voldemort.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
                System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- Enemy.voldemort.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.voldemort.getName() + " a subi " + Enemy.voldemort.getAttack() +", il lui reste " + Enemy.voldemort.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
                System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- Enemy.voldemort.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.voldemort.getName() + " a subi " + Enemy.voldemort.getAttack() +", il lui reste " + Enemy.voldemort.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.voldemort.getAttack());
                System.out.println("Vous avez subit "+Enemy.voldemort.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- Enemy.detraqueurs.getAttack());
            System.out.println("Le " + Enemy.voldemort.getName() + " a subi " + Enemy.voldemort.getAttack() +", il lui reste " + Enemy.voldemort.getCurrentHp() + "points de vie");
        }
    }
    public static void battle75(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.voldemort.getName() + "\nHP : " + Enemy.voldemort.getCurrentHp() + "/" + Enemy.voldemort.getMaxHp());
            BasicClass.printHeader("Votre sorcier\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.voldemort.setCurrentHp(Enemy.voldemort.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.voldemort.getName());
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
                attack75();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("Vous vous soignez");
                wizard.setCurrentHp(wizard.getCurrentHp()+20);
                if(wizard.getCurrentHp()>100){
                    wizard.setCurrentHp(100);
                }
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
                printHeader("Vous avez tué le "+Enemy.voldemort.getName()+" ! ");
                break;


            }

        }
    }

    public static void outroYear7(){
        BasicClass.clearConsole();
        System.out.println("""
                Ca y est. Voldemort est tombé.
                Il s'en est fallu de peu...
                Il est temps pour vous de reconstruire le monde des sorciers !""");
        BasicClass.anythingToContinue();
        BasicClass.printHeader("Merci d'avoir joué au jeu !");

    }


}
