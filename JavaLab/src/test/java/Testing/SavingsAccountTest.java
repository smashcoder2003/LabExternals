package Testing;

import Experiments.SavingsAccount;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {
    @Test
    public void Test1() {
        SavingsAccount s1 = new SavingsAccount(2000);
        s1.modify_annual_IR(4);
        assertEquals(s1.result(),SavingsAccount.result());
    }
    @Test
    public void Test2() {
        SavingsAccount s2 = new SavingsAccount(3000);
        s2.modify_annual_IR(5);
        assertEquals(s2.result(),SavingsAccount.result());
    }
    @org.junit.Test
    public void Test3() {
        SavingsAccount s3 = new SavingsAccount(6000);
        s3.modify_annual_IR(5.5);
        assertEquals(s3.result(),SavingsAccount.result());
    }
    @Test
    public void Test4() {
        SavingsAccount s4 = new SavingsAccount(5500);
        s4.modify_annual_IR(3.4);
        assertEquals(s4.result(),SavingsAccount.result());
    }
    @Test
    public void Test5() {
        SavingsAccount s5 = new SavingsAccount(4700);
        s5.modify_annual_IR(6);
        assertEquals(s5.result(),SavingsAccount.result());
    }
}