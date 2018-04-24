package galgeleg;
import java.rmi.Naming;
import java.util.HashMap;
import java.util.Map;
import javax.xml.ws.Endpoint;
/**
 *
 * @author krede
 */
public class Galgeserver {

    public static void main(String[] arg) throws Exception {
        
        //java.rmi.registry.LocateRegistry.createRegistry(9923); // start i server-JVM
        String userid = "s114992";
        
        Map<String, GalgeI> g = new HashMap();
        g.put(userid, new Galgelogik());
        
        //Naming.rebind("rmi://[::]:9923/galgeleg", g.get(userid));
        

        Endpoint.publish("http://[::]:9924/galgeleg", g.get(userid));
        
        System.out.println("Galgeleg startet.");

    }
}
