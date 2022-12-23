package Spring_S_A;

abstract public class Vehicle {
    protected int price;
    protected int number;
    protected int gas;
    protected int speed;
    protected boolean state;

    public Vehicle(int price, int number, int gas, int speed, boolean state) {
        this.price = price;
        this.number = number;
        this.gas = gas;
        this.speed = speed;
        this.state = state;
    }

    abstract void state();

    void start() {  //함수 실행 시 상태를 true
        if(this.state) return;
        this.state = true;
        System.out.println("운행을 시작 합니다.");
    }

    void stop() {   //함수 실행 시 상태를 false
        if(!this.state) return;     //주유량이 0이면 자동으로 운행종료됨 판별
        this.state = false;
        System.out.println("운행을 종료 합니다.");
    }

    public void speedUpdate(int speed) {    //속도의 변화를 줌
        this.speed += speed;
        if(this.speed < 0) {    //스피드는 마이너스로 못감
            this.speed = 0;
        }
        System.out.println("현재 속도는 " + this.speed + "km/h 입니다.");
    }

    public void gasUpdate(int num) {
        gas += num;
        System.out.println(num + " 만큼 주유량을 변화시킵니다.");
        if(gas < 0) {   //주유량은 마이너스로 못감
            gas = 0;
        }
        System.out.println("현재 주유량: " + gas + " 입니다");
        if(gas <= 10) {     //주유량이 10이하이면 경고문 출력
            System.out.println("주유가 필요합니다.");
        }
        if(gas == 0) {      //주유량이 0이면 자동으로 운행종료
            this.stop();
        }
    }
}
