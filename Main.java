import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  盤面の行数Ｈ,列数W取得
        int H = sc.nextInt();
        int W = sc.nextInt();
        //Ｈ行Ｗ列の配列Array宣言
        String[][] Array = new String[H][W];

        //配列Arrayに座標の値格納
        for(int i = 0; i<W; i++){
            Array[i] = sc.next().split("");
        }
        //上端のマスの判定
        for(int i = 0; i<H; i++){
            if(Array[1][i].equals("#")){
                System.out.println(0 + " i" );
            }
            //上端下端を＃で囲まれたマスの判定
            for(int j = 1; j<W-1;j++){
                if(Array[j-1][i].equals("#") && Array[j+1][i].equals("#")){
                    System.out.println(j + " " + i);
                }
            }
            //下端のマスの判定
            if(Array[H-2][i].equals("#")){
                System.out.println(H-1 + " " + i);
            }
        }
    }
}
