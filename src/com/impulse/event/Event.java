/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Event.java
*************************************************************************************/

package com.impulse.event;

public abstract class Event{
	
	private boolean active;
		
	public boolean isActive(){
		return active;
	}
	
	public void isActive(boolean a){
		active = a;
	}
	
	public void start(){
		if(isActive()){
			run();
		}
		isActive(false);
	}
	
	public abstract void run();
	public abstract boolean condition();
	
}