public class DuckAdaptor implements Turkeylike {
    private final Ducklike duck;

    public DuckAdaptor(Ducklike duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }
}