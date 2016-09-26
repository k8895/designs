package com.wjk.state;

import com.wjk.test.GumballMachine;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("WinnerState:操作不符合当前状态");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("WinnerState:操作不符合当前状态");
	}

	@Override
	public void turnCrank() {
		System.out.println("WinnerState:操作不符合当前状态");
	}

	@Override
	public void dispense() {
		System.out.println("你赢得了两颗糖");
		gumballMachine.releaseBall();
		// 发糖后，判断还剩几颗
		if (gumballMachine.getCount() == 0) {
			//没糖了，转换售完状态
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			//还有糖，在发一颗
			gumballMachine.releaseBall();
			//...
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
