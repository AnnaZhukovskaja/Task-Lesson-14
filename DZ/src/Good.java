public class Good {

    private String name;
    private double price;
    private String department;
    private int storageLife;

    public Good() {}

    public Good(String name, double price, String department, int storageLife) {
        this.name = name;
        this.price = price;
        this.department = department;
        this.storageLife = storageLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good goods = (Good) o;

        if (Double.compare(goods.getPrice(), getPrice()) != 0) return false;
        if (getStorageLife() != goods.getStorageLife()) return false;
        if (getName() != null ? !getName().equals(goods.getName()) : goods.getName() != null) return false;
        return getDepartment() != null ? getDepartment().equals(goods.getDepartment()) : goods.getDepartment() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        result = 31 * result + getStorageLife();
        return result;
    }
}
