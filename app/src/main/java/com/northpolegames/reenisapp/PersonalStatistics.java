package com.northpolegames.reenisapp;

public class PersonalStatistics {
    private double bodyMassIndex;                   //BMI CALCULATOR
    private String bmiStatus;                       //BMI CALCULATOR
    private double basalMetabolicRate;              //BMR CALCULATOR
    private double benchpressWeightToStrength;      //BENCHPRESS WEIGHT TO STRENGTH
    private String benchpressStatus;                //BENCHPRESS WEIGHT TO STRENGTH
    private double deadliftWeightToStrength;        //DEADLIFT WEIGHT TO STRENGTH
    private String deadliftStatus;                  //DEADLIFT WEIGHT TO STRENGTH

    public String bodyMassIndexCalculator(double weight, double height) {
        bodyMassIndex = weight/(height/100.0*height/100.0);
        if (bodyMassIndex < 18.4) {
            bmiStatus = "Underweight";
        } else if (bodyMassIndex > 25.5) {
            bmiStatus = "Overweight";
        } else {
            bmiStatus = "Normal weight";
        }
        return bmiStatus;
    }

    public double basalMetabolicRateCalculator(double weight, double height, int age) {
        //Weight in kg, Height in cm, Age in years
        basalMetabolicRate = (10*weight) + (6.25*height) - (5*age) + 5;
        return basalMetabolicRate;
    }

    public String weightToStrBenchpressCalculator(double weight, double benchPressMax) {
        benchpressWeightToStrength = benchPressMax / weight;
        if(benchpressWeightToStrength < 0.75) {
            benchpressStatus = "Beginner";
        } else if(benchpressWeightToStrength >= 0.75 && benchpressWeightToStrength < 1.25) {
            benchpressStatus = "Novice";
        } else if(benchpressWeightToStrength >= 1.25 && benchpressWeightToStrength < 1.75) {
            benchpressStatus = "Intermediate";
        } else if(benchpressWeightToStrength >= 1.75 && benchpressWeightToStrength < 2.00) {
            benchpressStatus = "Advanced";
        } else if(benchpressWeightToStrength >= 2.00) {
            benchpressStatus = "Elite salihirmu";
        }
        return benchpressStatus;
    }

    public String weightToStrDeadliftCalculator(double weight, double deadliftMax) {
        deadliftWeightToStrength = deadliftMax / weight;
        if(deadliftWeightToStrength < 1.25) {
            deadliftStatus = "Beginner";
        } else if(deadliftWeightToStrength >= 1.25 && deadliftWeightToStrength < 2.00) {
            deadliftStatus = "Novice";
        } else if(deadliftWeightToStrength >= 2.00 && deadliftWeightToStrength < 2.50) {
            deadliftStatus = "Intermediate";
        } else if(deadliftWeightToStrength >= 2.50 && deadliftWeightToStrength < 3.00) {
            deadliftStatus = "Advanced";
        } else if(deadliftWeightToStrength >= 3.00) {
            deadliftStatus = "Elite salihirmu";
        }
        return deadliftStatus;
    }
}
