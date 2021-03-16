package com.company;

public class Integers implements Queue {
    //region Properties
    private int[] array = new int[0];
    //endregion

    //region Constructors
    public Integers() {
    }

    public Integers(int[] array) {
        this.array = array;
    }
    //endregion

    //region Public Methods
    @Override
    public int[] add(int a) {
        int[] myArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        myArray[myArray.length - 1] = a;
        array = myArray;
        return array;
    }

    @Override
    public int[] poll() {
        int[] myArray = new int[array.length - 1];
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            myArray[i] = array[j];
        }
        array = myArray;
        return array;
    }

    @Override
    public int peek() {
        return array[0];
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    //endregion

    //region Getters and Setters
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
//endregion
}