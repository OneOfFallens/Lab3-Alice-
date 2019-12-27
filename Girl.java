public class Girl extends Character  implements MoveActions {
    private String name;
    public Girl(String name) {
        this.name = name;

    }
    public void MoveTo(int x, int y){
        this.setCord(this.getCord()[0] + x, this.getCord()[1] + y);

    }
    public void MoveIn(Location loc){
        this.loc = loc;
        System.out.println(this.getName() + " вошла в " + loc.name);
    }
    protected void open(WorldObject obj, Status stat){
        if (obj.stat == Status.closed) {
            System.out.print(this.name + " открыла " + obj.getName());
            obj.stat = Status.opened;
            if (stat == Status.strongly){
                System.out.println(" решительно.");
            }
            else{
                System.out.println(".");
            }
        }
        else if (obj.stat == Status.opened){
            System.out.print(this.name + " попыталась открыть " + obj.getName() + " но было уже открыто");
        }
        else{
            System.out.println(obj.getName() + " нельзя открыть");
        }
    }

    protected void think(WorldObject obj1, WorldObject obj2){
        System.out.println(this.name + " думает, является ли " + obj1.getName() + " тем же, что и " + obj2.getName());
        if (obj1.equals(obj2) == true) {
            System.out.println(this.name + " уверена что " + obj1.getName() + " это " + obj2.getName());
        }
        else{
            System.out.println(this.name + " считает что " + obj1.getName() + " это не " + obj2.getName());
        }
    }
    protected boolean look(WorldObject obj){
        int x = this.getCord()[0] - obj.getCord()[0] ;
        int y = this.getCord()[1] - obj.getCord()[1];
        if (x<=1 && y<=1){
            System.out.println(this.name + " видит перед собой " + obj.getName());
            return true;
        }
        else{
            System.out.println(this.name + " не видит " + obj.getName());
            return false;
        }
    }
    protected String getName() {
        name = this.name;
        return name;
    }
}