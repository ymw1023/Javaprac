package sec06.exam01;

import java.util.Arrays;

public class TestQ6 {
    public void solution(int[][] arr1) {
        int[][] copyArr1 = new int[arr1.length + 2][arr1[0].length + 2] ;    //음수가 안나올경우가능 - 음수가 나온다면 Arrays.fill함수로 초기화작업 필요...
                                                                            //배열을 복사하는 과정에서 시간이 걸리므로 효율성은 안좋음
        for(int i = 0; i < arr1.length; i++) {      //7 * 7 배열에 복사
            for(int j = 0; j < arr1[0].length; j++) {
                copyArr1[i + 1][j + 1] = arr1[i][j];
            }
        }

        for(int i = 1; i < copyArr1.length - 1; i++) {    //배열에서 조건 판별 후 바로 출력
            for(int j = 1; j < copyArr1[0].length - 1; j++) {    //i, j가 끝값이어도 상하좌우 비교 ok
                if(copyArr1[i][j] > copyArr1[i][j - 1] && copyArr1[i][j] > copyArr1[i - 1][j] && copyArr1[i][j] > copyArr1[i][j + 1] && copyArr1[i][j] > copyArr1[i + 1][j]) {
                    System.out.print('*');
                } else {
                    System.out.print(copyArr1[i][j]);
                }
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        TestQ6 method = new TestQ6();
        int[][] arr1 = {{3,4,1,4,9}, {2,9,4,5,8}, {9,0,8,2,1}, {7,0,2,8,4}, {2,7,2,1,4}};

        method.solution(arr1);
    }
}
//{{3,4,1,4,9}, {2,9,4,5,8}, {9,0,8,2,1}, {7,0,2,8,4}, {2,7,2,1,4}}
//{{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}}