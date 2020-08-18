package dp.builder.ex2.burger;

import dp.builder.ex2.Item;
import dp.builder.ex2.Packing;
import dp.builder.ex2.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
