package Testing;

import Experiments.Book1;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Book1Test {
   static  void display(){}


    @Test
    public void Test1() {
        Book1 b1= new Book1("Success","35653","David","TenWorks");
        assertEquals(b1.getBookInfo(),Book1.getBookInfo());
    }
    @Test
    public void Test2() {
        Book1 b2= new Book1("Failure","75632","Morgan","SixPlaces");
        assertEquals(b2.getBookInfo(),Book1.getBookInfo());
    }
    @Test
    public void Test3() {
        Book1 b3= new Book1("Programs","35653","David","Stronts");
        assertEquals(b3.getBookInfo(),Book1.getBookInfo());
    }
    @Test
    public void Test4() {
        Book1 b4= new Book1("Drama","96521","Bruno","Hillsup");
        assertEquals(b4.getBookInfo(),Book1.getBookInfo());
    }
    @Test
    public void Test5() {
        Book1 b5= new Book1("Secrets","75854","Strentus","Divine");
        assertEquals(b5.getBookInfo(),Book1.getBookInfo());
    }
}