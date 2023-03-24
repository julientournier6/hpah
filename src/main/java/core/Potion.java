package core;
import java.util.*;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;
@Getter
@Setter

public class Potion {
    private String potionName;
    private int instantPotion;
    private int regenPotion;

    public Potion(String potionName, int instantPotion, int regenPotion) {
        this.potionName = potionName;
        this.instantPotion = instantPotion;
        this.regenPotion = regenPotion;
    }

    public String getPotionName() {
        return potionName;
    }

    public int getInstantPotion() {
        return instantPotion;
    }

    public int getRegenPotion() {
        return regenPotion;
    }

    public static void usePotion(Character character, Potion potion) {
        System.out.println("Souhaitez vous utiliser :\n\r1. Une potion de soin instantanée\n\r2. Une potion de régénération");
        int input = BasicClass.readInt("->", 2);
        if (input == 1) {
            character.setCurrentHp(character.getCurrentHp() + potion.getRegenPotion());
            System.out.println(character.getName() + " utilise la potion " + potion.getPotionName() + " et récupère " + potion.getInstantPotion() + " points de vie !");
        } else {
            int soinParTour = potion.getInstantPotion() / potion.getRegenPotion();
            for (int i = 0; i < potion.getRegenPotion(); i++) {
                character.setCurrentHp(character.getCurrentHp() + soinParTour);
                System.out.println(character.getName() + " récupère " + soinParTour + " points de vie grâce à la potion " + potion.getPotionName() + " !");
            }

        }
    }
}
/*
    public static void main(String[] args) {
        // Initialisation des potions
        Potion potion1 = new Potion("Potion de soin instantanée", 30, 0);
        Potion potion2 = new Potion("Potion de régénération", 20, 3);

        usePotion(Character, potion1);

        for (int i = 0; i < potion2.getRegenPotion(); i++) {
            usePotion(Character, potion2);
        }
    }
}
*/