import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); //行数
        int W = sc.nextInt(); //列数
        sc.nextLine(); //行送り
        String[][] Array = new String[H][W];

        for(int i = 0; i<H; i++){
                String str = sc.nextLine();
                Array[i] = str.split("");
        }

        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
               if(Array[i][j].equals("#")){
                    System.out.println(i + " " + j);
               }
            }
        }
    }
    }
