import java.util.Scanner;

public class Alphabet_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] cnt = new int[alphabet.length];

        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = -1;
        }

        for(int i = 0; i < alphabet.length; i++){
            for(int j = 0; j < charArray.length; j++){
                if(cnt[i]==-1){
                    if(alphabet[i] == charArray[j]){
                        cnt[i]=j;
                    }
                }
            }
        }

        for(int i = 0; i < cnt.length; i++){
            System.out.print(cnt[i]+" ");
        }

    }
}
