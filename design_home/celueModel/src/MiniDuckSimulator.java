import behavior.FlyRocketPowered;


public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallarDuck();
		mallard.performQuack();
		mallard.perfromFly();
		
		System.out.println("-------------------------------------");
		
		Duck model=new ModelDuck();
		model.perfromFly();
		model.setFlyBehavior(new FlyRocketPowered());	//****
		model.perfromFly();
		
	}
	
}
