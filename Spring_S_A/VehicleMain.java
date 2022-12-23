package Spring_S_A;

public class VehicleMain {
    public static void main(String[] args) {
        Bus bus = new Bus(1);   //생성자에서 버스의 번호를 지정해줌
        Bus test = new Bus(2);  //객체마다 번호가 다름!

        bus.start();                //운행시작
        bus.speedUpdate(70);        //속도를 70으로 만듬
        bus.boarding(30);     //30명 추가
        bus.state();                //현상태 출력
        bus.boarding(30);     //30명 추가
        bus.getOff(15);       //15명 내림
        bus.gasUpdate(-50);    //주유량 줄임
        bus.gasUpdate(10);     //주유량 늘림
        bus.state();                //현상태 출력
        bus.boarding(90);     //인원 초과해서 추가
        bus.state();                //현상태 출력
        bus.gasUpdate(-100);   //주유량보다 많이 없앰
        bus.stop();

        System.out.println("\n\n==========================\n택시 클래스 연습으로 갑니다\n==========================\n\n\n\n");

        Taxi taxi = new Taxi(1);    //생성자에서 택시의 번호를 지정해줌
        Taxi test2 = new Taxi(2);   //객체마다 번호가 다름!

        taxi.start();               //운행시작
        taxi.speedUpdate(100);      //속도를 100으로 만듬
        taxi.boarding(2, "서울역", 2); //인원 수와 목적지 거리를 받음
        taxi.state();               //현상태 출력
        taxi.gasUpdate(-80);   //주유량 줄임
        taxi.getOff();              //손님들 하차
        taxi.state();               //현상태 출력
        taxi.boarding(5, "구로디지털단지역", 12);   //최대인원보다 많은 수 입력
        taxi.boarding(3, "구로디지털단지역", 12);   //3명 추가
        taxi.state();               //현상태
        taxi.getOff();
        taxi.state();
        taxi.gasUpdate(-20);   //주유량 줄임
        taxi.stop();
    }
}
