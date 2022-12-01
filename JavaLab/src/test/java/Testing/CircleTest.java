package Testing;
import java.util.*;

import Experiments.Circle;
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void Test1() {
        Random random= new Random();
        int c=random.nextInt(20);
        Circle ci= new Circle();
        double res=ci.area(c,0);
        double ex=(Math.PI*(double)c*(double)c);
        assertEquals(ex,res);
    }
    @Test
    public void Test2() {
        Random random= new Random();
        int c=random.nextInt(2000);
        Circle ci= new Circle();
        double res=ci.area(c,0);
        double ex=(Math.PI*(double)c*(double)c);
        assertEquals(ex,res);
    }
    @Test
    public void Test3() {
        Random random= new Random();
        int c=random.nextInt(600);
        Circle ci= new Circle();
        double res=ci.area(c,0);
        double ex=(Math.PI*(double)c*(double)c);

        assertEquals(ex,res);
    }
    @Test
    public void Test4() {
        Random random= new Random();
        Circle ci= new Circle();
        double res=ci.area(0,0);
        double ex=0;
        assertEquals(ex,res);
    }
    @Test
    public void Test5() {
        Random random= new Random();
        int c=-2;
        Circle ci= new Circle();
        double res=ci.area(c,0);
        double ex=(Math.PI*(double)c*(double)c);
        assertEquals(ex,res);
    }

}