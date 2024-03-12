package 일반배열변환;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수 입력 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("찾을 수 입력");
        int key = sc.nextInt(); // 검색할 키 값
        for(int i = 0; i <arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1;
        }
        Arrays.sort(arr);
        for(int val : arr) System.out.print(val + " ");
        System.out.println();
        int result = Arrays.binarySearch(arr, key);
        if(result >= 0) System.out.println(result);
    }
}
