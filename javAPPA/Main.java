package javAPPA;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "item1");
        Item item2 = new Item(2, "item2");
        Item item3 = new Item(3, "item2");
        item1.setDescription("Some description...");
        item2.setDescription("Another description...");
        item3.setDescription("And another one...");
        item1.setDescription();
        System.out.println(item1.getDescription());

        item2.setDescription("Appa 2 description");
        System.out.println(item2.getDescription());
    }
}
