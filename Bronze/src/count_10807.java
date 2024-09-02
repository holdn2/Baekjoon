import java.io.*;
import java.util.StringTokenizer;

public class count_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N =Integer.parseInt(br.readLine());
        int []arr=new int[N];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int find=Integer.parseInt(br.readLine());
        int cnt=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                cnt++;
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
