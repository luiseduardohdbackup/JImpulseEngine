/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Actor.java
Package: 	com.impulse.graphics
*************************************************************************************
Actors are renderable objects that will be drawn on the screen, they will define
the objects that will help them render. They will also be Collideable and be 
responsible for their own collision events.
*************************************************************************************/

package com.impulse.graphics;

//Java Imports
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

//Impulse Engine Imports
import com.impulse.geometry.Vector2;
import com.impulse.geometry.Collideable;
import com.impulse.event.CollisionListener;

public class Actor implements Renderable, Collideable{
	
	private Graphics        graphics;
	private Vector2.Integer location;
	private Vector2.Integer dimension;
	private Vector2.Integer speed;
	private boolean         active;
	private boolean			collidable;
	private ArrayList<CollisionListener> collisionListeners = new ArrayList<CollisionListener>();
		
	public Actor(Graphics g){
		this(g, 0, 0, 0, 0, 0, 0);
	}
	
	public Actor(Graphics g, int x, int y){
		this(g, x, y, 0, 0, 0, 0);
	}
		
	public Actor(Graphics g, int x, int y, int w, int h){
		this(g, x, y, w, h, 0, 0);
	}
		
	public Actor(Graphics g, int x, int y, int w, int h, int sx, int sy){
		setGraphics(g);
		setLocation(new Vector2.Integer(x, y));
		setDimension(new Vector2.Integer(w, h));
		setSpeed(new Vector2.Integer(sx, sy));
	}
	
	public Graphics getGraphics(){
		return graphics;
	}
	
	public Vector2 getLocation(){
		return location;
	}
	
	public Vector2 getDimension(){
		return dimension;
	}
	
	public Vector2 getSpeed(){
		return speed;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)getLocation().getX(), (int)getLocation().getY(), 
			(int)getDimension().getX(), (int)getDimension().getY());
	}
	
	public void setGraphics(Graphics g){
		graphics = g;
	}
	
	public void setLocation(Vector2.Integer l){
		location = l;
	}
	
	public void setDimension(Vector2.Integer d){
		dimension = d;
	}
	
	public void setSpeed(Vector2.Integer s){
		speed = s;
	}
	
	public void isActive(boolean active){
		this.active = active;
	}
	
	public void update(){
	}
	
	public void render(){
	}
				
	public boolean isCollideable(){
		return collidable;
	}
	public void isCollideable(boolean c){
		collidable = c;
	}
	
	public boolean checkCollision(Collideable other){
		if(other instanceof Renderable && this.getBounds().intersects(((Renderable)other).getBounds())){
			for(CollisionListener c : collisionListeners){
				c.collisionEvent(this, other);
			}
			return true;
		}
		return false;
	}

	public void addCollisionListener(CollisionListener c){
		collisionListeners.add(c);
	}
		
}