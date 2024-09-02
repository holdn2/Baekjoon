import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class compareReverse_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        char [] arrA = new char[3];
        char [] arrB = new char[3];

        for(int i=2;i>=0;i--){
            arrA[i]=A.charAt(2-i);
            arrB[i]=B.charAt(2-i);
        }

        A=new String(arrA);
        B=new String(arrB);
        if(Integer.parseInt(A)>Integer.parseInt(B)){
            System.out.println(A);
        }
        else{
            System.out.println(B);
        }

    }
}
