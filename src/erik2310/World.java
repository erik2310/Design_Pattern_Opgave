package erik2310;

public class World {

    // En public final static objekt til den ene instans
    public final static World ONEINSTANS = new World();

    // Default no-arg constructor som er private så man ikke kan lave flere worlds
    private World() {
    }

}
