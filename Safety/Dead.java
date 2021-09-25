package Safety;

public class Dead implements Safety {

    @Override
    public String stayAlive() {
        return "wasted";
    }
}
