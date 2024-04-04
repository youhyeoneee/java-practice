package day01;

public class EX07 {

    public static void main(String[] args) {
        Notebook samsungNotebook = new Notebook("Samsung");
        Notebook lgNotebook = new Notebook("LG");
        Notebook appleNotebook = new Notebook("Apple");

        samsungNotebook.printBrand();
        lgNotebook.printBrand();
        appleNotebook.printBrand();

        System.out.println(samsungNotebook.brand);
    }
}

class Notebook {

    String brand;

    Notebook(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    void printBrand() {
        System.out.printf("this notebook was made by %s\n", brand);
    }

}