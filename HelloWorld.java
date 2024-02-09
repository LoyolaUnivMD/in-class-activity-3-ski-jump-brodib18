//Programmers:  Brodi Reidel
//Course:  CS212
//Due Date:  Feb 8
//Lab Assignment:  Ski Jump
//Problem Statement:  figure out points
//Data In:  ask for jump size and speed
//Data Out:  whether or not they did better then par
//Credits: 

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("What size jump did you go off of? n(normal) or l(large)");
		String jump_size = input.next();
		System.out.println("What was your speed while going off the jump?");
		int speed = input.nextInt();
		
		double air_time;
		double distance;
		double points;
		
		if (jump_size.equals("n")){
		    air_time = Math.sqrt((2*46)/9.8);
		    distance = (air_time * speed);
		    points = (60 + (distance - 90) * 2);
		    if (points >= 61){
		        System.out.println("Great job for doing better than par!");
		        
		    } else if (points < 10){
		        System.out.println("What happened??");
		    } else{
		        System.out.println("Sorry you didn’t go very far");
		    }
		    
	    }else if (jump_size.equals("l")){
		    air_time = Math.sqrt((2*70)/9.8);
		    distance = (air_time * speed);
		    points = (60 + (distance - 120) * 1.8);
		    if (points >= 61){
		        System.out.println("Great job for doing better than par!");
		        
		    } else if (points < 10){
		        System.out.println("What happened??");
		    } else{
		        System.out.println("Sorry you didn’t go very far");
		    }
		    
		}
		
	}
}

