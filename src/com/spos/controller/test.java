/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spos.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.ExcelStyleDateFormatter;

/**
 *
 * @author sainguine
 */
public class test extends Thread
{

    List list;
    String abc = "";

    test()
    {
        abc = "ABC";
    }

    private void fun()
    {
        fun2();
        System.out.println(abc);
        abc = "DEF";
    }

    public static void main(String args[])
    {

	
	String s="CASHCARDGUESTCREDIT";
	System.out.println(""+s.indexOf("GUEST"));
	
	
	
	
	Date d=new Date();
	
	SimpleDateFormat dateFormat=new SimpleDateFormat("E dd-MMM-yyyy");
	
	String date=dateFormat.format(d);
	System.out.println("date->"+date);
	
	
	
	
        String str="\"abc\"";
        str=str.replaceAll("\"", "");
        System.out.println("-->"+str);
        
       

        System.out.println("27->" + Character.toString((char) 27));
        System.out.println("27->" + Character.toString((char) 33));
        System.out.println("27->" + Character.toString((char) 48));

        int a = 1;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("a-->" + String.format("%01d", a));

        Integer n1 = 127;
        Integer n2 = 127;

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n1==n2" + (n1 == n2));

        Integer n3 = 128;
        Integer n4 = 128;

        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
        System.out.println("n3==n4" + (n3 == n4));

        System.getProperties().list(System.out);

        System.out.println("" + System.getProperty("os.name").split(" ")[0]);

    }

    private void fun2()
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        abc = "ZZZ";
    }

    @Override
    public void run()
    {
        System.out.println("In thread.......");
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("i-->" + i);
        }
        
        
    }

}
