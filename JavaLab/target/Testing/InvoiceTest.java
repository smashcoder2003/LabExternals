package Testing;

import Experiments.Invoice1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {

    @Test
    public void Invoice_Test1() {
        Invoice1 i1 = new Invoice1("2543-I", "120w Photovoltaic module", 14, 900);
        Assertions.assertEquals(Invoice1.result(),i1.result());
    }
    @Test
    public void Invoice_Test2() {
        Invoice1 i2 = new Invoice1("56eYgJ", "Switch", 6, 348);
        Assertions.assertEquals(Invoice1.result(),i2.result());
    }
    @Test
    public void Invoice_Test3() {
        Invoice1 i3 = new Invoice1("1452-the9", "Hardware", 21, 1200);
        Assertions.assertEquals(Invoice1.result(),i3.result());
    }
    @Test
    public void Invoice_Test4() {
        Invoice1 i4 = new Invoice1("2543-I", "Lights", 16, 499);
        Assertions.assertEquals(Invoice1.result(),i4.result());
    }
    @Test
    public void Invoice_Test5() {
        Invoice1 i5 = new Invoice1("2543-I", "Conecting Wires", 4, 190);
        Assertions.assertEquals(Invoice1.result(),i5.result());
    }
}