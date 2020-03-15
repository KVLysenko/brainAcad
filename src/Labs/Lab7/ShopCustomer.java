package Labs.Lab7;

public class ShopCustomer {
    private String name;
    private boolean discount;
    static final String ShopName = "Strannik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public static String getShopName() {
        return ShopName;
    }

    @Override
    public String toString() {
        return "ShopCustomer{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }

    public void addToCart(String item){
        System.out.println("Товар " + item + " добавлен в корзину");
    }
}
