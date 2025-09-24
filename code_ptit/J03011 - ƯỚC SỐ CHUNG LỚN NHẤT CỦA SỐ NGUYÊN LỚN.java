
import java.util.*;

public class tryJava {
    static long div(String s, long n){
        long residual = 0;
        for(int i = 0; i < s.length(); i++){
            residual = residual * 10 + (s.charAt(i) - '0');
            residual %= n;
        }
        return residual;
    }
    static String Gcd(String a, long b){
        if(b == 0) return a;
        return Gcd(String.valueOf(b),div(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            String b = sc.next();
            System.out.println(Gcd(b,a));
        }
    }
}
