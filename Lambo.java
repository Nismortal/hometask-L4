import Price.Price;
import Safety.Safety;
import beepers.Beeper;
import engines.Engine;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Safety safety, Price price) {
        super(beeper, engine, safety, price); // будут отправлены в super класс (класс родитель) - Car
    }

}
