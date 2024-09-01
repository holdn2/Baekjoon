import java.util.Scanner;

public class allPlus_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        for(int i = 1; i <= n; i++) {
            cnt+=i;
        }
        System.out.println(cnt);
    }
}
