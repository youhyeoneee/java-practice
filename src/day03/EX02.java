package day03;

public class EX02 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method(); // 부모

        Child child = new Child();
        child.method(); // 자식

        Parent parent2 = new Child();
        parent2.method(); // 자식
//        parent2.metod();

        Child child2 = (Child) parent2;
        child2.metod();

    }

}

class Parent {
    void method() {
        System.out.println("부모 메서드");
    }
}

class Child extends Parent {

    @Override
    void method() {
        System.out.println("자식 메서드");

    }

    void metod() {
        System.out.println("자식 메토드");

    }
}