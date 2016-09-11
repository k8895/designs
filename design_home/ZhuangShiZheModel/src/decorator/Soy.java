package decorator;

import com.wjk.zsz.Beverage;
import com.wjk.zsz.CondimentDrcorator;

/**
 * �������-װ����
 * 
 * @author asus
 *
 */
public class Soy extends CondimentDrcorator {

	Beverage beverage;

	// �����ϵ������������������ɹ������������ϼ�¼��ʵ��������
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
