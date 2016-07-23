package com.something;

import static org.junit.Assert.*;

import org.junit.Test;
import com.something.pizza.HawaiianPizzaBuilder;
import com.something.pizza.Pizza;
import com.something.pizza.PizzaBuilder;
import com.something.pizza.SpicyPizzaBuilder;
import com.something.pizza.Waiter;

public class PizzaTest {


	@Test
	public void testHawaiianPizza() {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		assertEquals("cross", pizza.getDough());
		assertEquals("mild", pizza.getSauce());
		assertEquals("ham+pineapple", pizza.getTopping());
	}
	
	@Test
	public void testSpicyPizza() {
		Waiter waiter = new Waiter();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
		assertEquals("pan baked", pizza.getDough());
		assertEquals("hot", pizza.getSauce());
		assertEquals("pepperoni+salami", pizza.getTopping());
	}

}
