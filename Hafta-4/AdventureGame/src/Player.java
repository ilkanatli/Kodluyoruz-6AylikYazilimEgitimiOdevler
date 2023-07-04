import java.util.Scanner;

public class Player {

    private int damage;
    private  int health;
    private int orjinalHealth;
    private int money;
    private String charName;
    private String name;

    private Scanner input = new Scanner(System.in);
    private Inventroy inventroy;

    public Player(String name) {
        this.name = name;
        this.inventroy = new Inventroy();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("-----------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() +
                    "\t Karakter: " + gameChar.getName() +
                    "\t Hasar: " + gameChar.getDamage() +
                    "\t Saglik: " + gameChar.getHealth() +
                    "\t Para: " + gameChar.getMoney());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Lutfen bir karakter seciniz : ");

        int selectChar = input.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        /* System.out.println( "Karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Saglik : " + this.getHealth() +
                ", Para : " + this.getMoney());
         */
    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println(
                        "Silah : " + this.getInventroy().getWeapon().getName() +
                        ", Zirh : " + this.getInventroy().getArmor().getName() +
                        ", Bloklama : " + this.getInventroy().getArmor().getBlock() +
                        ", Hasar : " + this.getTotalDamage() +
                        ", Saglik : " + this.getHealth() +
                        ", Para : " + this.getMoney());
    }
    public int getTotalDamage(){
        return (this.damage + this.getInventroy().getWeapon().getDamage());
    }
    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventroy getInventroy() {
        return inventroy;
    }

    public void setInventroy(Inventroy inventroy) {
        this.inventroy = inventroy;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
