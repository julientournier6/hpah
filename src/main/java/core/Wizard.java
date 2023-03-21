package core;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Wizard{


    private String name;
    private int maxHp;
    private int currentHp;
    private int xp;
    private int defense;
    private String house;
    private List<Potion> potions;
    private List<Spell> spells;

    public Wizard(String name, int maxHp, int xp) {
        this.name = this.name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.xp = xp;
        this.spells = spells;
        this.defense = defense;
        this.house = house;
        this.potions = potions;
    }

    public int attack(){
        return 0;
    }


    public int defense(){
        return 0;
    }

    public void removeHp(int value){
        this.currentHp -= value;
    }

    public void addHealth(int value) {
        this.currentHp += value;
    }

    public void takeDamage(int damage) {
        removeHp(damage);
    }



    public static void main(){


    }












}


    /* private int healthPoint; //private pour pas y accéder via le jeu
    private int spell; //On va faire ca comme de l'exp

    //public character(){ //stats de notre sorcier
    //healthPoint = 20;
    //spell = 1;
    //}

    //public enemy(int healthPoint, int spell){ //stat d'un ennemi lambda dont on définira les capacités plus tard
    // healthPoint = hp;
    //spell = sp;
    //}

    public int getHealthPoint(){  // pour récupérer les hp
        return healthPoint;
    }

    public int getSpell(){ // pour connaître les spells
        return spell;
    }
    public void setHealthPoint(int hp){ // Pour définir les hp
        healthPoint = hp;
    }

    public void setSpell(int sp){  // Pour définir les spells
        spell = sp;
    }

    public void potion(){
        healthPoint += 4;
        if (healthPoint > 20){
            healthPoint = 20;
        }

    }

    public String soString(){
        if(healthPoint == 20){
            return "Vous avez " + healthPoint + "\r Vous êtes en pleine forme, allons combattre les méchants !";
        } else if (healthPoint > 16) {
            return "Vous avez " + healthPoint + "\r Vous êtes en forme, allons combattre les méchants !";
        } else if (healthPoint > 12) {
            return "Vous avez " + healthPoint + "\r Vous êtes blessé, une potion serait la bienvenue";
        }else if (healthPoint > 8) {
            return "Vous avez " + healthPoint + "\r Vous êtes mal en point, une potion est nécessaire";
        } else if (healthPoint > 4) {
            return "Vous avez " + healthPoint + "\r La pause s'impose";
        } else {
            return "Vous avez " + healthPoint + "\r Arrête d'explorer retourne étudier mon reuf";
        }
    } */
