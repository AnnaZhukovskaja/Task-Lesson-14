import java.util.ArrayList;
import java.util.List;

public class Fridge {

    private List<Good> goods;

    public Fridge() {
        goods = new ArrayList<Good>();
    }

    public boolean addProduct(Good good) {
        return this.goods.add(good);
    }

    public boolean deleteProduct(String name) {
        int deleteIndex = -1;
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getName().equals(name)) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex < 0) {
            return false;
        }

        goods.remove(deleteIndex);
        return true;
    }

    public boolean deliteExpiredFood() {
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getStorageLife() <= 0) {
                goods.remove(i);
                return true;
            }
        }
        return false;
    }

    public Good findByName(String name) {

        for (int i = 0; i < goods.size(); i++) {
            Good b = goods.get(i);
            String nameProduct = b.getName();
            if (nameProduct.contains(name)) {
                return b;
            }
        }
        return null;
    }

    public boolean isInFridge(Good good) {
        for (int i = 0; i < goods.size(); i++) {
            Good b = goods.get(i);
            if (b.getName().contains(good.getName()) && b.getPrice() == good.getPrice()
                    && b.getDepartment().contains(good.getDepartment()) && b.getStorageLife() == good.getStorageLife()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInFridge2(Good good) {
        return goods.contains(good);
    }

    public void print() {
        System.out.println("----------------------Fridge----------------------");
        for (int i = 0; i < goods.size(); i++) {
            Good b = goods.get(i);
            System.out.println("Product:  name: " + b.getName());
            System.out.println("\t price: " + b.getPrice());
            System.out.println("\t deportament : " + b.getDepartment());
            System.out.println("\t storage life: " + b.getStorageLife());
            System.out.println("-------------------------------------------------");
        }
        System.out.println("-------------------------------------------------");
    }

}
