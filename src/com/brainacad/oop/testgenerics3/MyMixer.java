package com.brainacad.oop.testgenerics3;


import java.util.Random;

public class MyMixer<T> {
    private T[] t;

    public MyMixer(T[] t) {
        this.t = t;
    }

    public <T> T[] shuffle(T[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            Random rnd = new Random();
            int j = rnd.nextInt(i);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
