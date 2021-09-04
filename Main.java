import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        int answer = 0;

        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
            answer = answer + list[i];
            System.out.println(answer);
        }

    }
}
