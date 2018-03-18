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

            /*
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
                    */

            if (archer.hits < 0) {

            } else {
                if (randomTal == 0 && !crossbowMan.isDead()) {
                    archer.attack(crossbowMan);
                    System.out.println("Archer angriber CrossbowMan!" + "\n");
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                } else if (randomTal == 1 && !musketeer.isDead()) {
                    archer.attack(musketeer);
                    System.out.println("Archer angriber Musketeer!" + "\n");
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    archer.attack(rockHauler);
                    System.out.println("Archer angriber RockHauler!" + "\n");
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    archer.attack(spearThrower);
                    System.out.println("Archer angriber SpearThrower!" + "\n");
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                if (crossbowMan.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Archer har vundet!" + "\n");
                    System.exit(0);
                }
            }

            if (crossbowMan.hits < 0) {

            } else {
                if (randomTal == 0 && !archer.isDead()) {
                    crossbowMan.attack(archer);
                    System.out.println("CrossbowMan angriber Archer!" + "\n");
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                } else if (randomTal == 1 && !musketeer.isDead()) {
                    crossbowMan.attack(musketeer);
                    System.out.println("CrossbowMan angriber Musketeer!" + "\n");
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    crossbowMan.attack(rockHauler);
                    System.out.println("CrossbowMan angriber RockHauler!" + "\n");
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    crossbowMan.attack(spearThrower);
                    System.out.println("CrossbowMan angriber SpearThrower!" + "\n");
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                if (archer.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("CrossbowMan har vundet!" + "\n");
                    System.exit(0);
                }
            }

            if (musketeer.hits < 0) {

            } else {
                if (randomTal == 0 && !archer.isDead()) {
                    musketeer.attack(archer);
                    System.out.println("Musketeer angriber Archer!" + "\n");
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    musketeer.attack(crossbowMan);
                    System.out.println("Musketeer angriber CrossbowMan!" + "\n");
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    musketeer.attack(rockHauler);
                    System.out.println("Musketeer angriber RockHauler!" + "\n");
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    musketeer.attack(spearThrower);
                    System.out.println("Musketeer angriber SpearThrower!" + "\n");
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Musketeer har vundet!" + "\n");
                    System.exit(0);
                }
            }

            if (spearThrower.hits < 0) {

            } else {
                if (randomTal == 0 && !archer.isDead()) {
                    spearThrower.attack(archer);
                    System.out.println("SpearThrower angriber Archer!" + "\n");
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    spearThrower.attack(crossbowMan);
                    System.out.println("SpearThrower angriber CrossbowMan!" + "\n");
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    spearThrower.attack(rockHauler);
                    System.out.println("SpearThrower angriber RockHauler!" + "\n");
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    spearThrower.attack(musketeer);
                    System.out.println("SpearThrower angriber Musketeer!" + "\n");
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && musketeer.hits < 0) {
                    System.out.println("SpearThrower har vundet!" + "\n");
                    System.exit(0);
                }
            }

            if (rockHauler.hits < 0) {

            } else {
                if (randomTal == 0 && !archer.isDead()) {
                    rockHauler.attack(archer);
                    System.out.println("RockHauler angriber Archer!" + "\n");
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    rockHauler.attack(crossbowMan);
                    System.out.println("RockHauler angriber CrossbowMan!" + "\n");
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                } else if (randomTal == 2 && !spearThrower.isDead()) {
                    rockHauler.attack(spearThrower);
                    System.out.println("RockHauler angriber SpearThrower!" + "\n");
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    rockHauler.attack(musketeer);
                    System.out.println("RockHauler angriber Musketeer!" + "\n");
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                if (archer.hits < 0 && crossbowMan.hits < 0 && spearThrower.hits < 0 && musketeer.hits < 0) {
                    System.out.println("RockHauler har vundet!" + "\n");
                    System.exit(0);
                }
            }
        }
    }

}
