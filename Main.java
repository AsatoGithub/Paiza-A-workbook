import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        if(n % 3 == 1){
            if(k % 3 == 0){
                answer = -1;
            }else{
                answer = 0;
            }
        }else if(n % 3 == 2){
            if(k % 3 == 0){
                answer = -1;
            }else{
                answer = 0;
            }
            }else{
                if(k % 3 == 0){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}
