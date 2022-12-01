package Testing;

import Experiments.Employeee;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeeTest {

    @Test
    public void  Test1() {
        Employeee.Programmer p1= new Employeee.Programmer();
        p1.gross(90000);
        p1.net();
        Employeee.AssistantProfessor ap1=new Employeee.AssistantProfessor();
        ap1.gross(80000);
        ap1.net();
        Employeee.AssociateProfessor apr1= new Employeee.AssociateProfessor();
        apr1.gross(70000);
        apr1.net();
        Employeee.Professor pr1= new Employeee.Professor();
        pr1.gross(60000);
        pr1.net();
        assertEquals(Employeee.Programmer.result(),Employeee.Programmer.result());
        assertEquals(Employeee.AssistantProfessor.result(),Employeee.AssistantProfessor.result());
        assertEquals(Employeee.AssociateProfessor.result(),Employeee.AssociateProfessor.result());
        assertEquals(Employeee.Professor.result(),Employeee.Professor.result());
    }
@Test
    public void  Test2() {
        Employeee.Programmer p2= new Employeee.Programmer();
        p2.gross(0);
        p2.net();
        Employeee.AssistantProfessor ap2=new Employeee.AssistantProfessor();
        ap2.gross(-12000);
        ap2.net();
        Employeee.AssociateProfessor apr2= new Employeee.AssociateProfessor();
        apr2.gross(-9400);
        apr2.net();
        Employeee.Professor pr2= new Employeee.Professor();
        pr2.gross(-6000);
        pr2.net();
        assertEquals(Employeee.Programmer.result(),Employeee.Programmer.result());
        assertEquals(Employeee.AssistantProfessor.result(),Employeee.AssistantProfessor.result());
        assertEquals(Employeee.AssociateProfessor.result(),Employeee.AssociateProfessor.result());
        assertEquals(Employeee.Professor.result(),Employeee.Professor.result());
    }
@Test
public void  Test3() {
        Employeee.Programmer p3= new Employeee.Programmer();
        p3.gross(100000);
        p3.net();
        Employeee.AssistantProfessor ap3=new Employeee.AssistantProfessor();
        ap3.gross(90000);
        ap3.net();
        Employeee.AssociateProfessor apr3= new Employeee.AssociateProfessor();
        apr3.gross(60000);
        apr3.net();
        Employeee.Professor pr3= new Employeee.Professor();
        pr3.gross(40000);
        pr3.net();
        assertEquals(Employeee.Programmer.result(),Employeee.Programmer.result());
        assertEquals(Employeee.AssistantProfessor.result(),Employeee.AssistantProfessor.result());
        assertEquals(Employeee.AssociateProfessor.result(),Employeee.AssociateProfessor.result());
        assertEquals(Employeee.Professor.result(),Employeee.Professor.result());
        }
        }