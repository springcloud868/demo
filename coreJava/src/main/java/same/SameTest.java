package same;

public class SameTest {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        String str1 = "123";
        String str2 = "123";
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
