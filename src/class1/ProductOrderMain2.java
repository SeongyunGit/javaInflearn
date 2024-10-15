package class1;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0]=createOrder("두부",2000,2);
        orders[1]=createOrder("김치찌개",7000,3);
        orders[2]=createOrder("고기",5000,2);

        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int amount = 0;
        for (int i = 0; i < 3; i++) {
            amount += orders[i].price * orders[i].quantity;
        }
        return amount;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i=0;i<3;i++) {
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }
    }

    static ProductOrder createOrder(String productName,int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
}
