public class Warrior extends CommonBaseClass {

    int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {

        super(name, strength, health, stamina, speed, attackPower);

        this.shieldStrength = shieldStrength;
    }


    public void decreaseShieldStrength(){

    }

    public int getShieldStrength() {
        return shieldStrength;
    }


}
