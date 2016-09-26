package com.wjk.state;

import com.wjk.test.GumballMachine;

public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("SoldOutState:糖果已卖完");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("SoldOutState:退钱");
	}

	@Override
	public void turnCrank() {
		System.out.println("SoldOutState:没糖不能摇杆，turnCrank操作不符合当前状态");
	}

	@Override
	public void dispense() {
		System.out.println("SoldOutState:没糖，不能卖，dispense操作不符合当前状态");
	}

}
