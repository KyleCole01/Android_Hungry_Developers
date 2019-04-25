package com.example.android_hungry_developers;

import android.util.Log;

public class Developer implements Runnable {
     int index;
    Spoon leftSpoon;
    Spoon rightSpoon;

public void think(){
    if(leftSpoon.getSpoonIndex()<rightSpoon.getSpoonIndex()){
        leftSpoonFirst();
    }else{
        rightSpoonFirst();
    }

    Log.i("Running","developer "+index + " thinking");

    }
    public void leftSpoonFirst(){
    leftSpoon.pickUp();
    rightSpoon.pickUp();
    eat();
    rightSpoon.putDown();
    leftSpoon.putDown();
    }
    public void rightSpoonFirst(){
    rightSpoon.pickUp();
    leftSpoon.pickUp();
    eat();
    leftSpoon.putDown();
    rightSpoon.putDown();
    }

public void eat(){
    try {
        Thread.sleep(250);
        Log.i("Running","developer " + index +  " eating");
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    @Override
    public void run() {
        while(true){
            think();
            eat();

        }
    }

    public Developer(Spoon leftSpoon, Spoon rightSpoon,int index) {
        this.leftSpoon = leftSpoon;
        this.rightSpoon = rightSpoon;
        this.index = index;
    }
}
