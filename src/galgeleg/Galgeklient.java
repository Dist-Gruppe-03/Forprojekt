package galgeleg;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class Galgeklient {

    public static void main(String[] arg) throws Exception {
    	
    	URL url = new URL("http://localhost:9901/galgeleg?wsdl");
        QName qname = new QName("http://galgeleg/", "GalgelogikService");
        Service service = Service.create(url, qname);
        
        GalgeI g = service.getPort(GalgeI.class);

        Galgelogik spil = new Galgelogik();
        spil.nulstil();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Velkommen til galgeleg.");
        System.out.println("Log ind for at spille");
        System.out.println("*****");
        
        while (true) {
            System.out.println("Indtast brugernavn: ");
            String bruger = scanner.nextLine();
            
            System.out.println("Indtast password: ");
            String password = scanner.nextLine();
            
            if (g.hentBruger(bruger, password)){
            	System.out.println("velkommen " + bruger);
                break;
            }
            else
                System.out.println("Forkert login - prøv igen");
        }
        
        
        spil.logStatus();

        spil.gætBogstav("e");
        spil.logStatus();

        spil.gætBogstav("a");
        spil.logStatus();
        System.out.println("" + g.getAntalForkerteBogstaver());
        System.out.println("" + g.getSynligtOrd());
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("i");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("s");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("r");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("l");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("b");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("o");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("t");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("n");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("m");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("y");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("p");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

        g.gætBogstav("g");
        g.logStatus();
        if (g.erSpilletSlut()) {
            return;
        }

    }

}
