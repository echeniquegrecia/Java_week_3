public abstract class Dessert implements IFood{

    private int calories;
    private double price;

    public Dessert(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
