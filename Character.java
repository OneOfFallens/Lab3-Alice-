public abstract class Character extends Object{
    private String name;
    private int x;
    private int y;
    static String buf;
    public Location loc;
    Status stat;
    World world;
    protected void open(WorldObject obj){

    }
    protected  void sit(WorldObject obj){

    };
    protected void shake(Character ch){

    }
    protected void stir(WorldObject obj){

    }
    protected void think(WorldObject obj1, WorldObject obj2){

    }
    private void setName(String name){
        this.name = name;
    }
    protected String getName() {
        name = this.name;
        return name;
    }
    protected Status getStatus(){
        Status stat = this.stat;
        return stat;
    }
    public int[] getCord(){
        int x = this.x;
        int y = this.y;
        int[] cord = new int[2];
        cord[0] = x;
        cord[1] = y;
        return cord;
    }
    public void setCord(int x, int y){
        this.x = x;
        this.y = y;
    }
}
