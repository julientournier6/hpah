package core;
import java.util.Scanner;
import static core.BasicClass.*;

public class year5 {
    public static void main(){
        introYear5();
        preLvlYear5();
        checkUserEntry1();
        checkUserEntry2();
        checkUserEntry3();
        preBattleYear5();
        battle();
        year5Outro();
    }

    public static void introYear5() {
        BasicClass.clearConsole();
        BasicClass.printHeader("Année 5");
        System.out.println("""
                Voldemort est de retour.
                Mais personne ne semble s'en préoccuper...
                Le Ministère de la Magie ne souhaite qu'à restreindre l'influence de Dumbledore.
                Une nouvelle professeure à Poudlard nommée Dolores Ombrage venant directement du Ministère surveille ses moindre faits et gestes, et elle semble vous avoir dans le collimateur.
                """);
        BasicClass.anythingToContinue();
    }


    public static void preLvlYear5(){
        BasicClass.clearConsole();
        BasicClass.printHeader(BasicClass.places[8]);
        System.out.println("""
                Vous êtes en retenu dans le Bureau de Dolores Ombrage.
                Elle vous demande de recopier un texte. A chaque fois que vous faites une faute, une douleur vous traverse la main.
                Quelque chose semble s'écrire sur votre main, mais quoi ?
                """);
    }



    public static void checkUserEntry1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le texte 'Bonjour !' : ");

        String entreeUtilisateur = scanner.nextLine();

        if (entreeUtilisateur.equals("Bonjour !")) {
            System.out.println("Les douleurs ne s'intensifient pas.");
        } else {
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombragePen.getAttack());
            System.out.println("Vous avez subit "+Enemy.ombragePen.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");

        }
    }

    public static void checkUserEntry2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le texte 'Bonjour !' : ");

        String entreeUtilisateur = scanner.nextLine();

        if (entreeUtilisateur.equals("Bonjour !")) {
            System.out.println("Les douleurs ne s'intensifient pas.");
        } else {
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombragePen.getAttack());
            System.out.println("Vous avez subit "+Enemy.ombragePen.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");

        }
    }

    public static void checkUserEntry3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le texte 'Bonjour !' : ");

        String entreeUtilisateur = scanner.nextLine();

        if (entreeUtilisateur.equals("Bonjour !")) {
            System.out.println("Les douleurs ne s'intensifient pas.");
        } else {
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombragePen.getAttack());
            System.out.println("Vous avez subit "+Enemy.ombragePen.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");

        }
        BasicClass.anythingToContinue();
    }

    public static void preBattleYear5(){
        System.out.println("""
                Dumbledore est parti.
                Poudlard n'est plus le même avec Ombrage en directrice.
                Des rumeurs circulent dans les couloirs disant que des choses vont se passer lors des examens...
                """);
        BasicClass.anythingToContinue();
    }

    public static void attack5(){
        if(wizard.getDefense() == 0){
            System.out.println("On vous attaque !");
            wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombrage.getAttack());
            System.out.println("Vous avez subit "+Enemy.ombrage.getAttack()+" de dégats.");
        } else if (wizard.getDefense() == 1) {
            System.out.println("On vous attaque !");
            Battle.defense25Percents();
            if (Battle.defense25Percents()){
                Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp()- Enemy.ombrage.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.ombrage.getName() + " a subi " + Enemy.ombrage.getAttack() +", il lui reste " + Enemy.ombrage.getCurrentHp() + "points de vie");
            }else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombrage.getAttack());
                System.out.println("Vous avez subit "+Enemy.ombrage.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 2) {
            System.out.println("On vous attaque !");
            Battle.defense50Percents();
            if (Battle.defense50Percents()) {
                Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp()- Enemy.ombrage.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.ombrage.getName() + " a subi " + Enemy.ombrage.getAttack() +", il lui reste " + Enemy.ombrage.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombrage.getAttack());
                System.out.println("Vous avez subit "+Enemy.ombrage.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else if (wizard.getDefense() == 3) {
            System.out.println("On vous attaque !");
            Battle.defense75Percents();
            if (Battle.defense75Percents()) {
                Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp()- Enemy.ombrage.getAttack());
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
                System.out.println("Le " + Enemy.ombrage.getName() + " a subi " + Enemy.ombrage.getAttack() +", il lui reste " + Enemy.ombrage.getCurrentHp() + "points de vie");
            } else {
                wizard.setCurrentHp(wizard.getCurrentHp()-Enemy.ombrage.getAttack());
                System.out.println("Vous avez subit "+Enemy.ombrage.getAttack()+" de dégats, il vous reste "+ wizard.getCurrentHp() + " points de vie");
            }
        }else {
            System.out.println("Niveau de protection maximum ! Vous renvoyez l'attaque");
            Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp()- Enemy.ombrage.getAttack());
            System.out.println("Le " + Enemy.ombrage.getName() + " a subi " + Enemy.ombrage.getAttack() +", il lui reste " + Enemy.ombrage.getCurrentHp() + "points de vie");
        }
    }
    public static void battle() {
        //boucle bataille
        while (true) {
            BasicClass.clearConsole();
            BasicClass.printHeader(BasicClass.places[5]);
            BasicClass.printSeparator(30);
            BasicClass.printHeader(Enemy.ombrage.getName() + "\nHP : " + Enemy.ombrage.getCurrentHp() + "/" + Enemy.ombrage.getMaxHp());
            BasicClass.printHeader(wizard.getName() + "\nHP : " + wizard.getCurrentHp() + "/" + wizard.getMaxHp());
            BasicClass.printSeparator(30);
            for (int i = 0; i < 3; i++) {
                System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
                int input = BasicClass.readInt("->", 3);
                //Conditions du tour du joueur
                if (input == 1) {
                    //La bagarre
                    System.out.println("Vous avez choisi d'attaquer !");
                    Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp() - wizard.getAttack());
                    System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.ombrage.getName());
                    BasicClass.anythingToContinue();
                    System.out.println("On vous attaque !");
                    wizard.setCurrentHp(wizard.getCurrentHp() - Enemy.ombrage.getAttack());
                    System.out.println("Vous avez subit " + Enemy.ombrage.getAttack() + " de dégats.");
                    BasicClass.anythingToContinue();
                } else if (input == 2) {
                    //Se protéger
                    System.out.println("Vous avez choisi de vous défendre !");
                    wizard.setDefense(wizard.getDefense() + 1);
                    System.out.println("Votre protection augmente de 1\r\nVous êtes au rang " + wizard.getDefense() + " de protection.");
                    BasicClass.anythingToContinue();
                    attack5();
                    BasicClass.anythingToContinue();
                } else {
                    System.out.println("On vous attaque !");
                    wizard.setCurrentHp(wizard.getCurrentHp() - Enemy.ombrage.getAttack());
                    System.out.println("Vous avez subit " + Enemy.ombrage.getAttack() + " de dégats.");
                    BasicClass.anythingToContinue();
                }

            }
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion\n\r4. Feux d'artifices");
            int input = BasicClass.readInt("->", 3);
            //Conditions du tour du joueur
            if (input == 1) {
                //La bagarre
                System.out.println("Vous avez choisi d'attaquer !");
                Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp() - wizard.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts au " + Enemy.ombrage.getName());
                BasicClass.anythingToContinue();
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp() - Enemy.ombrage.getAttack());
                System.out.println("Vous avez subit " + Enemy.ombrage.getAttack() + " de dégats.");
                BasicClass.anythingToContinue();
            } else if (input == 2) {
                //Se protéger
                System.out.println("Vous avez choisi de vous défendre !");
                wizard.setDefense(wizard.getDefense() + 1);
                System.out.println("Votre protection augmente de 1\r\nVous êtes au rang " + wizard.getDefense() + " de protection.");
                BasicClass.anythingToContinue();
                attack5();
                BasicClass.anythingToContinue();
            }else if (input == 4) {
                //La bagarre
                System.out.println("Vous utilisez les feux d'artifices");
                Enemy.ombrage.setCurrentHp(Enemy.ombrage.getCurrentHp() - Enemy.fireworks.getAttack());
                System.out.println("Vous avez infliger " + wizard.getAttack() + " degâts à " + Enemy.ombrage.getName());
                BasicClass.anythingToContinue();
                BasicClass.anythingToContinue();
            }else {
                System.out.println("On vous attaque !");
                wizard.setCurrentHp(wizard.getCurrentHp() - Enemy.ombrage.getAttack());
                System.out.println("Vous avez subit " + Enemy.ombrage.getAttack() + " de dégats.");
                BasicClass.anythingToContinue();
            }

            if (wizard.getCurrentHp() < 0) {
                Battle.gameOver();
                break;
            } else if (Enemy.ombrage.getCurrentHp() < 0) {
                Enemy.ombrage.setCurrentHp(0);
                BasicClass.clearConsole();
                printHeader("Vous avez mit K.O " + Enemy.ombrage.getName() + " ! ");
                break;


            }

        }
        BasicClass.anythingToContinue();
    }

    public static void year5Outro(){
        System.out.println("Vous avez chassé Ombrage de Poudlard !\nElle ne reviendra pas de si tôt. \nMais une menace bien plus importante plâne sur Poudlard...");
        BasicClass.anythingToContinue();
    }

}
