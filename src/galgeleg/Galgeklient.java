package galgeleg;

import java.rmi.Naming;
import java.util.ArrayList;

public class Galgeklient {

    public static void main(String[] arg) throws Exception {

        GalgeI spil = (GalgeI) Naming.lookup("rmi://localhost:1099/galgeleg");

        spil.nulstil();

        spil.logStatus();

        spil.gætBogstav("e");
        spil.logStatus();

        spil.gætBogstav("a");
        spil.logStatus();
        System.out.println("" + spil.getAntalForkerteBogstaver());
        System.out.println("" + spil.getSynligtOrd());
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("i");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("s");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("r");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("l");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("b");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("o");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("t");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("n");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("m");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("y");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("p");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

        spil.gætBogstav("g");
        spil.logStatus();
        if (spil.erSpilletSlut()) {
            return;
        }

    }

}
