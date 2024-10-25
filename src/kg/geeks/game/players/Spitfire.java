package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Spitfire extends Hero {
    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SPITFIRE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() < 0) {
                boss.setHealth(boss.getHealth() - 80);
            }
        }

        System.out.println("Warrior " + this.getName() + " damages to boss "
                + 80 + " damage");
    }
}
