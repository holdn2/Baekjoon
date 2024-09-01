import java.util.Scanner;

public class compareNum_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();

        if(N1>N2){
            System.out.println(">");
        } else if (N1<N2) {
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
