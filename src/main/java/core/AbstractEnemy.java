package core;

public abstract class AbstractEnemy {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int attack;
    private int defense;

    public AbstractEnemy(String name, int maxHealth, int attack, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }

    public void takeDamage(int damage) {
        int netDamage = Math.max(damage - this.defense, 0);
        this.currentHealth = Math.max(this.currentHealth - netDamage, 0);
    }
    public abstract void performAttack(Character target);
}


