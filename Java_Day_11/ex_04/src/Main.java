public class Main {
    public static void main(String[] args) {

        IFood cocaCola = new Coke();
        IFood panini = new Panini();

        //Menu<IFood, IFood> menu = new Menu<>(cocaCola, panini);
        //System.out.println(menu.getDrink());

        Menu<Integer, Integer> menu = new Menu<>(new Integer(42), new Integer(24));
    }
}
