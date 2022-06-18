package Tugas8;

public abstract class Character {
    private int defense, attack, HP;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if (damage > getDefense()){
            setHP(HP - (damage - getDefense()));
        }
        if (HP <= 0){
            setHP(0);
        }
    }

    public void info(){
        Class role = getClass();
        System.out.println("Role    : " + role.getSimpleName());
        System.out.println("HP      : " + getHP());
        System.out.println("Attack  : " + getAttack());
        System.out.println("Defense : " + getDefense());
    }
}
