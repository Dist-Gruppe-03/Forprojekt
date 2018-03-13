package galgeleg;

import java.rmi.Naming;

/**
 *
 * @author krede
 */
public class Galgeserver {

    public static void main(String[] arg) throws Exception {
        java.rmi.registry.LocateRegistry.createRegistry(1099); // start i server-JVM

        GalgeI g = new Galgelogik();
        Naming.rebind("rmi://localhost/galgeleg", g);
        System.out.println("Galgeleg startet.");
    }
}
