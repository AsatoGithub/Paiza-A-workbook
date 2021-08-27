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
        //左端のマスの判定
        for(int i = 0; i<H; i++){
            if(Array[i][1].equals("#")){
                System.out.println(i + " 0" );
            }
            //両方の端を＃で囲まれたマスの判定
            for(int j = 1; j<W-1;j++){
                if(Array[i][j-1].equals("#") && Array[i][j+1].equals("#")){
                    System.out.println(i + " " + j);
                }
            }
            //右端のマスの判定
            if(Array[i][H-2].equals("#")){
                System.out.println(i + " " + (H-1));
            }
        }
    }
}
