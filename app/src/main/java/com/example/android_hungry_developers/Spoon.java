package com.example.android_hungry_developers;

import java.util.concurrent.Semaphore;

public class Spoon {
    private Semaphore pickedup = new Semaphore(1);
    private int spoonIndex;



    void pickUp(){
        try {
            pickedup.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void putDown(){
        pickedup.release();

    }

    public Spoon(int spoonIndex) {
        this.spoonIndex = spoonIndex;
    }

    public int getSpoonIndex() {
        return spoonIndex;
    }
}
