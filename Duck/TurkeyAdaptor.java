public class TurkeyAdaptor implements Ducklike{
    private final Turkeylike turkey;

    public TurkeyAdaptor(Turkeylike turkey){
        this.turkey = turkey;
    }
    public void quack(){
        turkey.gobble();
    }
}