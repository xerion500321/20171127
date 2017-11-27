import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int b1 = scn.nextInt();
        int a2 = scn.nextInt();
        int b2 = scn.nextInt();
        int total = 60 * (a2 - a1) + b2-b1;
        int v1 = total / 30;
        int sum = 0;
        if (v1 > 4) {
            sum = 120;
            v1 = v1 - 4;
        } else {
            sum = v1 * 30;
            v1 = 0;
        }
        if (v1 > 4) {
            sum = sum + 160;
            v1 = v1 - 4;
        } else {
            sum = sum + v1 * 40;
            v1 = 0;
        }
        if (v1 > 0) {
            sum = sum + v1 * 60;
        }
        System.out.println(sum);
    }
}

