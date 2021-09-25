import Price.Price;
import Safety.Safety;
import beepers.Beeper;
import engines.Engine;

public abstract class Car {

    private Beeper beeper; // приватный интерфейс с типом beeper
    private Engine engine;
    private Price price;
    private Safety safety;

    public Car(Beeper beeper, Engine engine, Safety safety, Price price) { // это конструктор
            this.beeper = beeper;
            this.engine = engine;  // this в контексте полного Car
            this.price = price;
            this.safety = safety;
    }

    public String checkBeep() {
        return beeper.makeSound();
    }

    public String checkSpeed() {
        return engine.makeRotation();
    }

    public String checkSafety() { return safety.stayAlive(); }

    public String checkPrice() { return price.getPrice(); }
}
