package erik2310;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Deklaration af datatype til et tilfældigt tal
        int randomTal;

        // Laver spillets karakterer som objekter
        Archer archer = new Archer();
        CrossbowMan crossbowMan = new CrossbowMan();
        Musketeer musketeer = new Musketeer();
        RockHauler rockHauler = new RockHauler();
        SpearThrower spearThrower = new SpearThrower();

        // Kører while loop mens karaktererne er levende
        while (archer.hits > 0 || crossbowMan.hits > 0 || musketeer.hits > 0 || rockHauler.hits > 0 || spearThrower.hits > 0) {

            // Laver et tilfældigt tal
            randomTal = random.nextInt(4);

            // Udskriver karakterernes stats hvis koden er aktiv
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

            // Hvis archer er død gør han ikke noget
            if (archer.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og crossbowMan ikke er død
                if (randomTal == 0 && !crossbowMan.isDead()) {
                    // Archer angriber crossbowMan
                    archer.attack(crossbowMan);
                    System.out.println("Archer angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og musketeer ikke er død
                } else if (randomTal == 1 && !musketeer.isDead()) {
                    // Archer angriber musketeer
                    archer.attack(musketeer);
                    System.out.println("Archer angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og rockHauler ikke er død
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    // Archer angriber rockHauler
                    archer.attack(rockHauler);
                    System.out.println("Archer angriber RockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis rockHauler dør
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og spearThrower ikke er død
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    // Archer angriber spearThrower
                    archer.attack(spearThrower);
                    System.out.println("Archer angriber SpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis spearThrower dør
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har Archer vundet
                if (crossbowMan.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Archer har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis crossbowMan er død gør han ikke noget
            if (crossbowMan.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // crossbowMan angriber archer
                    crossbowMan.attack(archer);
                    System.out.println("CrossbowMan angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og musketeer ikke er død
                } else if (randomTal == 1 && !musketeer.isDead()) {
                    // crossbowMan angriber musketeer
                    crossbowMan.attack(musketeer);
                    System.out.println("CrossbowMan angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og rockHauler ikke er død
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    // crossbowMan angriber rockHauler
                    crossbowMan.attack(rockHauler);
                    System.out.println("CrossbowMan angriber RockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis rockHauler dør
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og spearThrower ikke er død
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    // crossbowMan angriber spearThrower
                    crossbowMan.attack(spearThrower);
                    System.out.println("CrossbowMan angriber SpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis spearThrower dør
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har crossbowMan vundet
                if (archer.hits < 0 && musketeer.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("CrossbowMan har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis musketeer er død gør han ikke noget
            if (musketeer.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // Musketeer angriber archer
                    musketeer.attack(archer);
                    System.out.println("Musketeer angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og crossbowMan ikke er død
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    // Musketeer angriber crossbowMan
                    musketeer.attack(crossbowMan);
                    System.out.println("Musketeer angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og rockHauler ikke er død
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    // Musketeer angriber rockHauler
                    musketeer.attack(rockHauler);
                    System.out.println("Musketeer angriber RockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis rockHauler dør
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og spearThrower ikke er død
                } else if (randomTal == 3 && !spearThrower.isDead()) {
                    // Musketeer angriber spearThrower
                    musketeer.attack(spearThrower);
                    System.out.println("Musketeer angriber SpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis spearThrower dør
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har musketeer vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && spearThrower.hits < 0) {
                    System.out.println("Musketeer har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis spearThrower er død gør han ikke noget
            if (spearThrower.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // spearThrower angriber archer
                    spearThrower.attack(archer);
                    System.out.println("SpearThrower angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og crossbowMan ikke er død
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    // spearThrower angriber crossbowMan
                    spearThrower.attack(crossbowMan);
                    System.out.println("SpearThrower angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og rockHauler ikke er død
                } else if (randomTal == 2 && !rockHauler.isDead()) {
                    // spearThrower angriber rockHauler
                    spearThrower.attack(rockHauler);
                    System.out.println("SpearThrower angriber RockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis rockHauler dør
                    if (rockHauler.hits < 0) {
                        System.out.println("RockHauler døde!" + "\n");
                        rockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og musketeer ikke er død
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    // spearThrower angriber musketeer
                    spearThrower.attack(musketeer);
                    System.out.println("SpearThrower angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har spearThrower vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && rockHauler.hits < 0 && musketeer.hits < 0) {
                    System.out.println("SpearThrower har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis rockHauler er død gør han ikke noget
            if (rockHauler.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // Rockhauler angriber archer
                    rockHauler.attack(archer);
                    System.out.println("RockHauler angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og crossbowMan ikke er død
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    // Rockhauler angriber crossbowMan
                    rockHauler.attack(crossbowMan);
                    System.out.println("RockHauler angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og spearThrower ikke er død
                } else if (randomTal == 2 && !spearThrower.isDead()) {
                    // Rockhauler angriber spearThrower
                    rockHauler.attack(spearThrower);
                    System.out.println("RockHauler angriber SpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis spearThrower dør
                    if (spearThrower.hits < 0) {
                        System.out.println("SpearThrower døde!" + "\n");
                        spearThrower.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og musketeer ikke er død
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    // RockHauler angriber musketeer
                    rockHauler.attack(musketeer);
                    System.out.println("RockHauler angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har rockHauler vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && spearThrower.hits < 0 && musketeer.hits < 0) {
                    System.out.println("RockHauler har vundet!" + "\n");
                    System.exit(0);
                }
            }
        }
    }

}
