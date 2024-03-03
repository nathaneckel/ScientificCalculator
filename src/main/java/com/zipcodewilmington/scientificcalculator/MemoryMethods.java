package com.zipcodewilmington.scientificcalculator;

public class MemoryMethods {
    double mPlus;

    double tempMemory ;
    public double recallMemoryInput(double userInput) {
        this.tempMemory = userInput;
        return 0;
    }

    public double clearMemoryInput(double tempMemory) {
        this.tempMemory = 0;
        return 0;
    }

}
