package edu.towson.cis.cosc442.examples.coffeemaker;

/**
 * Recipe object for the coffee maker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Recipe {
    private RecipeProduct recipeProduct = new RecipeProduct();
	private String name;
    /**
     * Method getAmtChocolate.
     * @return int
     */
    public int getAmtChocolate() {
        return recipeProduct.getAmtChocolate();
    }
    /**
     * Method setAmtChocolate.
     * @param amtChocolate int
     */
    public void setAmtChocolate(int amtChocolate) {
    	recipeProduct.setAmtChocolate(amtChocolate);
    }
    /**
     * Method getAmtCoffee.
     * @return int
     */
    public int getAmtCoffee() {
        return recipeProduct.getAmtCoffee();
    }
    /**
     * Method setAmtCoffee.
     * @param amtCoffee int
     */
    public void setAmtCoffee(int amtCoffee) {
    	recipeProduct.setAmtCoffee(amtCoffee);
    }
    /**
     * Method getAmtMilk.
     * @return int
     */
    public int getAmtMilk() {
        return recipeProduct.getAmtMilk();
    }
    /**
     * Method setAmtMilk.
     * @param amtMilk int
     */
    public void setAmtMilk(int amtMilk) {
    	recipeProduct.setAmtMilk(amtMilk);
    }
    /**
     * Method getAmtSugar.
     * @return int
     */
    public int getAmtSugar() {
        return recipeProduct.getAmtSugar();
    }
    /**
     * Method setAmtSugar.
     * @param amtSugar int
     */
    public void setAmtSugar(int amtSugar) {
    	recipeProduct.setAmtSugar(amtSugar);
    }
    /**
     * Method getName.
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     * Method setName.
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method getPrice.
     * @return int
     */
    public int getPrice() {
        return recipeProduct.getPrice();
    }
    /**
     * Method setPrice.
     * @param price int
     */
    public void setPrice(int price) {
    	recipeProduct.setPrice(price);
    } 
    /**
     * Method equals.
     * @param r Recipe
     * @return boolean
     */
    public boolean equals(Recipe r) {
        if(r.getName() == null) {
	    	return false;
    	}	
        if(this.name == null) {
        	return false;
        }
        if((this.name).equals(r.getName())) {
            return true;
        }
        return false;
    }
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
    	return name;
    }
}
