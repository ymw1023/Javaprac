package sec06.exam01;

public class Keypad {

    public String keypad(int[] number, String hand) {
        String answer = "";

        int leftx = 0;
        int lefty = 0;
        int rightx = 2;
        int righty = 0;

        for(int num: number) {
            int left = 0;
            int right = 0;
            switch (num) {
                case 1: case 4: case 7:
                    answer += 'L';
                    leftx = 0;
                    lefty = (12 - num) / 3;
                    break;
                case 3: case 6: case 9:
                    answer += 'R';
                    rightx = 2;
                    righty = (12 - num) / 3;
                    break;
                case 0:
                    num = 11;
                case 2: case 5: case 8:
                    left = 1 - leftx + Math.abs((11 - num) / 3 - lefty);
                    right = rightx - 1 + Math.abs((11 - num) / 3 - righty);
                    if(left < right) {
                        answer += 'L';
                        leftx = 1;
                        lefty = (11 - num) / 3;
                    } else if(left > right) {
                        answer += 'R';
                        rightx = 1;
                        righty = (11 - num) / 3;
                    } else {
                        if("left".equals(hand)) {
                            answer += 'L';
                            leftx = 1;
                            lefty = (11 - num) / 3;
                        } else {
                            answer += 'R';
                            rightx = 1;
                            righty = (11 - num) / 3;
                        }
                    }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Keypad method = new Keypad();
        int[] number = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        System.out.println(method.keypad(number, hand));
    }
}

//[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]  "right"  "LRLLLRLLRRL"
//[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]  "left"   "LRLLRRLLLRR"
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]     "right"  "LLRLLRLLRL"