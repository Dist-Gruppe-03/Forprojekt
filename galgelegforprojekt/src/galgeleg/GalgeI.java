package galgeleg;
import java.util.ArrayList;

public interface GalgeI extends java.rmi.Remote {

    public ArrayList<String> getBrugteBogstaver() throws java.rmi.RemoteException;

    public String getSynligtOrd() throws java.rmi.RemoteException;

    public String getOrdet() throws java.rmi.RemoteException;

    public int getAntalForkerteBogstaver() throws java.rmi.RemoteException;

    public boolean erSidsteBogstavKorrekt() throws java.rmi.RemoteException;

    public boolean erSpilletVundet() throws java.rmi.RemoteException;

    public boolean erSpilletTabt() throws java.rmi.RemoteException;

    public boolean erSpilletSlut() throws java.rmi.RemoteException;

    public void nulstil() throws java.rmi.RemoteException;

    public void opdaterSynligtOrd() throws java.rmi.RemoteException;

    public void gætBogstav(String bogstav) throws java.rmi.RemoteException;

    public void logStatus() throws java.rmi.RemoteException;

 //   public static String hentUrl(String url) throws java.rmi.RemoteException;
    
    public void hentOrdFraDr() throws java.rmi.RemoteException;

}
