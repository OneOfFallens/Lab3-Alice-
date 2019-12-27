public class Woman extends Character {
    private String name;
    public Woman(String name){
        this.setName(name);
    }
    protected void shake(Child ch){
        if (ch.getStatus() == Status.shaked){
            System.out.println(this.name + " качает на коленях " + ch.getName());
        }
        else{
            ch.setStatus(Status.shaked);
            System.out.println(this.name + " начинает качать на коленях " + ch.getName());
        }
    }
    protected void stir(WorldObject soup){
        int x = this.getCord()[0] - soup.getCord()[0] ;
        int y = this.getCord()[1] - soup.getCord()[1];
        if (x<=1 && y<=1){
            System.out.println(this.name + buf + " помешивает " + soup.getName());
        }
        else{
            System.out.println(soup.getName() + " слишком далеко, так что " + this.name + " не может помешать ");

        }
    }
    protected void checkStatus(){
        if (this.stat == Status.crouched){
            buf = ", согнувшись, ";
        }
        else{
            buf = "";
        }
    }
    protected void setStatus(Status stat){
        this.stat = stat;
    }
    protected void sit(WorldObject obj){
        if (this.getCord()[0] == obj.getCord()[0] && this.getCord()[1] == obj.getCord()[1]){
            System.out.println(this.getName() + " сидит на " + obj.getName());
        }
        else{
            System.out.println(this.getName() + " пытается сесть на " + obj.getName() + " но она слишком далеко");
        }
    }
    protected String getName() {
        name = this.name;
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
}
