package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("Hello Java","Seo");

        Book book3 = new Book("JPA 프로그래밍","kim",700);

        Book[] books = {book1,book2,book3};
        for (Book book : books) {
            System.out.println("제목: " + book.title + ", 저자: " + book.author +", 페이지: " + book.page);
        }
    }
}
