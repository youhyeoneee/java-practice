package day02;

public class MiniAssignment01 {
    public static void main(String[] args) {
        Store store = new Store(2);

        // 쏘니가 핸드폰을 샀습니다.
        Person sony = new Person("쏘니");
        store.sellPhone(sony, true) ;

        // 베컴도 핸드폰을 샀습니다.
        Person beckham = new Person("베컴");
        store.sellPhone(beckham, false);

        // 쏘니가 핸드폰을 켰습니다.
        sony.say("야 내 핸드폰 켜볼게");
        sony.turnOnPhone();

        // 베컴도 핸드폰을 켰습니다.
        beckham.say("turn on");
        beckham.turnOnPhone();
    }
}

class Person {
    private String name;
    private Phone phone;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 핸드폰 구입 메서드
    void buyPhone(boolean isSamsung) {
        if (isSamsung)
            phone = new SamsungPhone(); // 메서드 내에서 객체를 생성하면 의존성이 높아진다.
        else
            phone = new IPhone();
    }

    // 말하는 메서드
    void say(String words) {
        System.out.println(name + " : " + words);
    }

    // 핸드폰 키는 메서드
    void turnOnPhone() {
        if (phone != null) // 객체와 상호작용
            phone.turnOn(); // System.out.println(phone.getSound());
        else
            System.out.println("핸드폰이 없는디요");
    }
}

class Phone {
    Phone() {

    }

    void turnOn() {
    }
}

class SamsungPhone extends Phone {
    SamsungPhone() {
        super();
    }
    void turnOn() {
        System.out.println("삐비빅");
    }

}

class IPhone extends Phone {
    IPhone() {
        super();
    }
    void turnOn() {
        System.out.println("bbeep");
    }
}





class Store {
    private int stock; // 재고

    private Person staff; // 직원
    Store(int stock) {
        this.stock = stock;
        this.staff = new Person("직원");
    }

    void sellPhone(Person customer, boolean isSamsung) {
        if (stock > 0) {
            customer.buyPhone(isSamsung); // customer은 삼성 혹은 아이폰을 구매
            this.stock--; // 재고 감소
            staff.say(customer.getName() + "님 구매해주셔서 감사합니다 또오세용!");
        }
        else
            staff.say("품절되었습니다 ㅠㅠ");
    }
}