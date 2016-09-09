import imp.FlyBehavior;
import imp.QuackBehavior;


public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	protected void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void dispaly();
	
	//ί�и���Ϊ��
	public void perfromFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	//���Ե��ô˷����ı�Ѽ�ӵ���Ϊ***
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior=flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior=quackBehavior;
	}
}
