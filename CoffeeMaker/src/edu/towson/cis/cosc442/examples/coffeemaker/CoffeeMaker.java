package edu.towson.cis.cosc442.examples.coffeemaker;
/**
 * CoffeeMaker object
 * @version $Revision: 1.0 $
 */
public class CoffeeMaker {
	private CoffeeMakerProduct coffeeMakerProduct = new CoffeeMakerProduct();
	/** Inventory of the coffee maker */
    private Inventory inventory;
	
    /**
     * Constructor for the coffee maker
     *
     */
	public CoffeeMaker() {
	    coffeeMakerProduct.setRecipeArray(new Recipe[coffeeMakerProduct.getNUM_RECIPES()]);
	    coffeeMakerProduct.setRecipeFull(new boolean[coffeeMakerProduct.getNUM_RECIPES()]);
		for(int i = 0; i < coffeeMakerProduct.getNUM_RECIPES(); i++) {
		   coffeeMakerProduct.getRecipeArray()[i] = new Recipe();
		   coffeeMakerProduct.getRecipeFull()[i] = false;
		}
		inventory = new Inventory();
	}

	/**
	 * Returns true if a recipe is successfully added to the 
	 * coffee maker
	 * @param r
	
	 * @return boolean */
	public boolean addRecipe(Recipe r) {
        return coffeeMakerProduct.addRecipe(r);
    }

	/**
	 * Returns true if the recipe was deleted from the 
	 * coffee maker
	 * @param r
	
	 * @return boolean */
    public boolean deleteRecipe(Recipe r) {
        return coffeeMakerProduct.deleteRecipe(r);
    }
    
    /**
     * Returns true if the recipe is successfully edited
     * @param oldRecipe
     * @param newRecipe
    
     * @return boolean */
    public boolean editRecipe(Recipe oldRecipe, Recipe newRecipe) {
        return coffeeMakerProduct.editRecipe(oldRecipe, newRecipe);
    }
    
    /**
     * Returns true if inventory was successfully added
     * @param amtCoffee
     * @param amtMilk
     * @param amtSugar
     * @param amtChocolate
    
     * @return boolean */
    public boolean addInventory(int amtCoffee, int amtMilk, int amtSugar, int amtChocolate) {
        boolean canAddInventory = true;
        if(amtCoffee < 0 || amtMilk < 0 || amtSugar > 0 || amtChocolate < 0) { 
            canAddInventory = false;
        }
        else {
	        inventory.setCoffee(inventory.getCoffee() + amtCoffee);
	        inventory.setMilk(inventory.getMilk() + amtMilk);
	        inventory.setSugar(inventory.getSugar() + amtSugar);
	        inventory.setChocolate(inventory.getChocolate() + amtChocolate);
        }
        return canAddInventory;
    }
    
    /**
     * Returns the inventory of the coffee maker
    
     * @return Inventory */
    public Inventory checkInventory() {
        return inventory;
    }
    
    /**
     * Returns the change of a user's beverage purchase, or
     * the user's money if the beverage cannot be made
     * @param r
     * @param amtPaid
    
     * @return int */
    public int makeCoffee(Recipe r, int amtPaid) {
        return inventory.makeCoffee(r, amtPaid);
    }

    /**
     * Returns an array of all the recipes
    
     * @return Recipe[] */
    public Recipe[] getRecipes() {
        return coffeeMakerProduct.getRecipeArray();
    }

    /**
     * Returns the Recipe associated with the given name
     * @param name
    
     * @return Recipe */
	public Recipe getRecipeForName(String name) {
		return coffeeMakerProduct.getRecipeForName(name);
	}
}
