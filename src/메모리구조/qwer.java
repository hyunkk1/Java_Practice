package 메모리구조;

public class qwer {
    public static void main(String[] args) {
        int[][] array = new int[5][5]; // 5x5 크기의 2차원 배열 선언

            // 배열 초기화
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    array[i][j] = 0; // 각 원소를 0으로 초기화
                }
            }

            int count = 1; // 출력할 값의 시작점

            // 배열에 값 할당
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0 && j == 4) { // (1,5)의 위치에 1 할당
                        array[i][j] = count++;
                    } else if (i == 1 && j >= 3) { // (2,4)부터 (2,5)까지에 2부터 3 할당
                        array[i][j] = count++;
                    } else if (i == 2 && j >= 2) { // (3,3)부터 (3,5)까지에 4부터 6 할당
                        array[i][j] = count++;
                    } else if (i == 3 && j >= 1) { // (4,2)부터 (4,5)까지에 7부터 10 할당
                        array[i][j] = count++;
                    } else if (i == 4) { // (5,1)부터 (5,5)까지에 11부터 15 할당
                        array[i][j] = count++;
                    }
                }
            }

            // 배열 출력
            System.out.println("배열 출력:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(array[i][j] + " "); // 배열의 원소 출력
                }
                System.out.println(); // 한 행이 끝나면 줄바꿈
            }
        }
    }


