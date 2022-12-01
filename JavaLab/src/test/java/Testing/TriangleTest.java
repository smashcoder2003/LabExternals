package Testing;

import Experiments.Triangle;
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void Test1() {
        Random random= new Random();
        int c=random.nextInt(20);
        int m=random.nextInt(20);
        Triangle t= new Triangle();
        double res=t.area(c,m);
        double ex=(c*m)/2;
        assertEquals(ex,res);
    }
    @Test
    public void Test2() {
        Random random= new Random();
        int c=random.nextInt(40);
        int m=random.nextInt(10);
        Triangle t= new Triangle();
        double res=t.area(c,m);
        double ex=(c*m)/2;
        assertEquals(ex,res);
    }
    @Test
    public void Test3() {
        Random random= new Random();
        int c=random.nextInt(50);
        int m=random.nextInt(50);
        Triangle t= new Triangle();
        double res=t.area(c,m);
        double ex=(c*m)/2;
        assertEquals(ex,res);
    }
    @Test
    public void Test4() {
        Random random= new Random();
        int c=random.nextInt(2000);
        int m=random.nextInt(1000);
        Triangle t= new Triangle();
        double res=t.area(c,m);
        double ex=(c*m)/2;
        assertEquals(ex,res);
    }
    @Test
   public void Test5() {
        Random random= new Random();
        int c=random.nextInt(240);
        int m=random.nextInt(800);
        Triangle t= new Triangle();
        double res=t.area(c,m);
        double ex=(c*m)/2;
        assertEquals(ex,res);
    }
}