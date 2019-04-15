package com.example.bmi_calculator;

public class BMIModel {
    private double weight,height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double BMI(){
        double h = height/100;
        double res = weight/(h*h);
        return res;
    }
}
