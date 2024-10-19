package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        FieldInt fieldInt1 = new FieldInt();
        FieldInt fieldInt2 = new FieldInt();
        FieldInt fieldInt3 = new FieldInt();

        System.out.println(fieldInt1.value);
        System.out.println(fieldInt2.value);
        System.out.println(fieldInt3.value);

        System.out.println("상수");
        System.out.println(FieldInt.CONST_VALUE);
    }
}
