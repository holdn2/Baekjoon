import java.util.Scanner;

public class threeDice_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int N3=sc.nextInt();
        int big=0;

        if(N1==N2 && N2==N3){
            System.out.println(10000+(N1*1000));
        }
        else if(N1==N2&& N2!=N3){
            System.out.println(1000+(N1*100));
        }
        else if(N1==N3 && N2!=N1){
            System.out.println(1000+(N1*100));
        }
        else if(N2==N3 && N2!=N1){
            System.out.println(1000+(N2*100));
        }
        else{
            if(N1>N2){
                big=N1;
            }
            else{
                big=N2;
            }
            if(big<N3){
                big=N3;
            }
            System.out.println(big*100);
        }
    }
}
