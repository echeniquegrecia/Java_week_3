public class Bread implements IFood {

    private int calories =0;
    private int price = 0;
    private int bakingTime = 0;

    public Bread(int price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getBakingTime() {
        return bakingTime;
    }
}
