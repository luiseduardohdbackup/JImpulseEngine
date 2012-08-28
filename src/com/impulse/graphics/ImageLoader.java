/*************************************************************************************
*  (C) Copyright 2006 by Totally Ghetto Games All Rights Reserved.  
*                                                                  
*  DISCLAIMER: The developer shall not be liable in any event for incidental or 
*  consequential damages in connection with, or arising out of, the furnishing, 
*  performance, or use of these programs. 				
*										
*************************************************************************************
Date:		9/21/2006
File: 		ImageLoader.java
Package: 	com.impulse.graphics
*************************************************************************************/

package com.impulse.graphics;

//Java Imports
import java.awt.Image;
import java.net.URL;
import java.applet.Applet;
import java.util.HashMap;

public class ImageLoader{

	private Applet applet;
	private URL docBase;
	private HashMap<String, Image> images;
	
	public ImageLoader(Applet a){
		applet = a;
		try{
			setDocBase(applet.getDocumentBase());
		}catch(Exception e){
		}	
		images = new HashMap<String, Image>();
	}
	
	public URL getDocBase(){
		return docBase;
	}
	
	public void setDocBase(URL url){
		docBase = url;
	}
	
	public void loadImage(String key, String file){
		images.put(key, applet.getImage(getDocBase(), file));
	}
	
	public void loadImage(String file){
		images.put(file, applet.getImage(getDocBase(), file));
	}
	
	public Image getImage(String key){
		return images.get(key);
	}
	
}