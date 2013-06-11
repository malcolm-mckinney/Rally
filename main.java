package Rally;

/**
 *
 * @author mim46
 */

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderErrors;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Arrays;



public class main {

    private static RuleBase rbase = RuleBaseFactory.newRuleBase();
    private static PackageBuilder pbuilder = new PackageBuilder();
    private static StatefulSession sessionObject;
    private static String DRL_FILE = "drools.drl";
   
    static Machine machine1 = new Machine ("A", 2, 5, Mech.GraphicsCard.none, 800, false);
    static Machine machine2 = new Machine ("B", 8, 3, Mech.GraphicsCard.average, 1500, false);
    static Machine machine3 = new Machine ("C", 1, 1, Mech.GraphicsCard.none, 400, false);
    static Machine machine4 = new Machine ("D", 16, 4, Mech.GraphicsCard.premium, 3000, false);
    static Machine machine5 = new Machine ("E", 32, 5, Mech.GraphicsCard.none, 8000, false); 
    static Machine machine6 = new Machine ("F", 2, 2, Mech.GraphicsCard.premium, 5500, true);
    
    public static void main(String[] args) {

        initDrools();
        initMachines();
        runRules();
        Machine machineArray[] = new Machine[6];
        machineArray[0] = machine1;
        machineArray[1] = machine2;
        machineArray[2] = machine3;
        machineArray[3] = machine4;
        machineArray[4] = machine5;
        machineArray[5] = machine6;
        
        Arrays.sort(machineArray);
        System.out.println("Machine " + machineArray[5].getName() + " is the best buy!" );
        
        System.out.println("Machine " + machineArray[0].getName() + " is the worst buy!");
    }
    
    
    private static void initDrools() {
       
        try {
            Reader reader = new InputStreamReader(main.class.getResourceAsStream(DRL_FILE));
            pbuilder.addPackageFromDrl(reader);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        
        PackageBuilderErrors errors = pbuilder.getErrors();
 
        if (errors.getErrors().length > 0) {
            System.out.println("Some errors exists in packageBuilder");
            for (int i = 0; i < errors.getErrors().length; i++) {
                System.out.println(errors.getErrors()[i]);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
 
        try {
            rbase.addPackage(pbuilder.getPackage());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
 
 
    private static void runRules() {
        sessionObject.fireAllRules();
    }
 

    private static void initMachines() {
        
        sessionObject = rbase.newStatefulSession();
        sessionObject.insert(machine1);
        sessionObject.insert(machine2);
        sessionObject.insert(machine3);
        sessionObject.insert(machine4);
        sessionObject.insert(machine5);
        sessionObject.insert(machine6);
    }
    
}
