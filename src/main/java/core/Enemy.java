package core;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Enemy extends AbstractEnemy {

    public static String[] enemy = {"Détraqueurs", "Peter Pettigrow", "Mangemorts"};
    public Enemy(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
    }

    @Override
    public void performAttack(Character target) {
        int damage = this.getAttack();
        target.takeDamage(damage);
    }

    private int getAttack() {
        return 0;
    }



}
