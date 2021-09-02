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


        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                //左端のマスの判定
                if(j == 0 && Array[i][j+1].equals("#")){
                  System.out.println(i + " 0" );
                }

                //両方の端を＃で囲まれたマスの判定
                if(0<j && j<W-1){
                if(Array[i][j-1].equals("#") && Array[i][j+1].equals("#")){
                    System.out.println(i + " " + j);
                }
                }

                //右端のマスの判定
                if(j == W-1 && Array[i][H-2].equals("#")){
                System.out.println(i + " " + (H-1));

                }

            }
        }
    }
}
