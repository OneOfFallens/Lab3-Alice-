public class Door extends WorldObject {
    Location loc;
    Location loc2;
    public Door(String name, int x, int y, Status stat, Location loc, Location loc2){
        super(name, x, y, stat);
    }
    public void checkStatus() {
        stat = this.stat;
        loc = this.loc;
        if (stat==Status.opened){
            System.out.println(this.getName() + " открывалась на " + Location.BigKitchen.getName());
        }
        else{
            System.out.println(this.getName() + " закрыта.");
        }
    }
}
