package com.sumit;
import java.util.*;

public class Solution {

	public static void main(String args[])
	{
		String expression = new Scanner(System.in).nextLine();
		expression = expression.replaceAll(" ","");
		int result=evaluatePostfixExp(expression);
		System.out.println(result);
	}

	private static int evaluatePostfixExp(String expression) {
		java.util.Stack<Integer> st =
				new java.util.Stack<Integer>();
		int i=0;
		int len= expression.length();

		char[] ch = expression.toCharArray();
		while(i<len)
		{

			if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' )
			{
				int num2=st.pop();
				int num1=st.pop();
				switch(ch[i])
				{
					case '+':st.push(num1+num2);break;
					case '-':st.push(num1-num2);break;
					case '*':st.push(num1*num2);break;
					case '/':st.push(num1/num2);break;

				}
			}
			else
			{

				st.push(Character.getNumericValue(ch[i]));
			}
			i++;
		}
		return (Integer)st.pop();
	}

}
