package core;

public class Enemy extends AbstractEnemy {
    public Enemy(String name) {
        super(name, 100, 15, 10);
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
