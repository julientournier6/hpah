package core;

import static core.BasicClass.printHeader;
import static core.BasicClass.wizard;

public class year2 {

    public static boolean goodSpell;

    public static void main(){
        introYear2();
        preBattleYear2();
        battle();
    }

    public static void introYear2(){
        System.out.println("""
                Bienvenue en seconde année à Poudlard !
                Cette seconde année va être un bon moyen de se former aux duels.
                Un duel est d'ailleurs programmé pour ce soir...""");
        BasicClass.anythingToContinue();
        BasicClass.clearConsole();
        System.out.println("""
                Vous affrontez votre rivale en duel. Il faut a tout prix le ridiculiser.
                Quel sort utilisez vous ?
                1. Avada Kedavra
                2. Accio
                3. Bombarda Maxima""");
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


    public static void attack2(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
            System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.basilic.setCurrentHp(Enemy.basilic.getCurrentHp()- Enemy.basilic.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.basilic.getName() + " a subi " + Enemy.basilic.getAttack() +", il lui reste " + Enemy.basilic.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
                System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.basilic.setCurrentHp(Enemy.basilic.getCurrentHp()- Enemy.basilic.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.basilic.getName() + " a subi " + Enemy.basilic.getAttack() +", il lui reste " + Enemy.basilic.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
                System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.basilic.setCurrentHp(Enemy.basilic.getCurrentHp()- Enemy.basilic.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.basilic.getName() + " a subi " + Enemy.basilic.getAttack() +", il lui reste " + Enemy.basilic.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
                System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.basilic.setCurrentHp(Enemy.basilic.getCurrentHp()- Enemy.basilic.getAttack());
            System.out.println("Le " + Enemy.basilic.getName() + " a subi " + Enemy.basilic.getAttack() +", il lui reste " + Enemy.basilic.getCurrentHp() + "points de vie");
        }
    }
    public static void battle(){
        //boucle bataille
        while (true){
            BasicClass.clearConsole();
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.basilic.getName() + "\nHP : " + Enemy.basilic.getCurrentHp() + "/" + Enemy.basilic.getMaxHp());
            BasicClass.printHeader(wizard.getName()+ "\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.basilic.setCurrentHp(Enemy.basilic.getCurrentHp()- wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.basilic.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
                System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            } else if (input==2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense()+1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+wizard.getDefense()+" de protection.");
                BasicClass.anythingToContinue();
                attack2();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.basilic.getAttack());
                System.out.println("Vous avez subit "+Enemy.basilic.getAttack()+" de dégats.");
                BasicClass.anythingToContinue();
            }
            if(wizard.getCurrentHp() < 0){
                Battle.gameOver();
                break;
            } else if (Enemy.basilic.getCurrentHp() < 0) {
                Enemy.basilic.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez tué le "+Enemy.basilic.getName()+" ! ");
                break;


            }

        }
    }
}
