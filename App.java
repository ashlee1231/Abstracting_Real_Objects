public class App {
    public static void main(String[] args) throws Exception {
        Stove stove1 = new Stove("black");
        Stove stove2 = new Stove();
        Item item1 = new Item("Pasta");
        Item item2 = new Item("Steak");
        System.out.println(stove1.toString());
        System.out.println(stove2.toString());

        //stove 1 cooking pasta
        stove1.turnOn();
        stove1.preheat(350);
        stove1.setItem(item1);
        stove1.stoveIsReady();

        //stove 2 cooking steak
        stove2.turnOn();
        stove2.setDial(2);
        stove2.setItem(item2);
        stove2.cook(5);

        System.out.println(stove1.toString());
        System.out.println(stove2.toString());

        stove2.setDial(6);
        stove1.breaksDown();

        System.out.println(stove1.toString());
        System.out.println(stove2.toString());
        

    }
}
