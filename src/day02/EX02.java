package day02;

public class EX02 {
    public static void main(String[] args) {

        int price = 7000;

        Coffee latte = new Coffee(7000);

//        latte.price = 7000;

        latte.setPrice(6000);
        latte.setPrice(-6000);

//        latte.getInfo();

        Barista chunsik = new Barista("춘식");
        chunsik.getCoffeeInfo();
        chunsik.makeCoffee();
    }
}

// 커피
// 필드 : 가격, 핫 or 아이스, 사이즈
// 메소드 : getInfo - sout : 필드 출력

class Coffee {

    private int price;

    Coffee(int price) {
        this.price = price;
    }

    public void setPrice(int price) {

        // 필드 값 설정 'set'
        // 변경할 값을 검증하는 용도로도 사용된다.
        if (price > 0)
            this.price = price;
    }

    public int getPrice() {
        return price;
    }

    void getInfo() {
        System.out.println("이 커피는 가격이 " + price + "원입니다.");
    }
}

class Barista {
    String name;
    Coffee coffee;

    Barista(String name) {
        this.name = name;
        coffee = new Coffee(4500);
    }

    void getCoffeeInfo() {
        System.out.println("이 커피는 " + coffee.getPrice() + "원입니다.");
    }

    void makeCoffee() {
        System.out.println("커피 여기 있습니다 ~");
    }
}