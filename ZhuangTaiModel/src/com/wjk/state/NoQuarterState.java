package com.wjk.state;

import com.wjk.test.GumballMachine;

/**
 * 没有钱的状态
 * @author Administrator
 *
 */
public class NoQuarterState implements State{

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("NoQuarterState:投入了0.25元");
		//有钱了，就转换到hasQuarter方法中
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() { 
		System.out.println("NoQuarterState:还没给钱，不能退钱，ejectQuarter操作不符合当前状态");
	}

	@Override
	public void turnCrank() { 
		System.out.println("NoQuarterState:还没给钱，不能选择，turnCrank操作不符合当前状态");
	}

	@Override
	public void dispense() { 
		System.out.println("NoQuarterState:还没给钱，不能发放，dispense操作不符合当前状态");
	}

}
