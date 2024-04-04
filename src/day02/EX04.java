package day02;

public class EX04 {
    public static void main(String[] args) {
        Car bus = new Bus();
        bus.getWheelNum();
        bus.ride();

        Car taxi = new Taxi();
        taxi.getWheelNum();
        taxi.ride();
    }


}

// 부모 클래스는 자식 클래스의 공통된 특징
// 자식 설계 후 부모 설계 들어가는 게 훨씬 쉽다 !! :중요:
class Car {
    int wheel = 4;
    void getWheelNum() {
        System.out.println("바퀴 수는 "+ wheel + "개 입니다.");
    }
    void ride() {
    }
}
// 버스
class Bus extends Car {

    Bus() { // 자식 클래스에는 super()을 포함한 생성자가 기본으로 생략되어 있음
        super(); // 부모 생성자를 호출
    }

    void ride() {
        System.out.println("부릉부릉");
    }
}
// 택시
class Taxi extends Car{

    void ride() {
        System.out.println("빵빵");
    }
}
// 메서드 : 달린다 (버스- 부릉부릉, 택시 - 빵빵)