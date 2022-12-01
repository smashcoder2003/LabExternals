package Testing;

import Experiments.ElectricityBill1;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElectricityBillTest {

    @Test
    public void Test1() {
        ElectricityBill1 e1=new ElectricityBill1("513116","Bhargav",700,200,1);
        assertEquals(e1.Choice(),ElectricityBill1.Choice());
    }
    @Test
    public void Test2() {
        ElectricityBill1 e2=new ElectricityBill1("515165","Ravi",700,200,1);
        assertEquals(e2.Choice(),ElectricityBill1.Choice());
    }
    @Test
    public void Test3() {
        ElectricityBill1 e3=new ElectricityBill1("946816","saketh",700,200,1);
        assertEquals(e3.Choice(),ElectricityBill1.Choice());
    }
    @Test
    public void Test4() {
        ElectricityBill1 e4=new ElectricityBill1("78516","Eswar",700,200,1);
        assertEquals(e4.Choice(),ElectricityBill1.Choice());
    }
    @Test
    public void Test5() {
        ElectricityBill1 e5=new ElectricityBill1("85116","Sena",700,200,1);
        assertEquals(e5.Choice(),ElectricityBill1.Choice());
    }
}