import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //要素数N
        int[] Nlist = new int[N]; //要素格納配列
        int answer = 0; //結果格納変数
        for(int i = 0; i<N; i++){
            Nlist[i] = sc.nextInt();
        }

        int n = sc.nextInt(); //クエリの数
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j<=b; j++){
                answer = answer + Nlist[j];
            }
            System.out.println(answer);
            answer = 0; //answer初期化
        }

    }
}
