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


