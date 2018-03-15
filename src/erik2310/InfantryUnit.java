package erik2310;

public abstract class InfantryUnit {

    // Deklaration af datatyper
    int range;
    int armor;
    int hits;
    int damage;

    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);

        if (damage > reduction) {
            hits = hits - (damage - reduction);
        }
    }

    public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);
    }

}
