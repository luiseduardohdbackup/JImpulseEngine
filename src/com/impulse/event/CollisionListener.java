/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		CollisionListener.java
Package: 	com.impulse.event
*************************************************************************************
Collideable objects are responsible for collision detection.
*************************************************************************************/

package com.impulse.event;

public interface CollisionListener{
	public void collisionEvent(Object... objects);
}