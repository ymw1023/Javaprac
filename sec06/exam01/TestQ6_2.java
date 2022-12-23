package sec06.exam01;

public class TestQ6_2 {
    public void solution(int[][] arr1) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                if(j != 0 && arr1[i][j] <= arr1[i][j - 1]) {    //j가 0이 아닐때 j - 1인덱스와 비교
                    System.out.print(arr1[i][j]);
                } else if(i != 0 && arr1[i][j] <= arr1[i - 1][j]) {       //i가 0이 아닐때 i - 1인덱스와 비교
                    System.out.print(arr1[i][j]);
                } else if(j != arr1[0].length - 1 && arr1[i][j] <= arr1[i][j + 1]) {      //j가 끝값이 아닐때 j + 1인덱스와 비교
                    System.out.print(arr1[i][j]);
                } else if(i != arr1.length - 1 && arr1[i][j] <= arr1[i + 1][j]) {         //i가 끝값이 아닐때 i + 1인덱스와 비교
                    System.out.print(arr1[i][j]);
                } else {            //상하좌우의 숫자보다 큼!
                    System.out.print('*');
                }
            }
            System.out.print('\n');     //줄바꿈
        }
    }

    public static void main(String[] args) {
        TestQ6_2 method = new TestQ6_2();
        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

        method.solution(arr1);
    }
}
//{{3,4,1,4,9}, {2,9,4,5,8}, {9,0,8,2,1}, {7,0,2,8,4}, {2,7,2,1,4}}
//{{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}}