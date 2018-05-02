package galgeleg;

import java.util.ArrayList;
import java.util.Random;

public class Galgeleg {
	  ArrayList<String> muligeOrd = new ArrayList<String>();
	  String ordet;
	  ArrayList<String> brugteBogstaver = new ArrayList<String>();
	  String synligtOrd;
	  int antalForkerteBogstaver;
	  boolean sidsteBogstavVarKorrekt;
	  boolean spilletErVundet;
	  boolean spilletErTabt;
	  
	  public ArrayList<String> getBrugteBogstaver() {
		    return brugteBogstaver;
		  }


		  public String getSynligtOrd() {
		    return synligtOrd;
		  }

		  public String getOrdet() {
		    return ordet;
		  }
		   
		  public int getAntalForkerteBogstaver() {
		    return antalForkerteBogstaver;
		  }

		  public boolean erSidsteBogstavKorrekt() {
		    return sidsteBogstavVarKorrekt;
		  }

		  public boolean erSpilletVundet() {
		    return spilletErVundet;
		  }

		  public boolean erSpilletTabt() {
		    return spilletErTabt;
		  }

		  public boolean erSpilletSlut() {
		    return spilletErTabt || spilletErVundet;
		  }


		  public Galgeleg() throws java.rmi.RemoteException {
		    muligeOrd.add("bil");
		    muligeOrd.add("computer");
		    muligeOrd.add("programmering");
		    muligeOrd.add("motorvej");
		    muligeOrd.add("busrute");
		    muligeOrd.add("gangsti");
		    muligeOrd.add("skovsnegl");
		    muligeOrd.add("solsort");
		    muligeOrd.add("seksten");
		    muligeOrd.add("sytten");
		    nulstil();
		  }

		  public void nulstil() {
		    brugteBogstaver.clear();
		    antalForkerteBogstaver = 0;
		    spilletErVundet = false;
		    spilletErTabt = false;
		    ordet = muligeOrd.get(new Random().nextInt(muligeOrd.size()));
		    opdaterSynligtOrd();
		  }


		  public void opdaterSynligtOrd() {
		    synligtOrd = "";
		    spilletErVundet = true;
		    for (int n = 0; n < ordet.length(); n++) {
		      String bogstav = ordet.substring(n, n + 1);
		      if (brugteBogstaver.contains(bogstav)) {
		        synligtOrd = synligtOrd + bogstav;
		      } else {
		        synligtOrd = synligtOrd + "*";
		        spilletErVundet = false;
		      }
		    }
		  }

		  public void gætBogstav(String bogstav) {
		      
		    if (bogstav.length() != 1) return;
		    System.out.println("Der gættes på bogstavet: " + bogstav);
		    if (brugteBogstaver.contains(bogstav)) return;
		    if (spilletErVundet || spilletErTabt) return;

		    brugteBogstaver.add(bogstav);

		    if (ordet.contains(bogstav)) {
		      sidsteBogstavVarKorrekt = true;
		      System.out.println("Bogstavet var korrekt: " + bogstav);
		    } else {
		      // Vi gættede på et bogstav der ikke var i ordet.
		      sidsteBogstavVarKorrekt = false;
		      System.out.println("Bogstavet var IKKE korrekt: " + bogstav);
		      antalForkerteBogstaver = antalForkerteBogstaver + 1;
		      if (antalForkerteBogstaver >= 6) {

		        spilletErTabt = true;
		      }
		    }
		    opdaterSynligtOrd();
		  }

		  public void logStatus() {
		    System.out.println("---------- ");
		    System.out.println("- ordet (skult) = " + ordet);
		    System.out.println("- synligtOrd = " + synligtOrd);
		    System.out.println("- forkerteBogstaver = " + antalForkerteBogstaver);
		    System.out.println("- brugeBogstaver = " + brugteBogstaver);
		    if (spilletErTabt){
		        System.out.println("- SPILLET ER TABT");
		    }
		    if (spilletErVundet){
		        System.out.println("- SPILLET ER VUNDET");
		    }
		    System.out.println("---------- ");
		  }

}
