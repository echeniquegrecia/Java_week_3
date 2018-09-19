public class FrenchBaguette extends Bread{


    public FrenchBaguette() {
        super(0.80, 700);
    }

    @Override
    public int getBakingTime() {
        return 20;
    }
}
