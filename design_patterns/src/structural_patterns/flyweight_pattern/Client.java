package structural_patterns.flyweight_pattern;

public class Client {
    public static void kentang() {
        InventoryBackend inventoryBackend = new InventoryBackend();

        inventoryBackend.takeOrder("Iphone", 1);
        inventoryBackend.takeOrder("Laptop", 2);
        inventoryBackend.takeOrder("Smart TV", 3);
        inventoryBackend.takeOrder("Iphone", 4);
        inventoryBackend.takeOrder("Laptop", 5);
        inventoryBackend.takeOrder("Smart TV", 6);

        inventoryBackend.process();
        System.out.println(inventoryBackend.report());
    }
}
