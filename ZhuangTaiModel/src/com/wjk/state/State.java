package com.wjk.state;

public interface State {
	//放入钱
	public void insertQuarter();
	//退出钱
	public void ejectQuarter();
	//摇杆选择
	public void turnCrank();
	//发放糖果
	public void dispense();
}
