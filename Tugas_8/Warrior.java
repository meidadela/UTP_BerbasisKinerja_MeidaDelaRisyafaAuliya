package Tugas8;

import java.util.Random;

public class Warrior extends Character{

    @Override
    public boolean attack() {
        int min = 1;
        int max = 100;
        int nilai = (int) (Math.random() * (max - min) + min);

        if (nilai > 1 && nilai <= 60){
            return true;
        }
        else if (nilai > 60 && nilai <=100){
            return false;
        }
        return false;
    }

    @Override
    public void info() {
        super.info();
    }

    public Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }
}
