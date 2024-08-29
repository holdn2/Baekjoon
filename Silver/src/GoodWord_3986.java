import java.util.Scanner;
import java.util.Stack;

public class GoodWord_3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wordsNum=sc.nextInt();
        int cnt = 0;


        for(int i=0;i<wordsNum;i++) {
            Stack<String> wordStack = new Stack<>();
            //스택 재사용하지 않고 for문마다 다시 생성
            String word = sc.next();
            String[]arr=word.split("");
            for(String s:arr) {
                if(wordStack.isEmpty()) {
                    wordStack.push(s);
                } else if (wordStack.peek().equals(s)) {
                    wordStack.pop();
                }
                else{
                    wordStack.push(s);
                }
            }
            if(wordStack.isEmpty()) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
