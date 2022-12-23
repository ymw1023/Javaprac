package sec06.exam01;

public class TestQ2 {
    public int TotalHour(int[] checkIns, int[] checkOuts) {
        int total = 0;  //시간의 총합
        for(int i = 0; i < checkIns.length; i++) {
            if(checkOuts[i] >= 29) {
                checkOuts[i] = 21;
            }
            total = total + checkOuts[i] - checkIns[i];
        }
        return total;
    }


    public static void main(String[] args) {
        TestQ2 method = new TestQ2();

        int[] checkIns = new int[] {9, 9, 9, 9, 7, 9, 8};
        int[] checkOuts = new int[]{23, 23, 30, 28, 30, 23, 23};

        System.out.println(method.TotalHour(checkIns, checkOuts));
    }
}

//9, 9, 8, 8, 7, 8, 9
//21, 25, 21, 21, 22, 23, 21
//96

//9, 7, 8, 9, 7, 9, 8
//23, 22, 26, 26, 21, 27, 22
//110

//9, 9, 9, 9, 7, 9, 8
//23, 23, 30, 28, 30, 23, 23
//102