package Tugas8;

import java.util.Random;

public class Healer extends Character{

    @Override
    public boolean attack() {
        int min = 1;
        int max = 100;
        int nilai = (int) (Math.random() * (max - min) + min);

        if (nilai > 1 && nilai <= 85){
            return true;
        }
        else if (nilai > 85 && nilai <=100){
            return false;
        }
        return false;
    }

    public void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public void info() {
        super.info();
    }

    public Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }
}
