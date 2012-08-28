/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Animation.java
Package: 	com.impulse.graphics
*************************************************************************************/

package com.impulse.graphics;

//Java Imports
import java.awt.Image;
import java.util.ArrayList;

public class Animation{
	
	private ArrayList<Image> frames;
	private int frameIndex;

	public Animation(){
		frames = new ArrayList<Image>();		
	}
	
	public Image getFrame(int index){
		return frames.get(index);
	}
	
	public Image getCurrentFrame(){
		return frames.get(frameIndex);
	}
	
	public boolean isFirstFrame(){
		return frameIndex == 0;
	}
	
	public boolean isLastFrame(){
		return frameIndex == frames.size() - 1;
	}
	
	public void addFrame(int index, Image img){
		frames.add(index, img);
	}
	
	public void setCurrentFrame(int i){
		frameIndex = i;
	}
	
	public void nextFrame(){
		if(frameIndex < frames.size() - 1){
			frameIndex++;
		}else{
			frameIndex = 0;
		}
	}
	
	public void lastFrame(){
		if(frameIndex > 0){
			frameIndex--;
		}else{
			frameIndex = frames.size() - 1;
		}
	}
	
	public void reset(){
		frameIndex = 0;
	}
						
}