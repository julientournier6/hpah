package core;

import java.util.Scanner;

public class Pet{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String pet = "test";

        boolean petBool = false;
        while (!petBool){
            System.out.println("Bienvenue sur le chemin de travers !" +
                    "\r\n Allons choisir votre animal fantastique pour vous accompagner à Poudlard." +
                    "\r\n Quel animal sauvage souhaité ?" +
                    "\r\n 1. Une chouette" +
                    "\r\n 2. Un rat" +
                    "\r\n 3. Une Annabelle" +
                    "\r\n 4. Un crapeau");
            int petChoice = scanner.nextInt();
            if (petChoice==1){
                pet = "une chouette ";
                petBool = true;
            } else if (petChoice==2){
                pet = "un rat ";
                petBool = true;
            } else if (petChoice==3) {
                System.out.println("T'es vraiment sur ? Elle est trop moche et fait que dormir. Une Annabelle ca sert à rien" +
                        "\r\n En plus elle a des crampes aux pieds... " +
                        "\r\n Elle casse les couilles avec ses goûts de merde... Elle écoute le coeur des filles de A2h t'imagines ???" +
                        "\r\n ca fait trop de peine.");
                scanner.nextLine();
            } else if (petChoice==4) {
                pet = "un crapeau ";
                petBool = true;
            } else {
                System.out.println("Merci de choisir ton animal ! Tape 1, 2, 3, ou 4 dans la console.");
            }
        }

        System.out.println("Ton animal est donc : "+pet);
        System.out.println("Appuyez sur Entrée pour vous aller chez Ollivander");
        scanner.nextLine();


    }
}

