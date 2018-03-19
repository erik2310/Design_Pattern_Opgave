package erik2310;

public class FactoryFactory {

    // En metode der returner en indstans af en factory afhængig af race tal
    public InfantryFactory createInfantryFactory(int race) {
        InfantryFactory factory;
        switch (race) {
            case 1:
                factory = new HumanInfantryFactory();
                break;
            case 2:
                factory = new OrcInfantryFactory();
                break;

            default:
                factory = null;
                break;
        }
        return factory;
    }

}
