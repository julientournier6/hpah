package core;

import java.util.Random;
import java.util.Scanner;

public class Wand {


    public static void main() {
        size();
        core();
    }

    static int wandSize;
    public static void size(){
        Scanner scanner = new Scanner(System.in);

        boolean sizeCorrect = false;



        System.out.println("Choisissons maintenant une baguette pour toi. Ou du moins, c'est la baguette qui va te choisir !");

        while (!sizeCorrect) {

            System.out.println("Te considères tu comme : \r\n1. Grand \r\n2. De taille moyenne\r\n3. De petite taille");
            int size = scanner.nextInt();


            if (size == 1) {
                Random r = new Random();
                int minbig = 27;
                int maxbig = 40;
                int bigSize = r.nextInt(maxbig - minbig) + minbig;
                wandSize = bigSize;
                sizeCorrect = true;
            } else if (size == 2) {
                Random r = new Random();
                int minmedium = 20;
                int maxmedium = 27;
                int mediumSize = r.nextInt(maxmedium - minmedium) + minmedium;
                wandSize = mediumSize;
                sizeCorrect = true;


            } else if (size == 3) {
                Random r = new Random();
                int minshort = 12;
                int maxshort = 20;
                int shortSize = r.nextInt(maxshort - minshort) + minshort;
                wandSize = shortSize;
                sizeCorrect = true;

            } else {
                System.out.println("Merci de choisir ta taille ! Tape 1, 2 ou 3 dans la console.");
            }

        }







    }
    public static void core(){
        Scanner scanner = new Scanner(System.in);
        boolean coreCorrect = false;
        String corePersonnality = "test";
        while (!coreCorrect){

            System.out.println("Qu'est-ce qui te caractérise le mieux ?\r\n1. La détermination \r\n2. L'imagination\r\n3. L'intelligence\r\n4. L'optimisme\r\n5. La gentillesse");
            int personnality = scanner.nextInt();


            if (personnality==1){
                corePersonnality = "un crin de licorne ";
                coreCorrect = true;
            } else if (personnality==2){
                corePersonnality = "Un cheveu de Vélane ";
                coreCorrect = true;
            } else if (personnality==3) {
                corePersonnality = "Une plume de phénix ";
                coreCorrect = true;
            } else if (personnality==4) {
                corePersonnality = "Un ventricule de dragon ";
                coreCorrect = true;
            } else if (personnality==5) {
                corePersonnality = "Une corne de Serpent cornu ";
                coreCorrect = true;
            } else {
                System.out.println("Merci de choisir ta taille ! Tape 1, 2, 3, 4 ou 5 dans la console.");
            }
        }
        int wandSizeFinal = wandSize;
        System.out.println("Ta baguette t'a choisi !\r\nC'est une baguette avec "+ corePersonnality + "et qui mesure " + wandSizeFinal+ " cm.");
        System.out.println("Il est maintenant l'heure de se rendre à Poudlard pour la cérémonie de répartition !");
        BasicClass.anythingToContinue();
    }
}