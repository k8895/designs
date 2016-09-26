import behavior.FlyWithWings;
import behavior.Quack;


public class MallarDuck extends Duck{

	public MallarDuck() {
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}
	
	@Override
	public void dispaly() {
		System.out.println("I'm a real Mallard duck");
	}
	
}
