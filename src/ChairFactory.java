public class ChairFactory implements Chair{
    @Override
    public VictorianChair createVict() {
        return new VictorianChair();
    }
    @Override
    public MultiFuncChair createMult() {
        return new MultiFuncChair();
    }
    @Override
    public MagicChair createMag() {
        return new MagicChair();
    }
}