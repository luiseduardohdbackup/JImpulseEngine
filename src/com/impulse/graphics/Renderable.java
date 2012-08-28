/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Renderable.java
Package: 	com.impulse.graphics
*************************************************************************************
Renderable objects define how something will be drawn, they need to have a graphics
object in order to draw, they need to know where and what size they will be drawn at.
They need to know if they move or stay. They need to know if they are active and they
should be able to render. They also need to be updatable with the new information so
that the next time they render everything will be updated.
*************************************************************************************/

package com.impulse.graphics;

//Java Imports
import java.awt.Graphics;
import java.awt.Rectangle;

//Impulse Engine Imports
import com.impulse.geometry.Vector2;

public interface Renderable{

	public Graphics  getGraphics();
	public Vector2   getLocation();
	public Vector2   getDimension();
	public Vector2   getSpeed();
	public Rectangle getBounds();
	public void 	 setGraphics(Graphics g);
	public void 	 setLocation(Vector2.Integer l);
	public void 	 setDimension(Vector2.Integer d);
	public void 	 setSpeed(Vector2.Integer s);
	public boolean 	 isActive();
	public void    	 isActive(boolean active);
	public void 	 update();
	public void 	 render();
	
}