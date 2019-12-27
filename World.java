public class World {
    String name;
    int sizex;
    int sizey;
    public World(String name, int sizex, int sizey) {
        this.name = name;
        this.sizex = sizex;
        this.sizey = sizey;
    }
    public void addToWorld(Character ch, int x, int y, Location loc) {
        System.out.println(ch.getName() + " появляется в мире " + this.name);
        ch.setCord(x,y);
        ch.loc = loc;
    }



    public void checkLocation(Character ch){
        Location loc = ch.loc;
        System.out.println(ch.getName() + " находится " + ch.loc);
    }

}
