package dp.builder.ex2.drink;

import dp.builder.ex2.Bottle;
import dp.builder.ex2.Item;
import dp.builder.ex2.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
