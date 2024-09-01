import java.util.Scanner;

public class Multiple_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int hund = N2/100;
        int ten = (N2%100)/10;
        int one = N2%10;

        System.out.println(one*N1);
        System.out.println(ten*N1);
        System.out.println(hund*N1);
        System.out.println(N2*N1);

    }
}
