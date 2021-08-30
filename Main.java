import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt(); //開始時点のY座標
        int X = sc.nextInt(); //開始座標のX座標
        int N = sc.nextInt(); //移動の回数
        String[] direction = new String[N];
        sc.nextLine(); //行送り

        for(int i = 0; i<N; i++){
            direction[i] = sc.nextLine();
            if(direction[i].equals("N")){
                Y = Y - 1;
                System.out.println(Y + " " + X);
            }else if(direction[i].equals("S")){
                Y = Y + 1;
                System.out.println(Y + " " + X);
            }else if(direction[i].equals("E")){
                X = X + 1;
                System.out.println(Y + " " + X);
            }else if(direction[i].equals("W")){
                X = X - 1;
                System.out.println(Y + " " + X);
            }

        }

    }
}
