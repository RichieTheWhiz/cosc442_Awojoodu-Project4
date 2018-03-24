package edu.towson.cis.cosc442.examples.coffeemaker;


public class RecipeProduct {
	private int price;
	private int amtCoffee;
	private int amtMilk;
	private int amtSugar;
	private int amtChocolate;

	public int getPrice() {
		return price;
	}

	public int getAmtCoffee() {
		return amtCoffee;
	}

	public int getAmtMilk() {
		return amtMilk;
	}

	public int getAmtSugar() {
		return amtSugar;
	}

	public int getAmtChocolate() {
		return amtChocolate;
	}

	/**
	* Method setPrice.
	* @param price  int
	*/
	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	/**
	* Method setAmtCoffee.
	* @param amtCoffee  int
	*/
	public void setAmtCoffee(int amtCoffee) {
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} else {
			this.amtCoffee = 0;
		}
	}

	/**
	* Method setAmtMilk.
	* @param amtMilk  int
	*/
	public void setAmtMilk(int amtMilk) {
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} else {
			this.amtMilk = 0;
		}
	}

	/**
	* Method setAmtSugar.
	* @param amtSugar  int
	*/
	public void setAmtSugar(int amtSugar) {
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} else {
			this.amtSugar = 0;
		}
	}

	/**
	* Method setAmtChocolate.
	* @param amtChocolate  int
	*/
	public void setAmtChocolate(int amtChocolate) {
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} else {
			this.amtChocolate = 0;
		}
	}
}