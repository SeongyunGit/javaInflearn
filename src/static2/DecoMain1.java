package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello Java";
        DecoUtil utils = new DecoUtil();


        System.out.println("before: " + s);
        System.out.println("After: " + utils.deco(s));

    }
}
