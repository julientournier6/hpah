package core;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;
@Getter
@Setter
public class BasicClass {
    static Scanner scanner = new Scanner(System.in);

    static Wizard wizard;

    public static boolean isRunning;

    public static int place = 0, year=0;
    public static String[] places = {
            "Chemin de Traverse","Toilettes du donjon", "Chambre des secrets", "Lac dans la Forêt Interdite", " Cimetière de Little Hangleton", "Salle d’examen de Poudlard", "Tour d’astronomie", "Poudlard"
    };



    //Pour être sûr que le joueur rentre ne fait pas de la merde avec la console et qu'il rentre le bon digit
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            }catch (Exception e){
                input = -1;
                System.out.println("Veuillez entrer le digit demandé !");
            }
        }while (input < 1 || input > userChoices);
        return input;
    }

    // Nettoie la console
    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    // Créer un "header" à la console que l'utilisateur pourra voir facilement lors du jeu
    public static void printHeader(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }



    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //Pour tempo le jeu et laisser l'utilisateur lire tranquillement la console. Il a juste à appuyer sur Entrer pour continuer
    public static void anythingToContinue(){
        System.out.println("\n\rAppuyez sur Entrer pour continuer");
        scanner.nextLine();
    }

    public static void launchGame(){
        boolean nameSet = false;
        String name;
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Harry Potter at Home");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();

        do{
            clearConsole();
            System.out.print("Entrez le nom de votre sorcier : ");
            name = scanner.next();
            System.out.println("Le nom de votre sorcier est : " + name + ".\n\r Souhaitez-vous le modifier ?");
            System.out.println("1. Oui\n\r2. Non, il est parfait");
            int input = readInt("->", 2);
            if(input==2) {
                System.out.println("Bien " + name + ", il est l'heure d'aller sur le chemin de Traverse pour aller faire des achats avant d'aller à Poudlard. " +
                        "Appuie sur Entrée pour aller sur le chemin de Traverse");
                nameSet = true;
            }else{
                nameSet=false;
            }
        }while (!nameSet);


        wizard = new Wizard(name, 100, 0);

        Pet.main();
        Wand.main();
        House.main();


        isRunning = true;
        gameloop();
    }

    public static void inventory(){
        clearConsole();
        printHeader("Inventaire de "+ wizard.getName());
        System.out.println(wizard.getName() + "\tHP : " + wizard.getCurrentHP() + "/"+ wizard.getMaxHP());
        printSeparator(30);
        System.out.println("Sorts appris : " + wizard.getSpells());
        anythingToContinue();
    }
    public static void printMenu(){
        clearConsole();
        printHeader(places[place]);
        printSeparator(30);
        System.out.println("1. Reprendre");
        System.out.println("2. Inventaire");
        System.out.println("3. Quitter le jeu");
    }

    public static boolean defense25Percents() {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1; // Génère un nombre aléatoire entre 1 et 100

        if (nombreAleatoire <= 25) {
            return true; // L'événement se produit
        } else {
            return false; // L'événement ne se produit pas
        }
    }
    public static boolean defense50Percents() {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1; // Génère un nombre aléatoire entre 1 et 100

        if (nombreAleatoire <= 50) {
            return true; // L'événement se produit
        } else {
            return false; // L'événement ne se produit pas
        }
    }
    public static boolean defense75Percents() {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1; // Génère un nombre aléatoire entre 1 et 100

        if (nombreAleatoire <= 75) {
            return true; // L'événement se produit
        } else {
            return false; // L'événement ne se produit pas
        }
    }

    public static void attack1(){
        int attack = Character.attack();
        if(defense=0){
            System.out.println("On vous attaque !");
            int hit = Enemy.attack();
            System.out.println("Vous avez subit "+hit+" de dégats.");
        } else if (defense=1) {
            System.out.println("On vous attaque !");
            defense25Percents();
            if (defense25Percents()){
                int attack = Character.attack();
            }else {
                int hit = Enemy.attack();
                System.out.println("Vous avez subit "+hit+" de dégats.");
            }
        }else if (defense=2) {
            System.out.println("On vous attaque !");
            defense50Percents();
            if (defense50Percents()) {
                int attack = Character.attack();
                System.out.println("Oh ! Vous avez paré et renvoyé l'attaque !");
            } else {
                int hit = Enemy.attack();
                System.out.println("Vous avez subit " + hit + " de dégats.");
            }
        }else if (defense=3) {
            System.out.println("On vous attaque !");
            defense75Percents();
            if (defense25Percents()) {
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
    public static void battle(Enemy enemy, Boss boss){
        //boucle bataille
        while (true){
            clearConsole();
            printHeader(Enemy.name + "\nHP : " + Enemy.currentHp + "/" + Enemy.maxHp);
            printSeparator(30);
            System.out.println("A vous d'attaquer !\n\rChoisissez une action :\n\r1. Attaquer\n\r2. Se protéger\n\r3. Utiliser une potion");
            int input = readInt("->", 3);
            //Conditions du tour du joueur
            if(input == 1){
                //La bagarre
                attack1();
            } else if (input==2) {
                //Se protéger
                int defense = 0;
                defense = defense + 1;
                int hit = Enemy.attack();
                    System.out.println("Votre protection augmente de 1\r\nVous êtes au rang "+defense+"/4 de protection.\r\nVous avez subit "+hit+" de dégats.");
            }else {
                //Les potions
                return;
            }
            if(Character.currentHp < 0){
                gameOver();
                break;
            } else if (enemy.currentHp < 0) {
                clearConsole();
                printHeader("Vous avez tué le "+enemy.name+" ! ");
                
            }

        }
    }

    public static void gameOver(){
        clearConsole();
        printHeader("Vous avez succombé");
        System.out.println("Merci d'avoir joué !");
    }

    public static void changeYear(){
        if(Character.xp == 10 && year == 0){
            //Incrémentation année + lieu
            year = 1;
            place = 1;
            //Histoire
            System.out.println("Direction Poudlard !");
            Boss.boss[0] = "Troll";
        } else if (Character.xp == 20 && year ==1) {
            //Incrémentation année + lieu
            year = 2;
            place = 2;
            System.out.println("Fin de la première année");
            Boss.boss[1] = "Basilic";
        } else if (Character.xp == 30 && year ==2) {
            //Incrémentation année + lieu
            year = 3;
            place = 3;
            System.out.println("Fin de la deuxième année");
            Enemy.enemy[0] = "1er Détraqueurs (Fifi)";
            Enemy.enemy[0] = "2ème Détraqueurs (Riri)";
            Enemy.enemy[0] = "3ème Détraqueurs (Loulou)";
        } else if (Character.xp == 40 && year ==3) {
            //Incrémentation année + lieu
            year = 4;
            place = 4;
            System.out.println("Fin de la troisième année");
            Wizard.currentHP = Wizard.maxHP;
            Enemy.enemy[1] = "Peter Pettigrow";
            Boss.boss[2] = "Voldemort";
        }else if (Character.xp == 50 && year ==4) {
            //Incrémentation année + lieu
            year = 5;
            place = 5;
            System.out.println("Fin de la quatrième année");
            Boss.boss[3] = "Dolores Ombrage";
            Wizard.currentHP = Wizard.maxHP;
        }else if (Character.xp == 60 && year ==5) {
            //Incrémentation année + lieu
            year = 6;
            place = 6;
            System.out.println("Fin de la cinquième année");
            Enemy.enemy[2] = "1er Mangemort ";
            Enemy.enemy[2] = "2ème Mangemort ";
            Enemy.enemy[2] = "3ème Mangemort ";
        }else if (Character.xp == 70 && year ==6) {
            //Incrémentation année + lieu
            year = 7;
            place = 7;
            System.out.println("Fin de la sixième année");
            Boss.boss[4] = "Bellatrix Lestrange";
            Boss.boss[5] = "Voldemort";
        }else(Character.xp == 80 && year ==7) {
            System.out.println("Merci d'avoir joué au jeu !");
        }
    }
    public static void resume(){
        changeYear();
    }
    public static void gameloop(){
        while (isRunning){
            printMenu();
            int input = readInt("->", 3);
            if (input==1){
                resume();
            } else if (input==2) {
                inventory();
            } else {
            isRunning=false;}
        }

    }



}