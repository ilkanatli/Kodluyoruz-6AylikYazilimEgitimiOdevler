public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("---------- Magazaya Hosgeldiniz ! ----------");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zirhlar");
            System.out.println("3 - Cikis Yap");
            System.out.print("Seciminiz : ");

            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3){
                System.out.println("Gecersiz bir deger, tekrar giriniz : ");
                System.out.print("Seciminiz : ");
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }



    public void printWeapon(){
        System.out.println("---------- Silahlar ----------");
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId()+ "-" +
                    w.getName() + "< Para : " +
                    w.getPrice() + " , Hasar : " +
                    w.getDamage() + ">");
        }
        System.out.println("0 - Cikis Yap");
    }

    public void buyWeapon(){
        System.out.print("Bir silah seciniz : ");

        int selectWeaponID = input.nextInt();

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.println("Gecersiz bir deger, tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }

        if(selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if(selectedWeapon != null){
                if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    // Satın almanın gerçekleştiği alan
                    System.out.println(selectedWeapon.getName() + " silahi satin aldiniz !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                    // System.out.println("Onceki Silahiniz : " + this.getPlayer().getInventroy().getWeapon().getName());
                    this.getPlayer().getInventroy().setWeapon(selectedWeapon);
                    // System.out.println("Yeni Silahiniz : " + this.getPlayer().getInventroy().getWeapon().getName());
                }
            }
        }

    }

    public void printArmor(){
        System.out.println("---------- Zirhlar ----------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() +
                    "<Para : " + a.getPrice() +
                    ", Zirh : " + a.getBlock() + ">");
        }
        System.out.println("0 - Cikis Yap");
    }
    public void buyArmor() {
        System.out.print("Bir zirh seciniz : ");

        int selectArmorID = input.nextInt();

        while (selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.println("Gecersiz bir deger, tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }

        if(selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if(selectedArmor != null){
                if(selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    // Satın almanın gerçekleştiği alan
                    System.out.println(selectedArmor.getName() +  " zirhini satin aldiniz !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventroy().setArmor(selectedArmor);
                }
            }
        }

    }
}
