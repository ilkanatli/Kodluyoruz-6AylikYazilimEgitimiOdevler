import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Su an burdasiniz : " + this.getName());
        System.out.println("Dikkatli Ol ! Burada " + obsNumber + " tane "  + this.getObstacle().getName() + " yasiyor !" );
        System.out.println("<S>avas veya <K>ac");
        String selectCase = input.nextLine().toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber)){
            // System.out.println("Savas islemleri olacak");
            // Savasma islemi
                System.out.println(this.getName() + " tum dusmanlari yendiniz !");
                return true;
        }
        if(this.getPlayer().getHealth() <= 0){
            System.out.println("Oldunuz !");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber){
        for(int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.print("<V>ur veya <K>ac : ");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz ! ");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamage = (this.getObstacle().getDamage() - this.getPlayer().getInventroy().getArmor().getBlock());
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Dusmani yendiniz !");
                System.out.println(this.getObstacle().getAward() + " para kazandiniz !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Guncel Paraniz : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Caniniz : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Cani : "  + this.getObstacle().getHealth());
        System.out.println("---------------");
    }
    public void playerStats(){
        System.out.println("Oyuncu Degerleri");
        System.out.println("---------------------------------------");
        System.out.println("Saglik : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventroy().getWeapon().getName());
        System.out.println("Zirh : " + this.getPlayer().getInventroy().getArmor().getName());
        System.out.println("Hasar : " + this.getPlayer().getDamage());
        System.out.println("Bloklama : " + this.getPlayer().getInventroy().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName() + " Degerleri : ");
        System.out.println("---------------------------------------");
        System.out.println("Saglik : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Odul : " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
