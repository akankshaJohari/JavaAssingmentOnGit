package com.infostretch.training.decisionmaking;

public class WhatIf {
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
/*
What do you think the if does to the code under it? Put your answer in a comment in the code.
Ans. If is a decision making statement used to specify a block of code if the condition is true it will go inside the statement and execute it also if the condition is false in that case the statement block will be skipped and the execution will be transferred to statement after the block.

What is the purpose of the curly braces in the if statement? Answer in a comment.
Ans.the curly brackets are nothing but the statement block where we write the condition

Change the values of the variables so that neither message about cats is printed.
Ans.
*/
