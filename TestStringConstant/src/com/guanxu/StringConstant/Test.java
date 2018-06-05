package com.guanxu.StringConstant;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "a";
		System.out.println(a == b);
		
		String c = new String("a");
		String d = new String("a");
		System.out.println(c == d);
		
		String e = "a" + "b";
		String f = "ab";
		System.out.println(e == f);
		
		String q = new String("a");
		String r = q.intern();
		String w = "a";
		System.out.println(r == w);
		
		String str1=new String("c") + new String("c");
		String str2 = str1.intern();
		System.out.println(str1==str2);
	}

}
