package com.wjk.zsz;

/**
 * ÒûÁÏÀà
 * @author asus
 *
 */
public abstract class Beverage {

	public String description="Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
