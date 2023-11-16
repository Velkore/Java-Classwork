package Assignments;

//Prompt user for value to start
//Value must be between 1 and 20 inclusive
//At command line, count down to blastoff
//With a brief pause between each displayed value

import javax.swing.*;

public class FixDebugSix3
{
	public static void main(String[] args)
	{
	 String userNumString;
	 int userNum, val;
	 final int MIN = 1;
	 final int MAX = 20;
	 
	 userNumString = JOptionPane.showInputDialog(null,
	     "Enter a number between " + MIN + " and " + MAX + " inclusive");
	 userNum = Integer.parseInt(userNumString);
	 
	 while(userNum < MIN || userNum > MAX)
	 {
	    userNumString = JOptionPane.showInputDialog(null,
	      "Number out of range" +
	      "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
	    userNum = Integer.parseInt(userNumString);
	 }
	 
	 for(val = userNum; val > 0; --val)
	 {
	   System.out.print(val + "  ");
	   try {
		Thread.sleep(1000);
	   } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	 }
	 System.out.println("Blastoff!");
	}
}