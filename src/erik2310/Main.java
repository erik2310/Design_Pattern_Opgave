package erik2310;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Laver factories
        InfantryFactory humanFactory = FactoryFactory.createInfantryFactory(1);
        InfantryFactory orcFactory = FactoryFactory.createInfantryFactory(2);

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Deklaration af datatype til et tilfældigt tal
        int randomTal;

        // Laver spillets karakterer som objekter
        InfantryUnit archer = humanFactory.createUnit(5);
        InfantryUnit crossbowMan = humanFactory.createUnit(4);
        InfantryUnit musketeer = humanFactory.createUnit(3);
        InfantryUnit orcRockHauler = orcFactory.createUnit(1);
        InfantryUnit orcSpearThrower = orcFactory.createUnit(2);

        // Kører while loop mens karaktererne er levende
        while (archer.hits > 0 || crossbowMan.hits > 0 || musketeer.hits > 0 || orcRockHauler.hits > 0 || orcSpearThrower.hits > 0) {

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

            System.out.println("OrcRockHauler:" + "\n"
                    + "Armor: " + orcRockHauler.armor + "\n"
                    + "Hits: " + orcRockHauler.hits + "\n"
                    + "Damage: " + orcRockHauler.damage + "\n"
                    + "Range: " + orcRockHauler.range + "\n");

            System.out.println("OrcSpearThrower:" + "\n"
                    + "Armor: " + orcSpearThrower.armor + "\n"
                    + "Hits: " + orcSpearThrower.hits + "\n"
                    + "Damage: " + orcSpearThrower.damage + "\n"
                    + "Range: " + orcSpearThrower.range + "\n");
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
                    // Kører hvis randomTal er 2 og orcRockHauler ikke er død
                } else if (randomTal == 2 && !orcRockHauler.isDead()) {
                    // Archer angriber orcRockHauler
                    archer.attack(orcRockHauler);
                    System.out.println("Archer angriber OrcRockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcRockHauler dør
                    if (orcRockHauler.hits < 0) {
                        System.out.println("OrcRockHauler døde!" + "\n");
                        orcRockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og orcSpearThrower ikke er død
                } else if (randomTal == 3 && !orcSpearThrower.isDead()) {
                    // Archer angriber orcSpearThrower
                    archer.attack(orcSpearThrower);
                    System.out.println("Archer angriber OrcSpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcSpearThrower dør
                    if (orcSpearThrower.hits < 0) {
                        System.out.println("OrcSpearThrower døde!" + "\n");
                        orcSpearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har Archer vundet
                if (crossbowMan.hits < 0 && musketeer.hits < 0 && orcRockHauler.hits < 0 && orcSpearThrower.hits < 0) {
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
                    // Kører hvis randomTal er 2 og orcRockHauler ikke er død
                } else if (randomTal == 2 && !orcRockHauler.isDead()) {
                    // crossbowMan angriber orcRockHauler
                    crossbowMan.attack(orcRockHauler);
                    System.out.println("CrossbowMan angriber OrcRockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcRockHauler dør
                    if (orcRockHauler.hits < 0) {
                        System.out.println("OrcRockHauler døde!" + "\n");
                        orcRockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og orcSpearThrower ikke er død
                } else if (randomTal == 3 && !orcSpearThrower.isDead()) {
                    // crossbowMan angriber orcSpearThrower
                    crossbowMan.attack(orcSpearThrower);
                    System.out.println("CrossbowMan angriber OrcSpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcSpearThrower dør
                    if (orcSpearThrower.hits < 0) {
                        System.out.println("OrcSpearThrower døde!" + "\n");
                        orcSpearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har crossbowMan vundet
                if (archer.hits < 0 && musketeer.hits < 0 && orcRockHauler.hits < 0 && orcSpearThrower.hits < 0) {
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
                    // Kører hvis randomTal er 2 og orcRockHauler ikke er død
                } else if (randomTal == 2 && !orcRockHauler.isDead()) {
                    // Musketeer angriber orcRockHauler
                    musketeer.attack(orcRockHauler);
                    System.out.println("Musketeer angriber OrcRockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcRockHauler dør
                    if (orcRockHauler.hits < 0) {
                        System.out.println("OrcRockHauler døde!" + "\n");
                        orcRockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og orcSpearThrower ikke er død
                } else if (randomTal == 3 && !orcSpearThrower.isDead()) {
                    // Musketeer angriber orcSpearThrower
                    musketeer.attack(orcSpearThrower);
                    System.out.println("Musketeer angriber OrcSpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcSpearThrower dør
                    if (orcSpearThrower.hits < 0) {
                        System.out.println("OrcSpearThrower døde!" + "\n");
                        orcSpearThrower.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har musketeer vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && orcRockHauler.hits < 0 && orcSpearThrower.hits < 0) {
                    System.out.println("Musketeer har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis orcSpearThrower er død gør han ikke noget
            if (orcSpearThrower.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // orcSpearThrower angriber archer
                    orcSpearThrower.attack(archer);
                    System.out.println("OrcSpearThrower angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og crossbowMan ikke er død
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    // orcSpearThrower angriber crossbowMan
                    orcSpearThrower.attack(crossbowMan);
                    System.out.println("OrcSpearThrower angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og orcRockHauler ikke er død
                } else if (randomTal == 2 && !orcRockHauler.isDead()) {
                    // orcSpearThrower angriber orcRockHauler
                    orcSpearThrower.attack(orcRockHauler);
                    System.out.println("OrcSpearThrower angriber OrcRockHauler!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcRockHauler dør
                    if (orcRockHauler.hits < 0) {
                        System.out.println("OrcRockHauler døde!" + "\n");
                        orcRockHauler.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og musketeer ikke er død
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    // orcSpearThrower angriber musketeer
                    orcSpearThrower.attack(musketeer);
                    System.out.println("OrcSpearThrower angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har orcSpearThrower vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && orcRockHauler.hits < 0 && musketeer.hits < 0) {
                    System.out.println("OrcSpearThrower har vundet!" + "\n");
                    System.exit(0);
                }
            }

            // Hvis orcRockHauler er død gør han ikke noget
            if (orcRockHauler.hits < 0) {

            } else {
                // Kører hvis randomTal er 0 og archer ikke er død
                if (randomTal == 0 && !archer.isDead()) {
                    // OrcRockhauler angriber archer
                    orcRockHauler.attack(archer);
                    System.out.println("OrcRockHauler angriber Archer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis archer dør
                    if (archer.hits < 0) {
                        System.out.println("Archer døde!" + "\n");
                        archer.setDead(true);
                    }
                    // Kører hvis randomTal er 1 og crossbowMan ikke er død
                } else if (randomTal == 1 && !crossbowMan.isDead()) {
                    // OrcRockhauler angriber crossbowMan
                    orcRockHauler.attack(crossbowMan);
                    System.out.println("OrcRockHauler angriber CrossbowMan!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis crossbowMan dør
                    if (crossbowMan.hits < 0) {
                        System.out.println("CrossbowMan døde!" + "\n");
                        crossbowMan.setDead(true);
                    }
                    // Kører hvis randomTal er 2 og orcSpearThrower ikke er død
                } else if (randomTal == 2 && !orcSpearThrower.isDead()) {
                    // OrcRockhauler angriber orcSpearThrower
                    orcRockHauler.attack(orcSpearThrower);
                    System.out.println("OrcRockHauler angriber OrcSpearThrower!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis orcSpearThrower dør
                    if (orcSpearThrower.hits < 0) {
                        System.out.println("OrcSpearThrower døde!" + "\n");
                        orcSpearThrower.setDead(true);
                    }
                    // Kører hvis randomTal er 3 og musketeer ikke er død
                } else if (randomTal == 3 && !musketeer.isDead()) {
                    // OrcRockHauler angriber musketeer
                    orcRockHauler.attack(musketeer);
                    System.out.println("OrcRockHauler angriber Musketeer!" + "\n");
                    // Laver et tilfældigt tal
                    randomTal = random.nextInt(4);
                    // Kører hvis musketeer dør
                    if (musketeer.hits < 0) {
                        System.out.println("Musketeer døde!" + "\n");
                        musketeer.setDead(true);
                    }
                }
                // Hvis alle de andre er døde så har orcRockHauler vundet
                if (archer.hits < 0 && crossbowMan.hits < 0 && orcSpearThrower.hits < 0 && musketeer.hits < 0) {
                    System.out.println("OrcRockHauler har vundet!" + "\n");
                    System.exit(0);
                }
            }
        }
    }

}
