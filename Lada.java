import Price.Price;
import Safety.Safety;
import beepers.Beeper;
import engines.Engine;

public class Lada extends Car {
    public Lada(Beeper beeper, Engine engine, Safety safety, Price price) {
        super(beeper, engine, safety, price);
    }

    public void partyMaker() {
        System.out.println("low Priora is the best Priora");
    }

}