import Price.Price;
import Safety.Safety;
import beepers.Beeper;
import engines.Engine;

public class Volvo extends Car {
    public Volvo(Beeper beeper, Engine engine, Safety safety, Price price) {
        super(beeper, engine, safety, price);
    }

    public void aliveWarrior() {
        System.out.println("Hurry up, soldier!");
    }
}
