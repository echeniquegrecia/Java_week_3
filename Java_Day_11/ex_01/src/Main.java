public class Main {
    public static void main(String[] args) {
        IFood bread = new Bread(2,50);
        System.out.println("The bread costs " + bread.getPrice() + " euros and contains "
        + bread.getCalories() + " calories.");

    }
}
