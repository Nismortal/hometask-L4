import Price.Cheap;
import Price.Price;
import Price.Expensive;
import Road.Road;
import Road.Center;
import Road.Downtown;
import Safety.Safety;
import Safety.Alive;
import Safety.Dead;
import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engines.Engine12V;
import engines.FSDEngine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Beeper horn = new Horn();
        Beeper music = new FancyMusic();
        Beeper magic = new MagicSparks();

        Price cheap = new Cheap();
        Price expensive = new Expensive();

        Safety alive = new Alive();
        Safety dead = new Dead();

        Engine12V engine12V = new Engine12V();

        Road roadCenter = new Center();
        Road roadDowntown = new Downtown();

        Lambo lambo = new Lambo(music, engine12V, alive, expensive);
        Viper viper = new Viper(magic, new FSDEngine(), dead, cheap);
        Volvo volvo = new Volvo(horn, engine12V, alive, expensive);
        Lada lada = new Lada(music, new FSDEngine(), dead, cheap);

        Liaz liaz = new Liaz(roadCenter);
        liaz.Zxc();
        System.out.println(liaz.checkRoad());

        System.out.println("___________");

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(viper);
        carList.add(lambo);
        carList.add(volvo);
        carList.add(lada);

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).checkSafety());
            System.out.println(carList.get(i).checkPrice());
            System.out.println(carList.get(i).checkBeep());
            System.out.println(carList.get(i).checkSpeed());
            System.out.println("___________");
        }

    }
}
