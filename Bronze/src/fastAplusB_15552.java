//빠른 입출력을 위한 예제. 스트림 이용.
import java.io.*;
import java.util.StringTokenizer;

public class fastAplusB_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int a,b=0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
