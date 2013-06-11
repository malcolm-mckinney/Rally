package Rally;

/**
 *
 * @author mim46
 */
public abstract class Mech {
     
    public enum GraphicsCard {
         none, average, premium;   
     }
     
     protected String name;
     protected int memory;
     protected int speed;
     protected GraphicsCard card;
     protected int price;
     
     public final static int LOUD_SPEED = 3;
     public final static int LOUD_MEMORY = 16;
     public final static int CHEAP_PRICE = 1000;
     public final static int EXPENSIVE_PRICE = 4000;
     public final static int HOT_MEMORY = 8;
     public final static int HOT_SPEED = 4;
     public final static int GAME_SPEED = 2;
     public final static int CRUNCH_SPEED = 4;
     public final static int CRUNCH_MEMORY = 4;
     
     
     public String getName() {
         return this.name;
     }
     
     public int getMemory() {
         return this.memory;
     }
     
     public int getSpeed() {
         return this.speed;
     }
     
     public GraphicsCard getCard() {
         return this.card;
     }
     
     public int getPrice() {
         return this.price;
     }
     
     public void setName(String newName) {
         this.name = newName;
     }
     
     public void setMemory(int newMemory) {
         this.memory = newMemory;
     }
     
     public void setSpeed(int newSpeed) {
         this.speed = newSpeed;
     }
     
     public void setCard(GraphicsCard newCard) {
         this.card = newCard;
     }
     
     public void setPrice(int newPrice) {
         this.price = newPrice;
     }
}
