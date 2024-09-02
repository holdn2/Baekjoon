import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ballChange_10813 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int []basket=new int[N];

        for(int i=0;i<N;i++){
            basket[i]=i+1;
        }

        int temp;
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            temp=basket[a-1];
            basket[a-1]=basket[b-1];
            basket[b-1]=temp;
        }

        for(int i=0;i<N;i++){
            System.out.print(basket[i]+" ");
        }

    }
}
