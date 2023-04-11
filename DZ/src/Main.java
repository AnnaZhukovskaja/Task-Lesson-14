public class Main {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        fridge.addProduct(new Good("Milk", 1.5, "1 shelf", 1));
        fridge.addProduct(new Good("Beef", 5, "3 shelf", 0));
        fridge.addProduct(new Good("Onion", 1.1, "lower shelf", 1));

        Good butter = new Good("Butter", 1, "side shelf", 10);
        fridge.addProduct(butter);
        fridge.print();

        System.out.println("Забрали молоко: " + fridge.deleteProduct("Milk"));
        fridge.print();
        System.out.println("Молоко есть в холодильнике? " + fridge.findByName("Milk"));

        Good sauce = new Good("Sauce", 1, "side shelf", 10);
        System.out.println("Sauсe есть в холодильнике? " + fridge.findByName("Sauсe"));

        Good fish = new Good("fish", 6, "3 shelf", 2);

        System.out.println("Рыба есть в холодильнике? " + fridge.isInFridge2(fish));
        System.out.println("Масло есть в холодильнике? " + fridge.isInFridge(butter));

        fridge.deliteExpiredFood();
        fridge.print();

    }
}