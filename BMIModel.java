package com.example.hongchiguo.bmi;

import java.io.PrintStream;
import java.util.Scanner;

public class BMIModel {
    private double weight;
    private double height;

    public BMIModel(String w, String h)
    {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }
    public String getBMI()
    {
        double index = this.weight / (this.height * this.height);
        String result = String.format("Your weight is:%s,Your height is :%s, Your BMI is :%.1f",toPound(),toFeetInch(),index);
        return result;
    }

    public String toPound(){
        double newWeight = weight/0.454;
        long result = Math.round(newWeight);
        return String.format("%d",result);
    }


    public static void main(String[] args)
    {
        BMIModel a = new BMIModel("100", "1.8");
        String toPound = a.toPound();
        System.out.println(toPound);
    }

    public String toFeetInch(){
        double y = height*3.28084;
        int f = (int)Math.floor(y);
        long i = Math.round((y-f)*12);
        return String.format("%d\'%d\"",f,i);
    }



}
