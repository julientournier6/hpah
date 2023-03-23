package core;

import java.util.Random;

public class Battle {
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

    public static void gameOver(){
        BasicClass.clearConsole();
        BasicClass.printHeader("Vous avez succombé");
        System.out.println("Merci d'avoir joué !");
    }
}
