public enum Location {
    BigKitchen("Большая кухня"), outside("снаружи");


    public String name;

    Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
