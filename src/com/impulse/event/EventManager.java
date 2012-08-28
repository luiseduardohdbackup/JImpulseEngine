/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		EventManager.java
*************************************************************************************/

package com.impulse.event;

//Java Imports
import java.util.ArrayList;

public class EventManager{

	private ArrayList<Event> events = new ArrayList<Event>();
	
	public void addEvent(Event e){
		events.add(e);
	}
	
	public void removeEvent(Event e){
		events.remove(e);
	}	
	
	public void runEvents(){
		for(Event e : events){
			if(e.condition()){
				e.start();
			}
		}
	}
	
}