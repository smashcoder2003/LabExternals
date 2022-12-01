package Experiments;

public class Invoice1 {//Creating a class Invoice
        // Creating the instance variables
         public static String part_number;
         public static String part_description;// variables of type String
         public static int quantity;// variable of type int
         public static  double price;// variable of type double

        public Invoice1(String pno, String pdes, int q, double p)// constructor that takes four parameters
        {
            // Initialising instance variables
            part_number = pno;
            part_description = pdes;
            quantity = q;
            price = p;
        }
       public  Invoice1(){}

        void setPartNumber(String pno) {
            part_number = pno;// sets the passed String to the instance variable
        }

        void setPartDescription(String pdes) {
            part_description = pdes;// sets the passed string to instance variable
        }

        void setQuantity(int q) {
            quantity = q;// sets the passed quantity to instance variable
        }

        void setPrice(double p) {
            price = p;// sets the passed value to instance variable
        }

        String getPartNumber() {
            return part_number; // returns the String stored in instance variable
        }

        String getPartDescription() {
            return part_description;// returns the String stored in instance variable
        }

        int getQuantity() {
            return quantity;// returns the value stored in instance variable
        }

        double getPrice() {
            return price;// returns the value stored in instance variable
        }

        // method to caluculate amount
        double getInvoiceAmount() {
            if (quantity < 0)// checks weather the quantitiy is positive or not
                quantity = 0;
            if (price < 0)// checks weather the price is positive or not
                price = 0;
            return quantity * price;// returns the caluculated amount
        }
        public static String result(){
            double r= new Invoice1().getInvoiceAmount();
            return part_number+"\n"+part_description+"\n"+quantity+"\n"+price+"\n"+r;

    }
    }


