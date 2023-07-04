public class Inventroy {
    private Weapon weapon;
    private Armor armor;

    public Inventroy() {
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor = new Armor(0,"Kazak",0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
