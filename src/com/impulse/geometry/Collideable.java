/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Collideable.java
Package: 	com.impulse.geometry
*************************************************************************************
Collideable objects are responsible for collision detection.
*************************************************************************************/

package com.impulse.geometry;

//Impulse Engine Imports
import com.impulse.event.CollisionListener;

public interface Collideable{

	public boolean isCollideable();
	public void    isCollideable(boolean c);
	public boolean checkCollision(Collideable other);
	public void    addCollisionListener(CollisionListener c);
	
}