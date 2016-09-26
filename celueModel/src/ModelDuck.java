import behavior.FlyNoWay;
import behavior.Quack;


public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
	}
	
	@Override
	public void dispaly() {
		System.out.println("I'm a model duck");
	}

}
