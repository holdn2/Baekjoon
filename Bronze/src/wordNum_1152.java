import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordNum_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim(); // 앞뒤 공백 제거

        // 빈 문자열 처리
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            // 공백을 기준으로 단어들을 분리한 후 단어 수 계산
            String[] words = s.split("\\s+");
            System.out.println(words.length);
        }

        br.close();
    }
}
