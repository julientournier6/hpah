package core;

import java.util.Scanner;

public class House {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String house = "House";
        boolean correctHouse = false;
        System.out.println("""
                Bienvenu à Poudlard ! Je suis le professeur McGonagall et je vais être en charge de vous enseigner la métamorphose cette année.\r
                Je suis aussi directrice de la maison Gryffondor.\r
                En parlant de maisons, il est l'heure de vous répartir dans votre maison, qui restera la même pour vos 7 ans à Poudlard.\r
                Mettez donc le choixpeau sur votre tête et laissez le vous guidez""");
        System.out.println("Appuyez sur Entrée pour mettre le Choixpeau sur votre tête.");
        scanner.nextLine();
        System.out.println("""
                Oui je vois, je vois, un futur brillant, un grand potentiel... Je décèle 4 qualités principale chez toi.Laquelle considère tu comme la plus grande ?\r
                1. L'audace\r
                2. La loyauté\r
                3. La curiosité\r
                4. L'ambition\r
                """);
        int numberHouse = scanner.nextInt();

        while (!correctHouse){
            if(numberHouse==1){
                house = "Gryffondor ";
                correctHouse = true;
            } else if (numberHouse==2) {
                house = "Poufsouffle ";
                correctHouse = true;
            }else if (numberHouse==3) {
                house = "Serdaigle ";
                correctHouse = true;
            }else if (numberHouse==4) {
                house = "Serpentard ";
                correctHouse = true;
            }else {
                System.out.println("Merci de choisir ta plus grande qualité ! Tape 1, 2, ou 3 dans la console.");
            }
        }

        System.out.println("Félicitation ! Tu es maintenant un "+ house +" !" +
                "\r\nVa maintenant te reposer pour débuter ta première année à Poudlard.");



    }
}