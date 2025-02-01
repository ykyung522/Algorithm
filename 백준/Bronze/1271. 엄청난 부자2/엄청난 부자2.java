import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());

        BigInteger result1 = n.divide(m);
        BigInteger result2 = n.remainder(m);
       
        System.out.println(result1);
        System.out.println(result2);
        sc.close();
    }
}
