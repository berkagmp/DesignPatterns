package DesignPatterns.Builder_2.drink;

import DesignPatterns.Builder_2.Bottle;
import DesignPatterns.Builder_2.Item;
import DesignPatterns.Builder_2.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
