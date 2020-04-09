package com.infostretch.training.variables;

public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        //car is a variable of Integer type and assigned with value 100
        
        space_in_a_car = 4;
        // space_in_a_car is a variable of double type and assigned with value 4
        
        drivers = 30; // drivers is a variable of Integer type and assigned with value 30
        passengers = 90; //passengers is a variable of Integer type and assigned with value 90
        cars_not_driven = cars - drivers; //cars_not_driven is a variable of Integer type 
        cars_driven = drivers; //cars_driven is a variable of Integer type 
        carpool_capacity = cars_driven * space_in_a_car; //drivers is a variable of double type
        average_passengers_per_car = passengers / cars_driven; //average_passengers_per_car is a variable of double type and assigned with 
        	
        float y  = 1+ 1/2 *1.0f;//
        
        float z = 1/2;
        // int x = 1/(float)2;  // give error why ? because we are converting from smaller data type to a bigger one
        
        int x = 123 /10 ; // =12 
        float fx =(float)123/10 ; //12.3
        
        
        
        float x1=1/(float)2;
        System.out.println(y);

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}

/*
 * 1. I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?
 * Ans. we could use both 4.0 and 4 as it will only take the whole number
 
 * 2. Remember that 4.0 is a "floating point" number. Find out what that means.
 * Ans. since it double number and the conversion is happening from smaller type (float) to bigger type (double) there will be no error.Moreover if we say 4 it implies that an integer value is being converted to double agin the concept of upcasting will be applicable.
  
  3.Write comments above each of the variable assignments.--Ans.done above

  4.Make sure you know what = is called (equals) and that it's making names for things.
  Ans. equals is called assignment operator it is used to assign values to a variable.
   Remember _ is an underscore character.
*/
