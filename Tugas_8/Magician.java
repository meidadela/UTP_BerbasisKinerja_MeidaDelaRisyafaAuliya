package Tugas8;

import java.util.Random;

public class Magician extends Character{

    @Override
    public boolean attack() {
        int min = 1;
        int max = 100;
        int nilai = (int) (Math.random() * (max - min) + min);

        if (nilai > 1 && nilai <= 35){
            return true;
        }
        else if (nilai > 35 && nilai <=100){
            return false;
        }
        return false;
    }

    @Override
    public void info() {
        super.info();
    }

   public Magician(){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }
}
