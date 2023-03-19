package core;

import lombok.Data;

@Data
public abstract class Character extends Wizard{



        private String name;
        private int maxHP;
        private int currentHP;

        public Character(String name, int maxHealth) {
                this.name = name;
                this.maxHP = maxHealth;
                this.currentHP = maxHealth;
        }

        public abstract int attack();
        public abstract int defense();



/*
        public void takeDamage(int damage) {
                int netDamage = Math.max(damage - this.defense, 0);
                this.currentHP = Math.max(this.currentHP - netDamage, 0);
        }

        public abstract void attack(Character target);

 */
}

