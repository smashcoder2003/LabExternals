package Experiments;

public class SavingsAccount
{
        // static variable to store the annual interest rate
        static double annual_intrest_rate;
        // private instance variable
        private double sbalence;
        SavingsAccount(){}

        public SavingsAccount(double b)// costructor taking blence as a parameter
        {
            sbalence = b;// assigning savers balence to instance variable
        }

        double cal_Monthlyintrest()// method to caluculate monthly intrest
        {
            sbalence += (sbalence * annual_intrest_rate) / 12;
            return sbalence;
        }

        // static method to modify annual intrest rate
        public  void modify_annual_IR(double a)
        {
            annual_intrest_rate = a;
        }
        public static String result(){
                double r=new SavingsAccount().cal_Monthlyintrest();
                return "Current Balance:"+r;
        }
    }


