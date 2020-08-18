package dp.builder.ex2;

import dp.builder.ex2.burger.ChickenBurger;
import dp.builder.ex2.burger.VegBurger;
import dp.builder.ex2.drink.Coke;
import dp.builder.ex2.drink.Pepsi;

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
