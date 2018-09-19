public abstract class Sandwich implements IFood{

    private boolean vegetarian = false;
    private String[] ingredients;
    private int calories;
    private double price;

    public Sandwich(boolean vegetarian, String[] ingredients, int calories, double price) {
        this.vegetarian = vegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
