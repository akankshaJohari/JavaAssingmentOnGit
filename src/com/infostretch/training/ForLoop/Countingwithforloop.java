package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class Countingwithforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }
	}

}

/*what does n = n+1 do? Remove it and see what happens. (Then put it back.)
What does int n = 1 do? Remove it and see what happens. (Then put it back.)
Change the code so that the loop repeats ten times instead of five.
See if you can change the for loop so that the message starts at 2 and counts by twos, like so:
Type in a message, and I'll display it ten times.
Message: qwerty
2. qwerty
4. qwerty
6. qwerty
8. qwerty
10. qwerty*/