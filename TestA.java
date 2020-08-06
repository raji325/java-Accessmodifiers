package com.capgemini.accessmodifiers.pkg1;

public class TestA {
public static void main(String[] args) {
	Demo d1=new Demo();
/*System.out.println(d1.a);
*d1.add();
 */
	System.out.println(d1.b);
	d1.subtract();
	System.out.println(d1.c);
	d1.multiply();
	System.out.println(d1.s);
	d1.division();
}
}