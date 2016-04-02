package com.brainacad.oop.testgenerics3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intOne = {1,2,3,4,5,6,7,8,9};
        String[] strOne = {"One","Two","Three","Four","Five"};

        MyMixer mixerOne = new MyMixer(intOne);
        System.out.println(Arrays.toString(mixerOne.shuffle(intOne)));

        MyMixer mixerTwo = new MyMixer(strOne);
        System.out.println(Arrays.toString(mixerTwo.shuffle(strOne)));

    }
}
