package com.wjk.zsz;

/**
 * 调料-装饰者类
 * @author asus
 *
 */
public abstract class CondimentDrcorator extends Beverage{

	@Override
	public abstract String getDescription();
	
	@Override
	public double cost() {
		
		return 0;
	}

}
