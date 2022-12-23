package sec06.exam01;

import java.util.*;

public class Q12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int weight = sc.nextInt();

        Object[] arr = new Object[n];

        for(int i = 0; i < n; i++) {    //무게와 가치가 매칭이 되게 저장
            arr[i] = new Object(sc.nextInt(), sc.nextInt());
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j].getWeight() > arr[j + 1].getWeight()) {   //무게를 오름차순으로 정렬
                    Object temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else if(arr[j].getWeight() == arr[j + 1].getWeight()){    //무게가 같을경우
                    if(arr[j].getValue() < arr[j + 1].getValue()) {     //값 기준 내림차순
                        Object temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            int wsum = 0;
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                wsum += arr[j].getWeight();
                if(wsum > weight) {
                    break;
                }
                sum += arr[j].getValue();
            }
            if(sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }

    public static class Object {
        int weight;
        int value;

        public Object(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public Object() {
            this.weight = 0;
            this.value = 0;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
