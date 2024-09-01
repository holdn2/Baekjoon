import java.util.Scanner;

public class Oven_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int plusH = t/60;
        int plusM = t%60;

        h+=plusH;
        m+=plusM;
        if(m>=60){
            h++;
            m-=60;
        }
        h=h%24;

        System.out.println(h + " " + m);
    }
}
