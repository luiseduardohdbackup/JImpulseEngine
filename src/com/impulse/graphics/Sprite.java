/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Sprite.java
Package: 	com.impulse.graphics
*************************************************************************************/

package com.impulse.graphics;

//Java Imports
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.applet.Applet;
import java.util.ArrayList;

//Impulse Engine Imports
import com.impulse.graphics.Actor;
import com.impulse.graphics.Animation;

public class Sprite extends Actor{
	
	private ArrayList<Animation> animations = new ArrayList<Animation>();;
	private int currentAnimationIndex;
	private ImageObserver imageObserver;

	public Sprite(Graphics g, ImageObserver io, int x, int y, int w, int h){
		super(g, x, y, w, h);
		setImageObserver(io);	
	}
	
	public ImageObserver getImageObserver(){
		return imageObserver;
	}
	
	public Animation getAnimation(int index){
		return animations.get(index);
	}
	
	public Animation getCurrentAnimation(){
		return animations.get(currentAnimationIndex);
	}
	
	public int getCurrentAnimationIndex(){
		return currentAnimationIndex;
	}
	
	public void addAnimation(Animation animation){
		animations.add(animation);
	}
	
	public void setImageObserver(ImageObserver i){
		imageObserver = i;
	}
		
	public void setCurrentAnimation(int index){
		currentAnimationIndex = index;
	}
		
	public void resetAnimations(){
		for(Animation a : animations){
			a.reset();
		}
	}
	
	public void update(){
		getLocation().setX(getLocation().getX() + getSpeed().getX());
		getLocation().setY(getLocation().getY() + getSpeed().getY());
	}
	
	public void render(){
		getGraphics().drawImage(getCurrentAnimation().getCurrentFrame(), 
			(int)getLocation().getX(), (int)getLocation().getY(), getImageObserver());
	}
		
}