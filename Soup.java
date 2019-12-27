public class Soup extends WorldObject {
    WorldObject container;
    public Soup(String name, int x, int y, Status stat, Location loc, WorldObject container){
        super(name, x, y, stat);
        this.container = container;
    }

}
