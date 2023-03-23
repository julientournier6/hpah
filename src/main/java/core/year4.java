package core;

public class year4 {
    public static boolean goodWay1;
    public static boolean goodWay2;
    public static boolean goodWay3;
    static int defense = 0;

    public static void main() {
        introYear4();


    }

    public static void introYear4() {
        BasicClass.clearConsole();
        System.out.println("""
                Vous êtes en final du tournoi des 3 sorciers !
                Vous entrez dans le labyrinthe. Il faut maintenant trouver le chemin vers la coupe des trois Sorciers
                Vous allez :
                1. A gauche
                2. A droite
                3. Tout droit""");
        int input = BasicClass.readInt("->", 3);
        while (goodWay1) {
            if (input == 2) {
                System.out.println("Vous avancez sereinement.");
            } else if (input == 1) {
                System.out.println("Des buits étrange sont se font entendre autour de vous");
            } else {
                goodWay1 = false;
                System.out.println("Pas ici voyons !");
            }
        }
        while (goodWay2) {
            if (input == 2) {
                System.out.println("Vous avancez sereinement. Vous voyez quelque chose briller derriere une haie");
            } else if (input == 1) {
                System.out.println("Un monstre, rebroussez chemin rapidement pour qu'il ne vous vois pas.");
                goodWay2 = false;
            } else {
                System.out.println("Vous entendez un sifflement, par prudence vous reculez");
                goodWay2 = false;
            }
        }
        while (goodWay3) {
            if (input == 2) {
                System.out.println("Une racine vous attrape le pied, vous arrivez à vous en défaire tant bien que mal.");
                goodWay3 = false;
            } else if (input == 1) {
                System.out.println("Un monstre, rebroussez chemin rapidement pour qu'il ne vous vois pas.");
                goodWay3 = false;
            } else {
                System.out.println("Vous apercrevez le Trophée, vous courrez vers lui pour le brandir, mais au moment ou vous l'effleurez vous vous sentez aspiré...");
            }
            BasicClass.anythingToContinue();
            }
        }
    }

