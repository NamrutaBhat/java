package com.xworkz.light;

public class LightFactory {
	
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("tubelighgt")){
			return new TubeLightImpl();}
		
		if(type.equalsIgnoreCase("cflBulb")){
			return new CflLightImpl();
		}
		return null;
	}

	
}
