import java.util.Scanner;

public class kidJungmin_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        // 받는 숫자가 int형보다 큰 값을 출력 하므로 long 형(8byte)을 사용하여 출력합니다.
        // 따라서 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다. 라는 조건을 만족하기 위해 long으로
        System.out.println(A + B + C);

    }
}
