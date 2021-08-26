import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  盤面の行数Ｈ,列数Ｗ,与えられる座標数Ｎ取得
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        //Ｈ行Ｗ列の配列Array宣言
        String[][] Array = new String[H][W];

        //配列Arrayに座標の値格納
        for(int i = 0; i<W; i++){
            Array[i] = sc.next().split("");
        }

        //a行ｂ列の値を#に変更
        for(int i = 0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                Array[a][b] = "#";
        }

        //#に置き換えた後の配列Arraiの要素を出力
        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                System.out.print(Array[i][j]);
            }
            System.out.println("");
        }
    }
}
