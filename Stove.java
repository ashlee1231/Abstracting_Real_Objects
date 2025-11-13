/**
 * The Stove class represents a stove with properties such as color, dial position,
 * whether it is on, and whether it is dirty. It provides methods to interact with
 * and modify these properties.
 * 
 * Collaborator: Github Copilot
 */
public class Stove {
    private final String color;
    private int dial;
    private boolean isOn;
    private boolean isDirty;
    private double temperature;
    private Item item;

/** constructs a stove object
 * @param color the color of the stove
 */
    public Stove(String color) {
        this.color = color;
        this.dial = 0;
        this.isOn = false;
        this.isDirty = false;
    }
/** constructs a stove object
* default color is white
*/
        public Stove() {
            this.color = "white";
            this.dial = 0;
            this.isOn = false;
            this.isDirty = false;
        }
/** returns color of stove
 * @return color of stove
 */
    public String getColor() {
        return color;
    }
 /** gets dial notch
 * @return dial notch
 */
    public int getDial() {
        return dial;
    }
/** sets the dial notch
 * @param dialSetting the dial notch to set
 * dialSetting must be greater than or equal to 0
 */
    public void setDial(int dialSetting){
        dial = dialSetting;
        this.setTemperature(dialSetting);
    }
/** returns status
 * @return true if stove is on, false otherwise
 */
    public boolean isOn() {
        return isOn;
    }
/** turns stove on 
*/
public void turnOn() {
    isOn = true;
}
/** turns stove off
 * */
    public void turnOff() {
        isOn = false;
    }
/** returns if stove is dirty
 * @return true if stove is dirty, false otherwise
 */
    public boolean isDirty() {
        return isDirty;
    }
/** makes stove dirty
 * */
    public void makeDirty() {
        isDirty = true;
    }
/** cleans the stove
 * */
    public void cleanStove() {
        isDirty = false;
    }
/** gets temperature
 * @return temperature of stove
 */
    public double getTemperature() {
        return temperature;
    }
/** sets temperature
 * @param temp the temperature to set
 */
    public void setTemperature(int dial) {
        temperature = dial * 100.0; // Example: each dial notch increases temperature by 100 degrees
        if (temperature > 500.0) {
            breaksDown();
        }
    }
/** gets item on stove
 * @return item on stove
 */
    public Item getItem() {
        return item;
    }
/** sets item on stove
 * @param newItem the item to set
 */
    public void setItem(Item newItem) {
        item = newItem;
    }
/** Simulates cooking an item
 * @param time the time in minutes to cook
 */
public void cook(int time) {
    if (isOn && dial > 0) {
        System.out.println("Cooking for " + time + " minutes...");
        isDirty = true; // Stove gets dirty after cooking
    } else {
        System.out.println("The stove is off. Turn it on to cook.");
    }
}

/** Preheats the stove to a specific temperature
 * @param targetTemp the temperature to preheat to
 */
public void preheat(int targetTemp) {
    if (isOn) {
        System.out.println("Preheating to " + targetTemp + " degrees...");
        temperature = targetTemp;
    } else {
        System.out.println("The stove is off. Turn it on to preheat.");
    }
/** the oven breaks down and cannot be used
*temperature must have exceed 500
*/
}
public void breaksDown() {
    isOn = false;
    temperature = 0.0;
    System.out.println("The stove has broken down and is now off.");
    }
public void stoveIsReady()
{
    if (temperature >= 350.0) {
        System.out.println("The stove is ready for cooking.");
    } else {
        System.out.println("The stove is not hot enough yet.");
    }
}
/** describes the object
*/
    @Override
    public String toString() {
        return """
               This is a stove with...
               The Color: """ + color +
               "\nSet on Dial: " + dial +
               "\nTemperature: " + temperature +
               "\nIs it On: " + isOn +
               "\nIs it Dirty: " + isDirty;
    }
}