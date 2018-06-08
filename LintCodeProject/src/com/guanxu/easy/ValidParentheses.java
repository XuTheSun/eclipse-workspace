package com.guanxu.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isValidParentheses("()()()[]"));
//		System.out.println("()()()".toCharArray()[1] != ')');
	}
//	Use Stack£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡
//    public static boolean isValidParentheses(String s) {
//        // write your code here
//    	char[] parentheses = s.toCharArray();
//    	if(parentheses.length % 2 == 1)
//    		return false;
//    	for(int i = 0; i < parentheses.length - 1; i++) {
//    		switch(parentheses[i]) {
//    		case '(':
//    			if(parentheses[i + 1] != ')')
//    				return false;
//    			break;
//    		case '[':
//    			if(parentheses[i + 1] != ']')
//    				return false;
//    			break;
//    		case '{': 
//    			if(parentheses[i + 1] != '}')
//    				return false;
//    			break;
//    		default:
//    			if(i % 2 == 0) 
//    				return false;
//    			break;
//    		} 
//    	}
//        return true;
//    }
	
	public static boolean isValidParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}else if(c == ')') {
				if(!stack.isEmpty() && stack.peek() =='(') {
					stack.pop();
				}else{
					return false;
				}
			}else if(c == ']') {
				if(!stack.isEmpty() && stack.peek() =='[') {
					stack.pop();
				}else{
					return false;
				}
			}else if(c == '}') {
				if(!stack.isEmpty() && stack.peek() =='{') {
					stack.pop();
				}else{
					return false;
				}
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
