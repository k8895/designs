import imp.FlyBehavior;
import imp.QuackBehavior;


public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	protected void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void dispaly();
	
	//委托给行为类
	public void perfromFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	//可以调用此方法改变鸭子的行为***
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior=flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior=quackBehavior;
	}
}
