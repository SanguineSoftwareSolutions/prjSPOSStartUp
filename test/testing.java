/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

interface intf1
{

    int a = 100;

    void method();
}

interface intf2 extends intf1
{

    

    void method();
}

/**
 *
 * @author Ajim
 */
public class testing implements intf1, intf2
{

    public static void main(String[] args)
    {
	System.out.println("a=" + intf2.a);
    }

    @Override
    public void method()
    {
	
	
    }
}
