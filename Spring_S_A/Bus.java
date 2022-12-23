package Spring_S_A;

public class Bus extends Vehicle{
    private static final int max_person = 100;    //최대 인원 100명 모든 보스 동일
    private static final int bus_price = 1000;    //버스 이용 요금
    private int person;     //현재 승객수

    public Bus(int number) {
        super(0, number, 100, 0, false);
        this.person = 0;
        System.out.println(number + "번 버스가 만들어 졌습니다.");
    }

    void state() {
        System.out.println("\n======== 현재 상태 ========");
        System.out.println("탑승 승객 수 = " + person);
        System.out.println("잔여 승객 수 = " + (max_person - person));
        System.out.println("누적 요금 = " + price);
        System.out.println("주유량: " + gas);
        System.out.println("=========================\n");
    }

    void boarding(int count) {
        if(!state) {  //운행 중이 아니면 출력 후 리턴
            System.out.println("버스가 운행 중이 아닙니다.");
            return;
        }
        if(this.person == max_person) { //버스가 꽉 찻으면 출력 후 리턴
            System.out.println("만석입니다.");
            return;
        }
        System.out.println(count + "명 탑승합니다.");
        if(person + count > max_person) {   //승객 탑승, 최대 인원 까지
            this.price = this.price + (max_person - this.person) * 1000;
            System.out.println("최대 승객 수 초과로 인해 " + (max_person - this.person) + "명이 탑승하고, " + (count + this.person - max_person) + "명이 못 탑승하였습니다.");
            this.person = max_person;
        } else {
            this.price += count * bus_price;
            this.person += count;
        }                                   //현재 인원 출력
        System.out.println("현재 승객 수는 " + person + "명 입니다.");
    }

    void getOff(int count) {
        person -= count;
        if(count < 0) {
            System.out.println(person + "명 내립니다.");
        } else {
            System.out.println(count + "명 내립니다.");
        }
        System.out.println("현재 승객 수는 " + person + "명 입니다.");
    }
}
