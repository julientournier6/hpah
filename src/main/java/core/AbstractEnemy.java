package core;

public abstract class AbstractEnemy {
    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;

    public AbstractEnemy(String name, int maxHp, int attack, int defense) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

    public void takeDamage(int damage) {
        int netDamage = Math.max(damage - this.defense, 0);
        this.currentHp = Math.max(this.currentHp - netDamage, 0);
    }
    public abstract void performAttack(Character target);
}


