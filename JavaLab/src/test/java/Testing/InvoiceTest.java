package Testing;

import Experiments.Invoice1;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {

    @Test
    public void Test1() {
        Invoice1 i1 = new Invoice1("2543-I", "120w Photovoltaic module", 14, 900);
        assertEquals(Invoice1.result(),i1.result());
    }
    @Test
    public void Test2(){
        Invoice1 i1 = new Invoice1("56awa", "Filaments", 14, 900);
        assertEquals(Invoice1.result(),i1.result());}

    @Test
    public void Test3() {
        Invoice1 i3 = new Invoice1("1452-the9", "Hardware", 21, 1200);
        assertEquals(Invoice1.result(),i3.result());
    }
    @Test
    public void Test4() {
        Invoice1 i4 = new Invoice1("2543-I", "Lights", 16, 499);
        assertEquals(Invoice1.result(),i4.result());
    }
    @Test
    public void Test5() {
        Invoice1 i5 = new Invoice1("2543-I", "Conecting Wires", 4, 190);
        assertEquals(Invoice1.result(),i5.result());
    }
}