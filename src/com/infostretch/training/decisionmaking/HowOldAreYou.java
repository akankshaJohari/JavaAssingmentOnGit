package com.infostretch.training.decisionmaking;

public class HowOldAreYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Billy";
		
		int age=15;
		
		if(age<16) {
			System.out.println("Ok," + name + " you can't drive ");
		}
		if(age<18)
		{
			System.out.println("Ok," + name + " you can't vote ");
		}
		if(age<25) {
			System.out.println("Ok," + name + " you can't rent a car ");
		}
		else {
			System.out.println("Ok," + name + " you can't do anything that's legal ");
		}

	}

}

/*
Make a program which displays a different message depending on the age given. Here are the possible responses:

age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal."
Here's a sample run. Notice that a person who is under 16 will display three messages, one for being under 16, one for also being under 18, and one for also being under 25.

Hey, what's your name? Billy_Corgan

Ok, Billy_Corgan, how old are you? 17

You can't vote, Billy_Corgan.
You can't rent a car, Billy_Corgan.
*/

