import java.util.Scanner;
public class colorPaper {
    public static void main(String[] args) {

        int [][] whitePaper = new int[100][100];

        Scanner sc = new Scanner(System.in);

        int colorPaperNum = sc.nextInt();
        int [][] startPoint =new int[colorPaperNum][2]; //열이 2인 이유는 x좌표 y좌표.

        for(int i = 0; i < colorPaperNum; i++){
            startPoint[i][0]=sc.nextInt();
            startPoint[i][1]=sc.nextInt();
        }

        for(int i = 0; i < colorPaperNum; i++){
            int x=startPoint[i][0];
            int y=startPoint[i][1];
            for(int j = 0; j <10; j++){
                for(int k = 0; k < 10; k++){
                    whitePaper[x+j][y+k]++;
                }
            }
        }

        int count = 0;
        for(int i=0;i< whitePaper.length;i++){
            int[] inArr = whitePaper[i];
            for(int j=0;j<inArr.length;j++){
                if(inArr[j]>=1){
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}