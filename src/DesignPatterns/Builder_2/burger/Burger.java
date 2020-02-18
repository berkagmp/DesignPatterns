package DesignPatterns.Builder_2.burger;

import DesignPatterns.Builder_2.Item;
import DesignPatterns.Builder_2.Packing;
import DesignPatterns.Builder_2.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
