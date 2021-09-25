import Price.Price;
import Safety.Safety;
import beepers.Beeper;
import engines.Engine;

public class Viper extends Car {
    public Viper(Beeper beeper, Engine engine, Safety safety, Price price) {
        super(beeper, engine, safety, price);
    }

    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Vehicle landed");
    }
}
