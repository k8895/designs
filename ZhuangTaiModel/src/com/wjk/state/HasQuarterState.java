package com.wjk.state;

import java.util.Random;

import com.wjk.test.GumballMachine;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random random = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("HasQuarterState：已经有钱，不能在投入,insertQuarter操作不符合当前状态");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("HasQuarterState：退出钱");
		// 退出钱后，状态转换到noQuarterState
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("HasQuarterState:摇动摇杆");
		// 设置摇杆随机数
		int winner = random.nextInt(10);
		// 随机中奖判断
		if (winner == 0 && gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("HasQuarterState:dispense操作不符合当前状态");
	}

}
