package com.techinfo.Test_Git;

/**
 * Reverse String
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String str = "abc jjbkbkj";
        char [] chr = str.toCharArray();//['a', 'b', 'c]
        String st="";
        for(int i=str.length()-1; i>=0; i--){
            // st = st+Character.toString(chr[i]);
            st=st+chr[i];
        }
        System.out.println(st);
    }
}
