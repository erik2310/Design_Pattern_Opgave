package erik2310;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int randomTal;

        Archer archer = new Archer();
        CrossbowMan crossbowMan = new CrossbowMan();
        Musketeer musketeer = new Musketeer();
        RockHauler rockHauler = new RockHauler();
        SpearThrower spearThrower = new SpearThrower();

        while (archer.hits > 0 || crossbowMan.hits > 0 || musketeer.hits > 0 || rockHauler.hits > 0 || spearThrower.hits > 0) {

            randomTal = random.nextInt(4);

            System.out.println("Archer:" + "\n"
                    + "Armor: " + archer.armor + "\n"
                    + "Hits: " + archer.hits + "\n"
                    + "Damage: " + archer.damage + "\n"
                    + "Range: " + archer.range + "\n");

            System.out.println("CrossbowMan:" + "\n"
                    + "Armor: " + crossbowMan.armor + "\n"
                    + "Hits: " + crossbowMan.hits + "\n"
                    + "Damage: " + crossbowMan.damage + "\n"
                    + "Range: " + crossbowMan.range + "\n");

            System.out.println("Musketeer:" + "\n"
                    + "Armor: " + musketeer.armor + "\n"
                    + "Hits: " + musketeer.hits + "\n"
                    + "Damage: " + musketeer.damage + "\n"
                    + "Range: " + musketeer.range + "\n");

            System.out.println("RockHauler:" + "\n"
                    + "Armor: " + rockHauler.armor + "\n"
                    + "Hits: " + rockHauler.hits + "\n"
                    + "Damage: " + rockHauler.damage + "\n"
                    + "Range: " + rockHauler.range + "\n");

            System.out.println("SpearThrower:" + "\n"
                    + "Armor: " + spearThrower.armor + "\n"
                    + "Hits: " + spearThrower.hits + "\n"
                    + "Damage: " + spearThrower.damage + "\n"
                    + "Range: " + spearThrower.range + "\n");

            if (archer.hits < 0) {
                System.out.println("Archer døde!");
            } else {
                if (randomTal == 0) {
                    archer.attack(crossbowMan);
                } else if (randomTal == 1) {
                    archer.attack(musketeer);
                } else if (randomTal == 2) {
                    archer.attack(rockHauler);
                } else if (randomTal == 3) {
                    archer.attack(spearThrower);
                }
                if (crossbowMan.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Archer har vundet!");
                    System.exit(0);
                }
            }

            if (crossbowMan.hits < 0) {
                System.out.println("CrossbowMan døde!");
            } else {
                if (randomTal == 0) {
                    crossbowMan.attack(archer);
                } else if (randomTal == 1) {
                    crossbowMan.attack(musketeer);
                } else if (randomTal == 2) {
                    crossbowMan.attack(rockHauler);
                } else if (randomTal == 3) {
                    crossbowMan.attack(spearThrower);
                }
                if (archer.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("CrossbowMan har vundet!");
                    System.exit(0);
                }
            }

            if (musketeer.hits < 0) {
                System.out.println("Musketeer døde!");
            } else {
                if (randomTal == 0) {
                    musketeer.attack(archer);
                } else if (randomTal == 1) {
                    musketeer.attack(crossbowMan);
                } else if (randomTal == 2) {
                    musketeer.attack(rockHauler);
                } else if (randomTal == 3) {
                    musketeer.attack(spearThrower);
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Musketeer har vundet!");
                    System.exit(0);
                }
            }

            if (spearThrower.hits < 0) {
                System.out.println("SpearThrower døde!");
            } else {
                if (randomTal == 0) {
                    spearThrower.attack(archer);
                } else if (randomTal == 1) {
                    spearThrower.attack(crossbowMan);
                } else if (randomTal == 2) {
                    spearThrower.attack(rockHauler);
                } else if (randomTal == 3) {
                    spearThrower.attack(musketeer);
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && musketeer.hits < 0) {
                    System.out.println("SpearThrower har vundet!");
                    System.exit(0);
                }
            }

            if (rockHauler.hits < 0) {
                System.out.println("RockHauler døde!");
            } else {
                if (randomTal == 0) {
                    rockHauler.attack(archer);
                } else if (randomTal == 1) {
                    rockHauler.attack(crossbowMan);
                } else if (randomTal == 2) {
                    rockHauler.attack(spearThrower);
                } else if (randomTal == 3) {
                    rockHauler.attack(musketeer);
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && spearThrower.hits < 0 && musketeer.hits < 0) {
                    System.out.println("RockHauler har vundet!");
                    System.exit(0);
                }
            }
        }
    }

}
