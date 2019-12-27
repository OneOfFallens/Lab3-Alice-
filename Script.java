public class Script {
    public static void main(String[] args) {
        World world = new World("Страна Чудес", 10, 10);
        Girl Alice = new Girl("Алиса");
        Woman Gerc = new Woman("Герцогиня");
        Woman Cook = new Woman("Повариха");
        Child child = new Child();
        Door door = new Door("Дверь", 2, 4, Status.closed, Location.BigKitchen, Location.outside);
        Stool stool = new Stool("Табуретка", 7, 5, Status.normal, Location.BigKitchen, 3);
        WorldObject pan = new WorldObject("Кастрюля", 4, 9, Status.big);
        WorldObject smoke = new WorldObject( "Дым", 5, 5, Status.rocker);
        Soup soup = new Soup("Суп", 4,9, Status.normal, Location.BigKitchen, pan);
        Soup smthng = new Soup("Нечто неведомое", 4,9, Status.normal, Location.BigKitchen, pan);
        world.addToWorld(Alice, 1, 6, Location.outside);
        world.addToWorld(Gerc, 7, 5, Location.BigKitchen);
        world.addToWorld(Cook, 4, 8, Location.BigKitchen);
        world.addToWorld(child, Gerc.getCord()[0], Gerc.getCord()[1], Location.BigKitchen);
        if (Alice.look(door) == false){
            System.out.println(Alice.getName() + " идёт к двери...");
            Alice.MoveTo(0, door.getCord()[1] - Alice.getCord()[1]);
        }
        Alice.look(door);
        door.checkStatus();
        Alice.open(door, Status.strongly);
        door.checkStatus();
        Alice.MoveIn(Location.BigKitchen);
        smoke.checkStatus();
        stool.toString();
        Gerc.sit(stool);
        Gerc.shake(child);
        Gerc.shake(child);
        Cook.setStatus(Status.crouched);
        Cook.checkStatus();
        Cook.stir(smthng);
        Alice.think(smthng, soup);
    }
}

