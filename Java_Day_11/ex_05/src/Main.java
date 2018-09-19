public class Main {
    public static void main(String[] args) {

        Bread bread = new SoftBread();
        Drink coke = new Coke();

        BreakFast<Bread, Drink> menu1= new BreakFast<Bread, Drink>(bread, coke) ;



    }
}
