public class Child extends Character {
    Status stat;
    private final String name = "Младенец";
    public void changeStatus(Status stat){
        this.stat = stat;
    }
    protected void setStatus(Status stat){
        this.stat = stat;
    }
    protected Status getStatus(){
        Status stat = this.stat;
        return stat;
    }
    protected String getName() {
        String name = this.name;
        return name;
    }
}
