/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		Vector2.java
Package: 	com.impulse.geometry
*************************************************************************************/

package com.impulse.geometry;

public abstract class Vector2{

	public abstract double getX();
	public abstract double getY();
	
	public abstract void setX(double x);
	public abstract void setY(double y);
	
	public Vector2 setXY(double x, double y){
		setX(x);
		setY(y);
		return this;
	}
	
	public Vector2 negate(){
		return setXY(-this.getX(), -this.getY());
	}
	
	public Vector2 negate(Vector2 source){
		return setXY(-source.getX(), -source.getY());
	}
	
	public Vector2 add(Vector2 v1){
		return setXY(this.getX() + v1.getX(), this.getY() + v1.getY());
	}
	
	public Vector2 add(Vector2 v1, Vector2 v2){
		return setXY(v1.getX() + v2.getX(), v1.getY() + v2.getY());
	}
	
	public static class Integer extends Vector2{
	
		public int x, y;
		
		public Integer(){
			setXY(0, 0);
		}
		
		public Integer(int x, int y){
			setXY(x, y);
		}
		
		public double getX(){
			return x;
		}
		public double getY(){
			return y;
		}
		
		public void setX(double x){
			this.x = (int)x;
		}
		public void setY(double y){
			this.y = (int)y;
		}
		
		public void setX(int x){
			this.x = x;
		}
		public void setY(int y){
			this.y = y;
		}
		
	}
	
	public static class Float extends Vector2{
	
		public float x, y;
		
		public Float(){
			setXY(0.0, 0.0);
		}
		
		public Float(float x, float y){
			setXY(x, y);
		}
		
		public double getX(){
			return x;
		}
		public double getY(){
			return y;
		}
		
		public void setX(double x){
			this.x = (float)x;
		}
		public void setY(double y){
			this.y = (float)y;
		}
		
		public void setX(float x){
			this.x = x;
		}
		public void setY(float y){
			this.y = y;
		}
		
	}
	
}