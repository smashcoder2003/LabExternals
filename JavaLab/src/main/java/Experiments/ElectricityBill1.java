package Experiments;

public class ElectricityBill1 {
    static String c_number, c_name;
    static double p_month_reading, c_month_reading, units;
    static int choice;

    public ElectricityBill1(String consumer_number, String consumer_name, double previous_month_reading, double current_month_reading, int type) {
        c_number = consumer_number;
        c_name = consumer_name;
        p_month_reading = previous_month_reading;
        c_month_reading = current_month_reading;
        choice = type;
    }

    ElectricityBill1() {
    }

    static void no_of_units() {
        units=c_month_reading;
    }

    public double domestic(double units)// takes one parameter in units
    {
        if (units <= 100)// checks the condition
            return units * 1;
        else if (units <= 200)
            return 100 + (units - 100) * 2.50;
        else if (units <= 500)
            return 100 + 250 + (units - 200) * 4;
        else
            return 100 + 250 + 800 + (units - 500) * 6;
    }// end of domestic method
    // Commercial type caluculation method which returns rupees in double

    public double commercial(double units) {
        if (units <= 100)
            return units * 2;
        else if (units <= 200)
            return 200 + (units - 100) * 4.50;
        else if (units <= 500)
            return 200 + 900 + (units - 200) * 6;
        else // if the all above conditions are not true then else part is executed
            return 200 + 900 + 1800 + (units - 500) * 7;
    }

    public static String Choice() {
        if (choice == 1) {
            double r=new ElectricityBill1().domestic(units);
            return c_number+"\n"+c_name+"\n"+r;

        } else if (choice == 2) {
            double r1=new ElectricityBill1().commercial(units);
            return c_number+"\n"+c_name+"\n"+r1;
                }
return "";
    }
}

