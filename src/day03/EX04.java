package day03;

public class EX04 {
    public static void main(String[] args) {
        // 레시피 - 슈퍼 : getInfo이 레싶 00의 레싶
        // 파스타 레시피 - 자식 : make Source
        // 스테이크 레시피 - -- : grill ~~

        PastaRecipe pasta = new PastaRecipe("유현");
        pasta.getInfo();

        SteakRecipe steak = new SteakRecipe("형준");
        steak.getInfo();

    }
}

class Recipe {

    String name;

    Recipe(String name) {
        this.name = name;
    }
    void getInfo() {
        System.out.println("이 레시피는 " + name + " 쉐프님의 레시피입니다.");
    };
}

class PastaRecipe extends Recipe {
    PastaRecipe(String name) {
        super(name);
    }

    void makeSource() {
        System.out.println("소스 맛있게 만들어용");
    }

    void boilNoodles() {
        System.out.println("면 삶기");
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("이 레시피는 파스타 레시피입니다.");
        makeSource();
        boilNoodles();
    }
}

class SteakRecipe extends Recipe {

    SteakRecipe(String name) {
        super(name);
    }

    void grill() {
        System.out.println("고기 굽기 취치이이익");
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("이 레시피는 스테이크 레시피입니다.");
        grill();
    }
}


