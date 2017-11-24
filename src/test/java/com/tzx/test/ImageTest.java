package com.tzx.test;

import javax.swing.ImageIcon;

import junit.framework.TestCase;

public class ImageTest extends TestCase {


	public void testImage(){
		ImageIcon image = new ImageIcon("C:/dd.jpeg");
		System.out.println(image.getIconHeight());
		System.out.println(image.getIconWidth());
	}

}
