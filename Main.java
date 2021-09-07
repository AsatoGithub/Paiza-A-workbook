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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n % 3 == 1){
            if(k % 3 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else if(n % 3 == 2){
            if(k % 3 == 0){
                System.out.println("-1");
            }else{
                System.out.println("0");
            }
        }else if(n % 3 == 0){
            if(k % 3 == 0){
                System.out.println("-1");
            }else{
                System.out.println("0");
            }
        }


    }
}
