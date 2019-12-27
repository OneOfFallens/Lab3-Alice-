public class Stool extends WorldObject implements StandartMethods {
    private int leg;
    public Stool(String name, int x, int y, Status stat, Location loc, int leg){
        super(name, x, y, stat);
        this.leg = leg;
    }


    public String toString(){
        int leg = this.leg;
        if (leg == 3) {
            this.setName(" Трехногая " + this.getName());
        }
        else if (leg == 4){
            this.setName(" Четырехногая " + this.getName());
        }
        else {
            this.setName(this.getName() + " c нереалистичным количеством ног") ;
        }
        return this.getName();
    }
}
