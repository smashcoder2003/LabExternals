package Experiments;

import java.util.Scanner;

public class Employeee {
        static String Emp_name, Emp_id, address, mail_id;
        static int m_num;
        static double basicpay, gs, ns, g, n;

       /* Employeee(String name,String id,String add,String mail,int mobile_number)
        {
         Emp_name =name;
         Emp_id=id;
         address=add;
         mail_id=mail;
         m_num=mobile_number;
        }*/

    public Employeee() {

    }

    public double gross(double basicpay) {
            double DA = 0.97 * basicpay;
            double HRA = 0.1 * basicpay;
            gs = basicpay + DA + HRA;
            return gs;
        }

        public double net() {
            double pf = 0.12 * basicpay;
            double s_c_fund = 0.001 * basicpay;
            ns = gs - pf - s_c_fund;
            return ns;
        }

    public static class Programmer extends Employeee {
        double basicpay;

        public Programmer() {
            super();

        }

    }

    public static class AssistantProfessor extends Employeee {
        double basicpay;

        public AssistantProfessor() {
            super();

        }
    }

    public static class AssociateProfessor extends Employeee {
        double basicpay;

        public AssociateProfessor() {
            super();

        }
    }

    public static class Professor extends Employeee {
        double basicpay;

        public Professor() {
            super();

        }
    }
    public static String  result(){
        double g1= new Employeee().gross(basicpay);
        double n1= new Employeee().net();
        String r1= "" + g1+n1;
        return r1;
    }
}



