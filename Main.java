import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt(); //開始時点のY座標
        int X = sc.nextInt(); //開始座標のX座標
        String D = sc.next(); //向いている方角
        sc.nextLine(); //行送り
        String direction = sc.nextLine(); //移動の向き

        //向いている方角から移動したときの座標変化
            if(D.equals("N")){
                if(direction.equals("R")){
                    X = X + 1;
                }else if(direction.equals("L")){
                    X = X - 1;
                }
            }else if(D.equals("E")){
                if(direction.equals("R")){
                    Y = Y + 1;
                }else if(direction.equals("L")){
                    Y = Y - 1;
                }
            }else if(D.equals("W")){
                if(direction.equals("R")){
                    Y = Y - 1;
                }else if(direction.equals("L")){
                    Y = Y + 1;
                }
            }else if(D.equals("S")){
                if(direction.equals("R")){
                    X = X - 1;
                }else if(direction.equals("L")){
                    X = X + 1;
                }
            }

        System.out.println(Y + " " + X); //Y,X座標出力
    }
}
