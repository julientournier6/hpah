package core;

import static core.BasicClass.printHeader;
import static core.BasicClass.wizard;

public class year6 {

    public static void main(){
        introYear6();
        potionLessons();
        battle();
        year6Outro();
    }

    public static void introYear6(){
        BasicClass.clearConsole();
        BasicClass.printHeader("Année 6");
        System.out.println("""
                Bienvenue en sixième année, votre avant dernière année, si tout se passe bien...
                Ca y est, le monde est au courant, Voldemort est de retour.
                De nombreuses rumeurs disent que vous êtes l'élu, mais vous ne voyiez toujours pas comment vous pourriez combattre Voldemort.
                """);
        BasicClass.anythingToContinue();
    }

    public static void potionLessons(){
        BasicClass.clearConsole();
        BasicClass.printHeader(BasicClass.places[9]);
        System.out.println("""
                Bienvenue dans votre cours de potions.
                Votre manuel semble bien abimé, de nombreuses notes sont grifonnés sur les pages du livre.
                Votre professeur vous demande de préparer une potion complexe, à vous de choisir si vous préférez suivre les instructions du professeur ou celles griffonés...""");

        System.out.println("""
                Préparation des ingédients :
                1. Professeur : Couper avec la lame du couteau.
                2. Manuel griffoné : Ecraser avec le plat du couteau.
                """);
        int input1 =BasicClass.readInt("Que choisissez-vous",2);
        if (input1==1){
            System.out.println("Vous perdez un peu de temps, ces baies sont difficiles à couper. Vous vous en envoyez une dans l'oeil. Vous prenez quelques dégats.");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.potion.getAttack());
        }else {
            System.out.println("Ca semble être la bonne technique, vous avancez bien plus vite que les autres.");
        }
        BasicClass.anythingToContinue();
        System.out.println("""
                Cuisson au chaudron :
                1. Professeur : Tourner 3 fois dans le sens antihoraire, attendre 1 minute et répéter.
                2. Manuel griffoné : Tourner 1 fois dans le sens horaire puis 2 fois dans le sens antihoraire, attendre 1 minute et répéter.
                """);
        int input2 =BasicClass.readInt("Que choisissez-vous",2);
        if (input2==1){
            System.out.println("Vous ratez votre potion, votre chaudron se troue et la potion sur verse sur votre table qui se met à brûler. Vous prenez quelques dégats.");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.potion.getAttack());
        }else {
            System.out.println("Ca semble être la bonne technique, vous avancez bien plus vite que les autres. Votre potion est réussi !");
        }
        System.out.println("Votre potion est la meilleure de la classe. Vous voyez une formule 'Sectumsempra', vous la notez dans le coin de votre tête.");
        BasicClass.anythingToContinue();
    }

    public static void attack6(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
            System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.mangemorts.setCurrentHp(Enemy.mangemorts.getCurrentHp()- Enemy.mangemorts.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.mangemorts.getName() + " a subi " + Enemy.mangemorts.getAttack() +", il lui reste " + Enemy.mangemorts.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
                System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.mangemorts.setCurrentHp(Enemy.mangemorts.getCurrentHp()- Enemy.mangemorts.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.mangemorts.getName() + " a subi " + Enemy.mangemorts.getAttack() +", il lui reste " + Enemy.mangemorts.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
                System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.mangemorts.setCurrentHp(Enemy.mangemorts.getCurrentHp()- Enemy.mangemorts.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.mangemorts.getName() + " a subi " + Enemy.mangemorts.getAttack() +", il lui reste " + Enemy.mangemorts.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
                System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.mangemorts.setCurrentHp(Enemy.mangemorts.getCurrentHp()- Enemy.mangemorts.getAttack());
            System.out.println("Le " + Enemy.mangemorts.getName() + " a subi " + Enemy.mangemorts.getAttack() +", il lui reste " + Enemy.mangemorts.getCurrentHp() + "points de vie");
        }
    }
    public static void battle(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.mangemorts.getName() + "\nHP : " + Enemy.mangemorts.getCurrentHp() + "/" + Enemy.mangemorts.getMaxHp());
            BasicClass.printHeader("Votre sorcier\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.mangemorts.setCurrentHp(Enemy.mangemorts.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.mangemorts.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
                System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack6();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("Vous vous soignez");
                wizard.setCurrentHp(wizard.getCurrentHp()+20);
                if(wizard.getCurrentHp()>100){
                    wizard.setCurrentHp(100);
                }
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.mangemorts.getAttack());
                System.out.println("Vous avez subit "+Enemy.mangemorts.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.mangemorts.getCurrentHp() < 0) {
                Enemy.mangemorts.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez tué le "+Enemy.mangemorts.getName()+" ! ");
                break;


            }

        }
        BasicClass.anythingToContinue();
    }

    public static void year6Outro(){
        System.out.println("Vous avez chassé les Mangemorts de Poudlard !\nComment se sont-ils introduits dans l'école. \nDumbledore a été tué, Poudlard ne sera plus jamais comme avant...");
    }
}
