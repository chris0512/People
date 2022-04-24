public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("®broccoli");

        System.out.println(fruit == anotherFruit); // both on the same memory
        System.out.println(vegetable == anotherVegetable);
    }
}
