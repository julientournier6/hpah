package core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Character extends Wizard{


    private String name;
    private int maxHp;
    private int currentHp;
    private int xp;
    private int defense;
    private String house;
    private List<Potion> potions;
    private List<Spell> spells;
    private int attack;
    public int numberDamageUpgrade;
    public int numberHpUpgrade;



    public String[] damageUpgrades = {"Plus de dégats"};
    public String[] hpUpgrades = {"Plus de vie"};
    public Character(String name, int maxHp, int currentHp, int attack ){
        super(name, 1000, 20);
        this.name = name;
        this.numberDamageUpgrade = 0;
        this.numberHpUpgrade = 0;
        chooseUpgrade();

    }



    public int defense(){
        return 0;
    }

    public void chooseUpgrade(){
        BasicClass.clearConsole();
        BasicClass.printHeader("Choisissez une amélioration :");
        System.out.println("1. "+damageUpgrades[numberDamageUpgrade]);
        System.out.println("1. "+hpUpgrades[numberHpUpgrade]);
        int input = BasicClass.readInt("-> ", 2);
        BasicClass.clearConsole();
        if(input==1){
            BasicClass.printHeader("Vous avez augmenté votre attaque de 5 de dégats." + damageUpgrades[numberDamageUpgrade]+"!");
            numberDamageUpgrade++;
        }else {
            BasicClass.printHeader("Vous avez augmenté vie a augmenté de 5 HP.  " + damageUpgrades[numberHpUpgrade]+"!");
            numberHpUpgrade++;
        }
        BasicClass.anythingToContinue();
    }




}

