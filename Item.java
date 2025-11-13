public class Item {
    private final String name;
    private boolean isBurnt;
/** construct an item
 * @param name the name of the item
 */
    public Item(String name) {
        this.name = name;
        isBurnt = false;
    }
/** returns the name of the item
 * @return the name of the item
 */
    public String getName() {
        return name;
    }
/** sets the item as burnt
 */
    public void burn() {
            isBurnt = true;
        }
/** sees if item is burnt
 * @return true if item is burnt, false otherwise
 */
    public boolean isBurnt() {
        return isBurnt;
    }
}
