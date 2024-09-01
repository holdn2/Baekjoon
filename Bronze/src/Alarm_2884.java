import java.util.Scanner;

public class Alarm_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 현재 시간에서 45분을 뺀다. 알람 설정.
        m -= 45;

        // 분이 음수가 된 경우
        if (m < 0) {
            m += 60;  // 60분을 더해줌
            h--;      // 한 시간을 빼줌
            // 시간이 음수가 된 경우 (0시에서 1시간을 빼는 경우)
            if (h < 0) {
                h = 23;
            }
        }

        System.out.println(h + " " + m);
    }
}
