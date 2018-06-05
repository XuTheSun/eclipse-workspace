package com.guanxu.staticTest;

public class StaticTest extends StaticTest0{  
      
    public static int k = 0;  
    public static StaticTest t1 = new StaticTest("t1");  
    public static StaticTest t2 = new StaticTest("t2");  
    public static int i = print("i");  
    public static int n = 99;  
    public int j = print("j");  
       
    {  
        print("¹¹Ôì¿é");  
    }  
       
    static{  
        print("¾²Ì¬¿é");  
    }  
       
    public StaticTest(String str) {
    	super(str);
        System.out.println((++k) + ": Child");  
        }  
       
    public static int print(String str) {  
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);  
        ++i;  
        return ++n;  
    }  
    public static void main(String[] args) {  
        StaticTest t = new StaticTest("init");  
    }  
   
}



class StaticTest0 {  
    
    public static int k = 0;  
    public static int i = print("i");  
    public static int n = 99;  
    public int j = print("j");  
       
    {  
        print("¹¹Ôì¿é");  
    }  
       
    static{  
        print("¾²Ì¬¿é");  
    }  
       
    public StaticTest0(String str) {  
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);  
        ++n;  
        ++i;  
    }  
       
    public static int print(String str) {  
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);  
        ++i;  
        return ++n;  
    }  
//    public static void main(String[] args) {  
//        StaticTest t = new StaticTest("init");  
//    }  
//   
} 