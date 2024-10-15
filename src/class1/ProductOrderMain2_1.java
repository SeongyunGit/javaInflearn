package class1;

public class ProductOrderMain2_1 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000,2);
        orders[1] = createOrder("김치", 5000,1);
        orders[2] = createOrder("콜라", 5000,1);
        printOrders(orders);
        getTotalAmount(orders);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity =quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders) {
        int totalAmount=0;
        for (ProductOrder order : orders) {
            totalAmount += order.price*order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}