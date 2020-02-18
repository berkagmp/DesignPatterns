package DesignPatterns.Builder_2;

import DesignPatterns.Builder_2.burger.ChickenBurger;
import DesignPatterns.Builder_2.burger.VegBurger;
import DesignPatterns.Builder_2.drink.Coke;
import DesignPatterns.Builder_2.drink.Pepsi;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
