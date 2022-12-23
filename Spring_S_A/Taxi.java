package Spring_S_A;

public class Taxi extends Vehicle{
    private static final int max_person = 4;    //최대 인원 4명 모든 택시동일
    private static final int deflautPrice = 2000;   //기본요금  모든 택시동일
    private static final int deflautDistance = 10;  //기본거리
    private static final int distancePrice = 500;   //거리당요금

    private int person;     //현재 승객수
    private String destination;     //목적지
    private String location;        //현재위치
    private int distance;    //목적지 까지의 거리
    private boolean check;  //현재 승객이 있는 상태인지 확인

    public Taxi(int number) {
        super(0, number, 100, 0, false);
        this.location = "집";
        System.out.println(number + "번 택시가 만들어 졌습니다.");
    }

    public void boarding(int count, String destination, int distance) {
        if(!this.state) {   //운행 중이 아닐때
            System.out.println("택시가 운행 중이 아닙니다.");
        } else if(check) {  //현재 탑승자가 있을때
            System.out.println("현재 택시는 탑승자가 있습니다.");
        } else if(count > max_person) { //탑승인원이 정원보다 많을때
            System.out.println(count + "명은 " + max_person + "명보다 많기 때문에 탑승하실 수 없습니다.");
        } else {    //나머지
            this.check = true;
            this.person = count;
            this.destination = destination;
            this.distance = distance;
            System.out.println(count + "명이 탑승하셨습니다.");
            System.out.println("출발지는 " + location + " 입니다.");
            System.out.println("목적지는 " + destination + " 입니다.");
        }
    }

    public void getOff() {
        person = 0;     //거리가 기본거리보다 큰지비교,          크다면: 기본요금 + 추가거리 * 거리당요금,    작다면: 기본요금
        int money = distance > deflautDistance ? deflautPrice + (distance - deflautDistance) * distancePrice : deflautPrice;
        System.out.println("목적지 " + destination + "에 도착하였습니다.");
        System.out.println("손님들이 내립니다. 가격은 " + (money) + "원 입니다.");
        System.out.println("현재 손님을 받을 수 있는 상태입니다.");
        price = price + money;    //현재돈 + 기본요금 + 거리요금
        check = false;
        location = destination;
        destination = "없음";
        distance = 0;
    }

    public void state() {
        System.out.println("\n======== 현재 상태 ========");
        System.out.println("출발지 = " + location);
        System.out.println("목적지 = " + destination);
        System.out.println("거리 = " + distance + "km");
        System.out.println("탑승 승객 수 = " + person);
        System.out.println("잔여 승객 수 = " + (max_person - person));
        System.out.println("상태: " + (check ? "손님을 받을 수 없습니다." : "손님을 받을 수 있습니다."));
        System.out.println("누적 요금 = " + price);
        System.out.println("주유량: " + gas);
        System.out.println("=========================\n");
    }
}
