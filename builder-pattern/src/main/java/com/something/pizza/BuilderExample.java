package com.something.pizza;

public class BuilderExample {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		System.out.println("dough: "+pizza.getDough());
		System.out.println("sauce: "+pizza.getSauce());
		System.out.println("topping: "+pizza.getTopping());
	}
}
