package decorator;

import com.wjk.zsz.Beverage;
import com.wjk.zsz.CondimentDrcorator;

/**
 * �������-װ����
 * 
 * @author asus
 *
 */
public class Mocha extends CondimentDrcorator {

	Beverage beverage;

	// �����ϵ������������������ɹ������������ϼ�¼��ʵ��������
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
