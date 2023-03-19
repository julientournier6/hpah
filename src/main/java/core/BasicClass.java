package core;
import java.util.Scanner;

public class BasicClass {
    static Scanner scanner = new Scanner(System.in);



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
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //Pour tempo le jeu et laisser l'utilisateur lire tranquillement la console. Il a juste à appuyer sur Entrer pour continuer
    public static void anythingToContinue(){
        System.out.println("\nAppuyez sur Entrer pour continuer");
        scanner.next();
    }
}
