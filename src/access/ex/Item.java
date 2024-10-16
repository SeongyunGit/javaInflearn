package access.ex;

public class Item {
    private String product;
    private int price;
    private int quantity;

    public Item(String product, int price, int quantity) {
        this.product = product;
        this.price =price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }
    public int getTotal() {
        return price*quantity;
    }
}
