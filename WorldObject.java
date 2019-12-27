public class WorldObject extends Object implements StandartMethods {
    private int x;
    private int y;
    private String name;
    Status stat;
    public WorldObject(String name, int x, int y, Status stat){
        this.name = name;
        this.x = x;
        this.y = y;
        this.stat = stat;
    }
    private void setStatus(Status stat){
        this.stat = stat;
    }
    public Status getStatus(){
        Status stat = this.stat;
        return stat;
    }
    protected boolean equals(WorldObject obj){
        if (obj.getClass() == this.getClass()) {
            return true;
        }
        else {
            return false;
        }
    }
    protected int [] getCord(){
        int x = this.x;
        int y = this.y;
        int [] cord = new int [2];
        cord[0] = x;
        cord[1] = y;
        return cord;
    }
    protected String getName(){
        name = this.name;
        return name;
    }
    protected void checkStatus(){
        if (this.stat == Status.rocker) {
            System.out.println("Стоял " + this.getName() + " коромыслом...");
        }
        if (this.stat == Status.no) {
            System.out.println(this.getName() + " не видно. ");
        }
    }
    protected void setName(String name){
        this.name = name;
    }
}
