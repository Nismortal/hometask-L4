import Road.Road;

public abstract class Bus {

    private Road road;

    public Bus(Road road) {
        this.road = road;
    }

    public String checkRoad() {
        return road.getRoad();
    }
}
