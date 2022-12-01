package Testing;
import java.util.Random;

import Experiments.Rectangle;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {


    @Test

    public void Test1() {
        Random random= new Random();
        int c=random.nextInt(20);
        int m=random.nextInt(20);
        Rectangle r= new Rectangle();
        double res=r.area(c,m);
        double ex=c*m;
        assertEquals(ex,res);
    }
    @Test
    public void Test2(){
        Random random= new Random();
        int c=random.nextInt(40);
        int m=random.nextInt(20);
        Rectangle r= new Rectangle();
        double res=r.area(c,m);
        double ex=c*m;
        assertEquals(ex,res);
    }
    @Test
   public void Test3(){
        Random random= new Random();
        int c=random.nextInt(60);
        int m=random.nextInt(20);
        Rectangle r= new Rectangle();
        double res=r.area(c,m);
        double ex=c*m;
        assertEquals(ex,res);
    }
    @Test
    public void Test4(){
        Random random= new Random();
        int c=random.nextInt(100);
        int m=random.nextInt(20);
        Rectangle r= new Rectangle();
        double res=r.area(c,m);
        double ex=c*m;
        assertEquals(ex,res);
    }
}