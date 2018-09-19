public class SoftBread extends Bread{


    public SoftBread() {
        super(1.20, 500);
    }

    @Override
    public int getBakingTime() {
        return 30;
    }
}
