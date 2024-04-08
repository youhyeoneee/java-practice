package day03;

public class EX01 {
    // Cow, Chicken : cry() - "음메" "꼬끼오"
    // Farm : getSound() - cow,  chicken .cry()
    // Animal : 상속 - 오버라이딩
    public static void main(String[] args) {
        Cow cow = new Cow(); // 왠만한 객체 생성은 메인에서 하고 넣어 주는게 맞다.
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);

        farm.getSound();
    }
}

class Farm {
    Cow cow;
    Chicken chicken;

    Farm() {
//        cow = new Cow(); // 생성자는 더 결합도가 높아진다. ㅠㅠ
//        chicken = new Chicken();
    }

    Farm(Cow cow, Chicken chicken) {
        this.cow = cow;
        this.chicken = chicken;
    }
    void  먹이를_준다() {
        cow.eat();
        chicken.eat();
    }

    void getSound() {
//        cow = new Cow();
//        chicken = new Chicken();
        // 특정 메소드가 없어지면 생성하지 못할 때 : 너무 결합도가 높은 거 아니니 !!? => Spring에선 이런게 최대한 없어야 함

        cow.cry();
        chicken.cry();
    }



}

class Animal {

    void cry() { // 강제성을 준다
        // 텅텅 비어있는 메소드

    }

    void eat() {
        System.out.println("냠냠");
    }
}

class Cow extends Animal {
    @Override // 어노테이션
    void cry() {
        System.out.println("음메");
    }
}

class Chicken extends Animal {
    @Override
    void cry() {
        System.out.println("꼬끼오");
    }
}