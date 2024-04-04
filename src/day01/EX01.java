package day01;

public class EX01 {

    private int score = 87;
    private String degrade = "";

    public void setDegrade() {
        // 점수를 받는 변수, 87점
        if (this.score >= 90) this.degrade = "A";
        else if (this.score >= 80) this.degrade = "B";
        else if (this.score >= 70) this.degrade = "B";
        else this.degrade = "F";
    }

    private void print() {
        System.out.printf(this.degrade);
    }

    public static void main(String[] args) {
        int score = 87;
        String degrade;
        // 점수를 받는 변수, 87점
        if (score >= 90) degrade = "A";
        else if (score >= 80) degrade = "B";
        else if (score >= 70) degrade = "B";
        else degrade = "F";

        System.out.println(degrade);

    }


}
