package com.techinfo.Test_Git;

import java.util.Stack;

public class ParenthesisValidation {
	public static void main(String[] args) {
String str= "(){}[";
        
        boolean stetus=validatingParenthesis(str);
        System.out.println(str);
        System.out.println(stetus);
	}

	private static boolean validatingParenthesis(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }else return false; 
            }else if(c==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }else return false; 
            }else if(c==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }else return false; 
            }
            else 
                stack.push(c);
        }
        if(stack.empty()){
            return true;
        } return false; 
    }
	
}
