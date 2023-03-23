package core;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends AbstractEnemy {

    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;


    public static String[] enemy = {"Détraqueurs", "Peter Pettigrow", "Mangemorts"};
    public Enemy(String name, int maxHp, int attack) {

        super(name, maxHp, attack);
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;
        if (currentHp < 0) {
            currentHp = 0;
        }
    }



    @Override
    public void performAttack(Character target) {
        int damage = this.getAttack();
        target.takeDamage(damage);
    }

    private int getAttack() {
        return 0;
    }

    Enemy detraqueurs = new Enemy("Détraqueurs", 20, 5);
    Enemy peterPettigrow = new Enemy("Goblin", 20, 5);
    Enemy deathEaters = new Enemy("Mangemort", 20, 5);






}
