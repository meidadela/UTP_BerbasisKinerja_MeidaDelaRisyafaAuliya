package Tugas8;

import java.util.Random;

public class Titan extends Character{

    @Override
    public boolean attack() {
        int min = 1;
        int max = 100;
        int nilai = (int) (Math.random() * (max - min) + min);

        if (nilai > 1 && nilai <= 40){
            return true;
        }
        else if (nilai > 40 && nilai <=100){
            return false;
        }
        return false;
    }

    @Override
    public void info() {
        super.info();
    }

    public Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }
}
