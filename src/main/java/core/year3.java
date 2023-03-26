package core;

import static core.BasicClass.printHeader;
import static core.BasicClass.wizard;

public class year3 {
    public static boolean goodSpell;
    static int defense = 0;
    public static void main(){
        introYear3();
        preBattleYear3();
        battle();
    }

    public static void introYear3(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous entrez dans le bureau du professeur Lupin, votre enseignant de Défense contre les Forces du Mal.
                Soudainement un détraqueur se dresse devant vous.
                "Ridiculous !", rugit Lupin.
                Ce que tu as vu c'est un épouventard sous la forme d'un détraqueur, utilise le sort Expecto Patronum face à eux pour les repousser.""");
        System.out.println("Vous vous dites que Expecto Patronum est un sort plutôt utile ! Il faudrait le garder en mémoire...");
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear3(){
        BasicClass.clearConsole();
        System.out.println("""
                Vous vous balladez à Pré au Lard, d'un coup, le ciel s'assombrit, le température chute.
                Pas de doutes, ce sont les détraqueurs que le professeur Lupin a mentionné lors de ses cours.
                D'un coup, 3 se dresse devant vous.
                Pas le choix, il faut les affronter.""");
        BasicClass.anythingToContinue();
        BasicClass.clearConsole();
    }

    public static void attack3(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
            System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.detraqueurs.setCurrentHp(Enemy.detraqueurs.getCurrentHp()- Enemy.detraqueurs.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.detraqueurs.getName() + " a subi " + Enemy.detraqueurs.getAttack() +", il lui reste " + Enemy.detraqueurs.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
                System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.detraqueurs.setCurrentHp(Enemy.detraqueurs.getCurrentHp()- Enemy.detraqueurs.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.detraqueurs.getName() + " a subi " + Enemy.detraqueurs.getAttack() +", il lui reste " + Enemy.detraqueurs.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
                System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.detraqueurs.setCurrentHp(Enemy.detraqueurs.getCurrentHp()- Enemy.detraqueurs.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.detraqueurs.getName() + " a subi " + Enemy.detraqueurs.getAttack() +", il lui reste " + Enemy.detraqueurs.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
                System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.detraqueurs.setCurrentHp(Enemy.detraqueurs.getCurrentHp()- Enemy.detraqueurs.getAttack());
            System.out.println("Le " + Enemy.detraqueurs.getName() + " a subi " + Enemy.detraqueurs.getAttack() +", il lui reste " + Enemy.detraqueurs.getCurrentHp() + "points de vie");
        }
    }
    public static void battle(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.detraqueurs.getName() + "\nHP : " + Enemy.detraqueurs.getCurrentHp() + "/" + Enemy.detraqueurs.getMaxHp());
            BasicClass.printHeader(wizard.getName()+ "\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.detraqueurs.setCurrentHp(Enemy.detraqueurs.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.detraqueurs.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
                System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack3();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.detraqueurs.getAttack());
                System.out.println("Vous avez subit "+Enemy.detraqueurs.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.detraqueurs.getCurrentHp() < 0) {
                Enemy.detraqueurs.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez tué le "+Enemy.detraqueurs.getName()+" ! ");
                break;


            }

        }
    }
}
