package com.company;

public class Main {

    static double Step = 0.1;
    static double MaxIterations = 3000;
    static double Sqrt = 1;

    public static void main(String[] args) {
        System.out.printf("Estimated Answer: %10.7f%n",OwnSqrt(Sqrt));
        System.out.printf("Real Answer:      %10.7f%n",Math.sqrt(Sqrt));
    }
    public static double OwnSqrt(double f) {
        double Val = 0;
        //Step = 0.6/f;
        for (int i = 0; i < MaxIterations; i++) {
            double Error = SqrtErr(Val,f);
            System.out.printf("Iteration: %3d => Answer: %10.7f   Error: %10.7f\n",i,Val,Error);
            Val += Error*Step;
            Val = Math.abs(Val);
            if (Math.abs(Error) < 0.00000005 || Double.isNaN(Val)) {break;}
        }
        return Val;
    }
    public static double SqrtErr(double g, double f) {
        return (f-(g*g));
    }
}
