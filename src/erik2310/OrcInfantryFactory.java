package erik2310;

public class OrcInfantryFactory extends InfantryFactory {

    // En metode der returner en indstans af en karakter afhængig af techLevel
    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;

        switch (techLevel) {
            case 1:
                character = new OrcRockHauler();
                character.setRace("Orc");
                break;
            case 2:
                character = new OrcSpearThrower();
                character.setRace("Orc");
                break;
            case 3:
                character = new OrcMusketeer();
                character.setRace("Orc");
                break;
            case 4:
                character = new OrcCrossbowMan();
                character.setRace("Orc");
                break;
            case 5:
                character = new OrcArcher();
                character.setRace("Orc");
                break;
            default:
                character = null;
                break;
        }
        return character;
    }

}
