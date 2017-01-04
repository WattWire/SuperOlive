package net.wattwire.testingBlocks;

import net.wattwire.model.SimpStatus;

/**
 * Created by dave on 1/3/17.
 */
public class TestingBlocs {

    public static void enumTest() {

        System.out.println("\n *** Let's first have fun with enums: ");

        SimpStatus stat = SimpStatus.ITSUCKS;

        System.out.print("\n *** now status equals: " + stat + "  level val/level text: ");
        System.out.println(stat.getSlevel() + "/" + stat.getStext());

        switch (stat) {

            case OK : System.out.println("\n  Just okay?"); break;
            case ITSUCKS: System.out.println("\n  Sorry to hear about the suckiness."); break;
            case GREAT : System.out.println("\n  Great? Good for fucking you!"); break;
            case GOOD: System.out.println("\n  Good is good."); break;

        }
    }
}
