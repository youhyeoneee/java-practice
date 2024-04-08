package day03;

import java.util.HashMap;

public class EX06 {

    // 사람 객체,
    // ApplePhone : 배터리 용량 (정수) 100,  isOn = false
    // charge() + 10
    // use() -5
    // useKaKaotalk () -5
    // useYoutube() -10
    // 배터리 용량 확인
    // turnOn
    // turnOff

    // Person => Applephone 모든 기능
    // ApplePhone => SamsungPhone 기기 변경
    public static void main(String[] args) {
        ApplePhone iphone16 = new ApplePhone();
        Person son = new Person();
        son.buyPhone(iphone16);

        SamsungPhone galaxy2223 = new SamsungPhone();
        son.buyPhone(galaxy2223);
    }
}

interface Phone {
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게 타입 형태로 제시하기 위함.
    //    => implements Phone
    //    * 추상 클래스는 extends 공통 기능 상속, 규약 구현
    //    * 인터페이스는 implements 공통 규약, 구현
    // 2. 구현체(객체)를 필요 = 구현체 사용 =
    //    메소드를 호출
    //    메소드 선언(명, 매개변수) 통일
    //    * 인터페이스는 implements 공통 기능이 아니라 규약, 구현
    //    * 추상 클래스
    // 공통된 규약을 받아서 구현하겠다.

    boolean getIsOn(); // 명시를 하지 않더라도 public abstract가 붙어 있다.

    void charge();

    void warning(String name);

    void operatorKakaotalk();

    void checkBatteryStatus();
    void turnOn();

    void turnOff();


}

class ApplePhone implements Phone {
    private final int BATTERY_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true; // isNotOff 이런식으로 변수명 하지 말기.. 변수명은 최대한 긍정으로 얘기하기


    public boolean getIsOn() {
        return isOn;
    }


    public void charge() {
        if (batteryStatus == BATTERY_CAPA) {
            System.out.println(BATTERY_CAPA + "% 입니다. ");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        }
        else {
            batteryStatus += 10;
        }
        System.out.print("배터리 충전 : " + batteryStatus + "%이 되었습니다.");
    }

    public void warning(String name) {
        System.out.println("배터리가 부족하여 " + name + "를 사용할 수 없습니다.");
    }

    public void operatorKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus <= 0) {
                turnOff();
            }
        }
    }

    public void checkBatteryStatus() {
        System.out.println("현재 배터리는 " + batteryStatus + " 입니다.");

    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}

class SamsungPhone implements Phone {
    private final int BATTERY_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true; // isNotOff 이런식으로 변수명 하지 말기.. 변수명은 최대한 긍정으로 얘기하기


    public boolean getIsOn() {
        return isOn;
    }


    public void charge() {
        if (batteryStatus == BATTERY_CAPA) {
            System.out.println(BATTERY_CAPA + "% 입니다. ");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        }
        else {
            batteryStatus += 10;
        }
        System.out.print("배터리 충전 : " + batteryStatus + "%이 되었습니다.");
    }

    public void warning(String name) {
        System.out.println("배터리가 부족하여 " + name + "를 사용할 수 없습니다.");
    }

    public void operatorKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus <= 0) {
                turnOff();
            }
        }
    }

    public void checkBatteryStatus() {
        System.out.println("현재 배터리는 " + batteryStatus + " 입니다.");

    }
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}


class Person {
    // ApplePhone phone;
    Phone phone; // 다형성을 위해 바꿔준다 삼성폰 쓰든 애플폰 쓰든 바꿀 필요 XX

    void buyPhone(Phone phone) {
        this.phone = phone;
    }

    void chargePhone() {
        phone.charge();
    }

    void useKakaotalk() {
        if (phone.getIsOn()) {
            phone.operatorKakaotalk();
        }
    }
}

