package 전자레인지;

import java.util.Scanner;

public class Jeonja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int T = sc.nextInt();
        int[] time = {300 ,60, 10};
        int[] count = new int[3];
        for (int i = 0; i < 3; i++) {
            count[i] = T / time[i];
            T %= time[i];
        }
        if (T != 0) {
            System.out.println("-1");
        } else {
            for (int c : count) {
                System.out.print(c + " ");
            }
        }
    }
}
