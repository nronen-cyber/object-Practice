public class Player {
    private int health;
    private String name;

    public Player(int health, String name){
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String getName(){
        return name;
    }
    public void setNama(String name){
        this.name = name;
    }
}
