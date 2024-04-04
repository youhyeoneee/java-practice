package day02;

public class EX01 {

    public static void main(String[] args) {
        Animal dog = new Animal("꿍디", "멍멍");
        dog.cry();
    }

}


// 동물 클래스
// 이름(생성자, 필드), 메소드 : 울음소리

class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void cry() {
        System.out.println(sound);
    }
}