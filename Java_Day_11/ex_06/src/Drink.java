public abstract class Drink implements IFood{


    private boolean can = false;
    private int calories;
    private double price;

    public Drink(boolean can, int calories, double price) {
        this.can = can;
        this.calories = calories;
        this.price = price;
    }

    public boolean isCan() {
        return can;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
