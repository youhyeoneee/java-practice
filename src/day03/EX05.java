package day03;

public class EX05 {

    public static void main(String[] args) {

        // OTT : Netflix
        // printOpeningLogo() : sout "Netflix
        // netfilx.play() => printOpen ...
        //                      "영상 시작" ..
        // netfilx.finish() : sout " 다봣당~"

        Netflix netflix = new Netflix();
        netflix.play();
        netflix.finish();

    }
}

abstract class OTT {

    abstract void printOpeningLogo(); // 공통 규약을 내리는 것
    // abstract로 하면 반드시 자식에서 정의해야댐
    void play() {
        printOpeningLogo();
        System.out.println("영상 시작!");
    }
    void finish() {
        System.out.println("다봤당!");
    }

}

class Netflix extends OTT {
    @Override
    void printOpeningLogo() {
        System.out.println("~ Netflix ~");
    }

}


