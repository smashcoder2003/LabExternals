package Experiments;

public class Rectangle extends Shape{
    public double area(int a, int b) {
        return a * b;
    }
    String result(){
        double r= new Rectangle().area(a,b);
        return ""+r;
    }
}