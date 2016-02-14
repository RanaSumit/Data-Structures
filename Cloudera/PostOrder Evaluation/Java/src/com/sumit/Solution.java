package com.sumit;
import java.util.*;

public class Solution {

	public static void main(String[] args)
	{
		String str = new Scanner(System.in).nextLine();
		System.out.print(sol(str));
	}

	public static int sol(String S) {

		// write your code in Java SE 8

		char[] tokens = S.toCharArray();

		// Stack for numbers: 'values'

		Stack<Integer> values = new Stack<Integer>();



		for (int i = 0; i < tokens.length; i++)

		{

			// Current token is a whitespace, skip it

			if (tokens[i] == ' ')

				continue;



			// Current token is a number, push it to stack for numbers

			if (tokens[i] >= '0' && tokens[i] <= '9')

			{

				values.push(Integer.parseInt(tokens[i]+""));

			}



			// Current token is an operator.

			else if (tokens[i] == '+' || tokens[i] == '*' )

			{

				try{

					int intermediateResult=applyOp(tokens[i], values.pop(), values.pop());



					if(intermediateResult <= 4095)

						values.push(intermediateResult);

					else

						return -1;



				}catch(EmptyStackException e){

					return -1 ;

				}

			}

		}



		if(values.isEmpty())

			return -1;



		return values.pop();

	}



	public static int applyOp(char op, int b, int a)

	{

		switch (op)

		{

			case '+':

				return a + b;

			case '-':

				return a - b;

			case '*':

				return a * b;

			case '/':

				if (b == 0)

					throw new

							UnsupportedOperationException("Cannot divide by zero");

				return a / b;

		}

		return 0;

	}

}
