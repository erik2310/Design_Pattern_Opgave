package erik2310;

public class OrcInfantryFactory extends InfantryFactory {

    // En metode der returner en indstans af en karakter afhængig af techLevel
    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;

        switch (techLevel) {
            case 1:
                character = new RockHauler();
                character.setRace("Orc");
                break;
            case 2:
                character = new SpearThrower();
                character.setRace("Orc");
                break;
            case 3:
                character = new Musketeer();
                character.setRace("Orc");
                break;
            case 4:
                character = new CrossbowMan();
                character.setRace("Orc");
                break;
            case 5:
                character = new Archer();
                character.setRace("Orc");
                break;
            default:
                character = null;
                break;
        }
        return character;
    }

}
