
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sainguine
 */
public class test
{

    public static void main(String args[])
    {
        double t = 1.0000;
        System.out.println(t);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(t));

        test tt = new test();
        //System.out.println(tt.funReduceTo2DecimalPlaces("1.0000"));

        double pax = 1;

        double noOfBills = 3;

        for (int i = 0; i < noOfBills; i++)
        {
            int noOfBillsToBeFloor=(int)(pax%noOfBills);
            
            if (i <noOfBillsToBeFloor)
            {
                double paxPerBill = Math.ceil(pax / noOfBills);
                System.out.println("PAX=" + pax + "\tNo of bills=" + noOfBills + " \tpax Per Bill=" + paxPerBill);
            }
            else
            {
                double paxPerBill = Math.floor(pax / noOfBills);
                System.out.println("PAX=" + pax + "\tNo of bills=" + noOfBills + " \tpax Per Bill=" + paxPerBill);
            }
        }

    }

    private String funReduceTo2DecimalPlaces(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        int dotIndex = sb.indexOf(".");
        int endIndex = dotIndex + 3;
        return sb.substring(0, endIndex).toString();
    }
}
