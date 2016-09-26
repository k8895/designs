package com.wjk.state;

import com.wjk.test.GumballMachine;

public class SoldState implements State{
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {
		System.out.println("SoldState:这在出售，不能投钱，insertQuarter操作不符合当前状态");
	}

	@Override
	public void ejectQuarter() { 
		System.out.println("SoldState:这在出售，不能退钱，ejectQuarter操作不符合当前状态");
	}

	@Override
	public void turnCrank() { 
		System.out.println("SoldState:正在出售，不能摇杆选择，turnCrank操作不符合当前状态");
	}

	@Override
	public void dispense() { 
		gumballMachine.releaseBall();
		//出售后计算剩余数量
		if(gumballMachine.getCount()>0){
			System.out.println("SoldState:糖还有 "+gumballMachine.getCount()+" 个");
			//转换到没钱状态
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("SoldState:糖卖完了");	
			//转换到售完状态
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
