package com.capgemini.accessmodifiers.pkg2;

import com.capgemini.accessmodifiers.pkg1.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {

	Demo d = new Demo();
/*	System.out.println(d.a);
*	d.add();
*	System.out.println(d.b);
*	d.subtract();
*/
		Sample s = new Sample();
		System.out.println(s.c);
		s.multiply();

		System.out.println(d.s);
		d.division();

	}
}
