package Testing;
import Experiments.ElectricityBill1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class ElectricityBill1Test {

    @Test
    public void Ebill_Test_1()
    {
        ElectricityBill1 e1 = new ElectricityBill1("64464", "Bhargav", 900, 633, 1);
        Assertions.assertEquals( ElectricityBill1.Choice(), e1.Choice());
    }
    @Test
    public void Ebill_Test_2()
    {
        ElectricityBill1 e2 = new ElectricityBill1("95455", "Saketh", 200, 700, 1);
        Assertions.assertEquals( ElectricityBill1.Choice(), e2.Choice());
    }
    @Test
    public void Ebill_Test_3()
    {
        ElectricityBill1 e3 = new ElectricityBill1("64464", "Ravi", 600, 100, 2);
        Assertions.assertEquals(ElectricityBill1.Choice(), e3.Choice());
    }
    @Test
    public void Ebill_Test_4()
    {
        ElectricityBill1 e4=new ElectricityBill1("645564","Eswar",180,843,20);
        Assertions.assertEquals( ElectricityBill1.Choice(),e4.Choice());
    }
    @Test
    public void Ebill_Test_5()
    {
        ElectricityBill1 e5 =new ElectricityBill1("64464","Sena",180,843,20);
        Assertions.assertEquals(ElectricityBill1.Choice(),e5.Choice());
    }
}
