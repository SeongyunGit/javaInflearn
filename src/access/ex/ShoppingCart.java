package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount>items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount]=item;
        itemCount++;
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for (int i=0;i<itemCount;i++) {
            System.out.println("상품명: " + items[i].getProduct() + ", 합계: " + items[i].getTotal());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());

    }
    private int calculateTotalPrice() {
        int total=0;
        for (int i=0;i<itemCount;i++) {
            total += items[i].getTotal();
        }
        return total;
    }

}
