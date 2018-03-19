package erik2310;

public abstract class InfantryUnit {

    // Deklaration af datatyper
    int range;
    int armor;
    int hits;
    int damage;
    boolean dead = false;
    String race;

    // Constructor som tager imod range, armor, hits og damage som arguments
    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    // Metode til at lave skade
    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);

        if (damage > reduction) {
            hits = hits - (damage - reduction);
        }
    }

    // Metode til at angribe
    public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);

    }

    // Getter til dead
    public boolean isDead() {
        return dead;
    }

    // Sætter til dead
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    // Getter til race
    public String getRace() {
        return race;
    }

    // Sætter til race
    public void setRace(String race) {
        this.race = race;
    }
}
