package galgeleg;

import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class Galgeklient {

    
    public static void main(String[] arg) throws Exception {
    	
    	//URL url = new URL("http://ubuntu4.saluton.dk:9924/galgeleg?wsdl");
        URL url = new URL("http://localhost:9924/galgeleg?wsdl");
        QName qname = new QName("http://galgeleg/", "GalgelogikService");
        Service service = Service.create(url, qname);
        boolean spilAktivt = true; 
        
        GalgeI spil = service.getPort(GalgeI.class);
        //GalgeGUI GUI = new GalgeGUI(spil);

        spil.nulstil();
        spil.hentOrdFraDr();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Velkommen til galgeleg.");
        System.out.println("Log ind for at spille");
        
        //GUI.GUI();
        
        //while (GUI.login() == false) {
        	
        	Thread.sleep(100);
        	/*
            System.out.println("Indtast brugernavn: ");
            String bruger = scanner.nextLine();
            
            System.out.println("Indtast password: ");
            String password = scanner.nextLine();
            
            if (spil.hentBruger(bruger, password)){
            	System.out.println("Velkommen " + bruger);
                break;
            }
            else
                System.out.println("Forkert login - prøv igen");
                */
        //}
        
        while (spilAktivt){
        	System.out.println("Gæt ordet: " + spil.getSynligtOrd());
        	System.out.println("Dine gæt: " + spil.getBrugteBogstaver());
        	System.out.println("Gæt på et bogstav");
        	String bogstav = scanner.next();
        	if (bogstav.matches("[a-zA-Z]") && bogstav.length() == 1){
        		if (spil.getBrugteBogstaver().contains(bogstav)){
        			System.out.println("Du har allerede gættet på: " + bogstav);
        		}else {
        			spil.gætBogstav(bogstav);
        			if (spil.erSidsteBogstavKorrekt()){

        				if (spil.erSpilletVundet() == true){
        					System.out.println("Du har vundet, ordet var: " + spil.getOrdet());
        					//spil.skrivHighScore();
                            spil.nulstil();
        					spilAktivt = false;
        				}
        			}	
        			else {
        			
        				 if (spil.erSpilletTabt() == true){
        					System.out.println("Du har gættet forkert for mange gange, du har tabt.");
                                                System.out.println("Ordet var: " + spil.getOrdet());
        				 	//spil.skrivHighScore();
                             spil.nulstil();
        				 	spilAktivt = false;
        				 }
        			}
        		}
        	}else {
        		        		System.out.println("Ikke ét bogstav, prøv igen");
        	}
        }
        scanner.close();
    }
    
}
