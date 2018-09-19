public class Menu<T, V> {

    private T drink;
    private V meal;
    private double price;

    public Menu(T drink, V meal) {
        if(drink instanceof IFood && meal instanceof IFood){
            this.drink = drink;
            this.meal = meal;
        }else{
            System.out.println("Error");
        }

    }

    public T getDrink() {
        return drink;
    }

    public V getMeal() {
        return meal;
    }

    public double getPrice() {
        return price;
    }


}
