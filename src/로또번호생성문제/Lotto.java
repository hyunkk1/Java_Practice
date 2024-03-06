package 로또번호생성문제;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        // 로또 번호 생성 함수를 호출하여 로또 번호를 가져옴
        int[] lottoNumbers = gnrLottoNum();
        // 생성된 로또 번호를 출력
        System.out.println("로또 번호 " + Arrays.toString(lottoNumbers));
    }

    public static int[] gnrLottoNum() {
        // 1부터 45까지의 숫자를 저장하는 배열 생성
        int[] nums = new int[45];
        // 배열에 1부터 45까지의 숫자 할당
        for (int i = 0 ; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        // 로또 번호를 저장할 배열 생성
        int[] lottonumbers = new int[6];
        // 로또 번호 배열에 중복되지 않는 6개의 숫자 채우기
        int idx = 0; // 로또 번호 배열의 인덱스
        for(int num : nums) { // nums 배열의 각 요소를 num 변수에 할당하여 반복
            // 이미 6개의 로또 번호가 생성되었으면 반복문 종료
            if (idx >= 6) {
                break;
            }

            // 1부터 45까지의 임의의 인덱스 생성
            int rdnIndex = (int) (Math.random()* 45);
            // 중복된 숫자가 아니면 해당 숫자를 로또 번호 배열에 추가
            if (nums[rdnIndex] != 0) {
                lottonumbers[idx] = nums[rdnIndex];
                // 이미 사용된 숫자는 0으로 변경하여 중복 사용 방지
                nums[rdnIndex] = 0;
                idx ++; // 로또 번호 배열의 다음 인덱스로 이동
            }
        }
        return lottonumbers; // 생성된 로또 번호 배열 반환
    }
}
