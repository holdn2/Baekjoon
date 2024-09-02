import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class minMax_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        bw.write(arr[0]+" "+arr[N-1]);
        bw.flush();
        bw.close();
        br.close();
    }
}
