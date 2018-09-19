public class Main {
    public static void main(String[] args) {
        Sandwich hamsandwich = new HamSandwich();
        System.out.println("The hamsandwich costs " + hamsandwich.getPrice() + " euros and contains " + hamsandwich.getCalories() + " calories.");
        System.out.println("*********************************");

        Sandwich panini = new Panini();
        System.out.println("The panini costs " + panini.getPrice() + " euros and contains " + panini.getCalories() + " calories.");
        System.out.println("*********************************");

        Drink coke = new Coke();
        System.out.println("The coke costs " + coke.getPrice() + " euros and contains " + coke.getCalories() + " calories.");
        System.out.println("*********************************");

        Drink applesmoothy = new AppleSmoothy();
        System.out.println("The applesmoothy costs " + applesmoothy.getPrice() + " euros and contains " + applesmoothy.getCalories() + " calories.");
        System.out.println("*********************************");

        Dessert cookie = new Cookie();
        System.out.println("The cookie costs " + cookie.getPrice() + " euros and contains " + cookie.getCalories() + " calories.");
        System.out.println("*********************************");

        Dessert cheesecake = new CheeseCake();
        System.out.println("The cheesecake costs " + cheesecake.getPrice() + " euros and contains " + cheesecake.getCalories() + " calories.");
        System.out.println("*********************************");


    }
}
