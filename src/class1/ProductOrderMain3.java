package class1;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int N = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[N];
        for (int i=0;i<N;i++) {
            System.out.println((i+1)+"번째 주문정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orders[i] = createOrder(productName, price, quantity);
        }
        printOrder(orders, N);
        getTotal(orders, N);

    }

    static void printOrder(ProductOrder[] orders,int N) {
        for (int i=0;i<N;i++) {
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }
    }

    static void getTotal(ProductOrder[] orders,int N) {
        int total=0;
        for (int i=0;i<N;i++) {
            total += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity =quantity;
        return order;
    }
}
