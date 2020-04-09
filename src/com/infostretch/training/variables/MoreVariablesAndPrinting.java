package com.infostretch.training.variables;

public class MoreVariablesAndPrinting {
	
	    public static void main( String[] args )
	    {
	        String Name, Eyes, Teeth, Hair;
	        int Age, Height, Weight, Inches;
            double pound, Kilogram, centimeter;
            
            
	        Name = "Zed A. Shaw";
	        Age = 35;     // not a lie
	        Height = 74;  // inches
	        Weight = 180; // lbs
	        Eyes = "Blue";
	        Teeth = "White";
	        Hair = "Brown";
	        pound = 10;
	        Inches = 2;
	        double  kilogram = pound * 0.454;
	        centimeter =Inches * 2.54;
	        
	        
          
	        System.out.println( "Let's talk about " + Name + "." );
	        System.out.println( "He's " + Height + " inches tall." );
	        System.out.println( "He's " + Weight + " pounds heavy." );
	        System.out.println( "Actually, that's not too heavy." );
	        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
	        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );
	        System.out.println(pound + " pound is "  + kilogram + " kilogram ");
	        System.out.println(Inches + " Inches is "  + centimeter + " centimeter ");

	        // This line is tricky; try to get it exactly right.
	        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
	            + " I get " + (Age + Height + Weight) + "." );
	    }
	}
/*
Change all the variables so there isn't the my in front. Make sure you change the name everywhere, not just where you used = to set them.
Ans. Done above

Try to write some variables that convert the inches and pounds to centimeters and kilos. Don't just type in the measurements, but work out the math inside your Java program.*/
