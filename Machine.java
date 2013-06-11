package Rally;

import java.util.ArrayList;

/**
 *
 * @author mim46
 */

public class Machine extends Mech implements Comparable{
   
        public boolean isLoud;
        public boolean isCheap;
        public boolean isExpensive;
        public boolean isHot;
        public boolean isRisky;
        public boolean canGame;
        public boolean canCrunchNumbers;
        public boolean droolStats;
        
        //Score is used to determine which machine is best and worst buys
        public int score;
        
        //The list is used to make sure the drools does not compare the same
        //two machines
        public ArrayList<Machine> machineList;
        
        
    public Machine (String name, int memory, int speed, GraphicsCard card, int price, boolean droolStats) {
        this.name = name;
        this.memory = memory;
        this.speed = speed;
        this.card = card;
        this.price = price;
        this.droolStats = droolStats;
        this.score = 0; 
        machineList = new ArrayList<Machine>();
    }
    
    
    //Used to find "best buys"
    @Override
    public int compareTo(Object obj) {
        
        if (!(obj instanceof Machine)) {
           return -1; 
        }
        
        Machine mech = (Machine)obj;
        return this.score - mech.score;
        
    }
    
    
}