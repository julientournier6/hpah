package core;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BasicClass {
    static Scanner scanner = new Scanner(System.in);

    static Wizard wizard;

    public static boolean isRunning;

    public static int place = 0, year;
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

    public static void changeYear(){
        if(Character.xp == 10 && year == 1){
            year = 2;
            place = 3;
            System.out.println("Fin de la première année");

        } else if (Character.xp == 20 && year ==2) {
            year = 3;
            place = 4;
            System.out.println("Fin de la deuxième année");
        } else if (Character.xp == 30 && year ==3) {
            year = 4;
            place = 5;
            System.out.println("Fin de la troisième année");
        }else if (Character.xp == 40 && year ==4) {
            year = 5;
            place = 6;
            System.out.println("Fin de la quatrième année");
        }else if (Character.xp == 50 && year ==5) {
            year = 6;
            place = 7;
            System.out.println("Fin de la cinquième année");
        }else if (Character.xp == 60 && year ==6) {
            year = 7;
            place = 8;
            System.out.println("Fin de la sisième année");
        }else(Character.xp == 70 && year ==7) {
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
