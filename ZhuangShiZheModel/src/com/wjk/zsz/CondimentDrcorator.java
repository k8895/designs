package com.wjk.zsz;

/**
 * ����-װ������
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
