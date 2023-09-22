public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Potato", 2, 20);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Apple", 7, 15);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
