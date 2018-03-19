package erik2310;

public class HumanInfantryFactory extends InfantryFactory {

    // En metode der returner en indstans af en karakter afhængig af techLevel
    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;

        switch (techLevel) {
            case 1:
                character = new RockHauler();
                character.setRace("Human");
                break;
            case 2:
                character = new SpearThrower();
                character.setRace("Human");
                break;
            case 3:
                character = new Musketeer();
                character.setRace("Human");
                break;
            case 4:
                character = new CrossbowMan();
                character.setRace("Human");
                break;
            case 5:
                character = new Archer();
                character.setRace("Human");
                break;
            default:
                character = null;
                break;
        }
        return character;
    }

}
