import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); //行数
        int W = sc.nextInt(); //列数
        int Y = sc.nextInt(); //Y座標
        int X = sc.nextInt(); //X座標
        String[][] map = new String[H][W];

        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                if(X == j && Y == i){
                    System.out.print("!");
                }else if(X == j || Y == i){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
