import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //開始時点のx座標
        int Y = sc.nextInt(); //開始時点のy座標
        int N = sc.nextInt(); //移動回数N
        int count = 1;
        int counter = 1;
        int Ncloke = 0;

        while(Ncloke < N){
            if(count == 1){
                X = X + counter;
                count = count + 1;
                Ncloke = Ncloke + counter;
            }else if(count == 2){
                Y = Y + counter;
                count = count + 1;
                counter = counter + 1;
                Ncloke = Ncloke + counter;
            }else if(count == 3){
                X = X - counter;
                count = count + 1;
                Ncloke = Ncloke + counter;
            }else if(count == 4){
                Y = Y - counter;
                count = 1;
                counter = counter + 1;
                Ncloke = Ncloke + counter;
            }
        }
        System.out.println(X + " " + Y);
    }
}
