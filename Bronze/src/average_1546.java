import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class average_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        double [] arr= new double[N];

        double M=0;


        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i]=Double.parseDouble(st.nextToken());
            if(arr[i]>M){
                M=arr[i];
            }
        }
        double sum = 0;

        for(int i=0;i<N;i++){
            sum+=arr[i]/M*100;
        }

        System.out.println(sum/N);

    }
}
