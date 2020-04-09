package com.infostretch.training.decisionmaking;

public class ElseIf {

		public static void main( String[] args )
		{
			int people = 30;
			int cars = 40;
			int buses = 15;

			if ( cars > people )
			{
				System.out.println( "We should take the cars." );
			}
			else if ( cars < people )
			{
				System.out.println( "We should not take the cars." );
			}
			else
			{
				System.out.println( "We can't decide." );
			}


			if ( buses > cars )
			{
				System.out.println( "That's too many buses." );
			}
			else if ( buses < cars )
			{
				System.out.println( "Maybe we could take the buses." );
			}
			else
			{
				System.out.println( "We still can't decide." );
			}
			if ( people > buses )
			{
				System.out.println( "All right, let's just take the buses." );
			}
			else
			{
				System.out.println( "Fine, let's stay home then." );
			}

		}
	}
/*In this section, you're going to try to guess what you think the if statement is and what it does.

What do you think else if and else are doing? Answer in a comment.
Ans. else and else if are a part of if statement but are used when there are multiple conditions to be executed 
Remove the else part at the beginning of one of the else if statements. What difference does that make? Why? Answer in a comment.

*/