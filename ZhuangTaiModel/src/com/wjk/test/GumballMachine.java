package com.wjk.test;

import com.wjk.state.HasQuarterState;
import com.wjk.state.NoQuarterState;
import com.wjk.state.SoldOutState;
import com.wjk.state.SoldState;
import com.wjk.state.State;
import com.wjk.state.WinnerState;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	// 开始时机器是没有糖果的
	State state = soldOutState;
	// 糖果数量为0
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/**
	 *  dispense是一个内部操作，不可以直接要求发放糖果
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("正在发糖...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}

	@Override
	public String toString() {
		return "GumballMachine [soldOutState=" + soldOutState
				+ ", noQuarterState=" + noQuarterState + ", hasQuarterState="
				+ hasQuarterState + ", soldState=" + soldState
				+ ", winnerState=" + winnerState + ", state=" + state
				+ ", count=" + count + "]";
	}

}
