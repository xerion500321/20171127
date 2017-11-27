import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int v1,v2,v3 =0;
        int a = scn.nextInt();
        for (int i = 0; i < a; i++) {
            v1 = scn.nextInt();
            if (v1 < 60) {
                count++;
            }
            v2 = scn.nextInt();
            if (v2 < 60) {
                count++;
            }
            v3 = scn.nextInt();
            if (v3 < 60) {
                count++; }
                if (v1 + v2 + v3 >= 220) {
             System.out.println('P');
        }
    }
}
}

