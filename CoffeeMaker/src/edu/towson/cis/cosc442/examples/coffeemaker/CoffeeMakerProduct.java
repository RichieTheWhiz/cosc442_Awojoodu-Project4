package edu.towson.cis.cosc442.examples.coffeemaker;


public class CoffeeMakerProduct {
	private Recipe[] recipeArray;
	private final int NUM_RECIPES = 4;
	private boolean[] recipeFull;

	public Recipe[] getRecipeArray() {
		return recipeArray;
	}

	public void setRecipeArray(Recipe[] recipeArray) {
		this.recipeArray = recipeArray;
	}

	public int getNUM_RECIPES() {
		return NUM_RECIPES;
	}

	public boolean[] getRecipeFull() {
		return recipeFull;
	}

	public void setRecipeFull(boolean[] recipeFull) {
		this.recipeFull = recipeFull;
	}

	/**
	* Returns true if a recipe is successfully added to the  coffee maker
	* @param r
	* @return  boolean 
	*/
	public boolean addRecipe(Recipe r) {
		boolean canAddRecipe = true;
		for (int i = 0; i < NUM_RECIPES; i++) {
			if (r.equals(recipeArray[i])) {
				canAddRecipe = false;
			}
			if (canAddRecipe) {
			 int emptySpot = emptySpot();
//			for (int i = 0; i < NUM_RECIPES; i++) {
				if (!recipeFull[i]) {
					canAddRecipe = true;
				}
//			}
				if (emptySpot != -1) {
					recipeArray[emptySpot] = r;
				    recipeFull[emptySpot] = true;
			    } else {
				    canAddRecipe = false;
			    }
		 }
		}
		return canAddRecipe;
	}

	public int emptySpot() {
		int emptySpot = -1;
		for (int i = 0; i < NUM_RECIPES; i++) {
			if (!recipeFull[i]) {
				emptySpot = i;
			}
		}
		return emptySpot;
	}

	/**
	* Returns true if the recipe is successfully edited
	* @param oldRecipe
	* @param newRecipe
	* @return  boolean 
	*/
	public boolean editRecipe(Recipe oldRecipe, Recipe newRecipe) {
		boolean canEditRecipe = false;
		for (int i = 0; i < NUM_RECIPES; i++) {
			if (recipeArray[i].getName() != null) {
				if (newRecipe.equals(recipeArray[i])) {
					recipeArray[i] = new Recipe();
					if (addRecipe(newRecipe)) {
						canEditRecipe = true;
					} else {
						canEditRecipe = false;
					}
				}
			}
		}
		return canEditRecipe;
	}

	/**
	* Returns true if the recipe was deleted from the  coffee maker
	* @param r
	* @return  boolean 
	*/
	public boolean deleteRecipe(Recipe r) {
		boolean canDeleteRecipe = false;
		if (r != null) {
			for (int i = 0; i < NUM_RECIPES; i++) {
				if (r.equals(recipeArray[i])) {
					recipeArray[i] = this.recipeArray[i];
					canDeleteRecipe = true;
				}
			}
		}
		return canDeleteRecipe;
	}

	/**
	* Returns the Recipe associated with the given name
	* @param name
	* @return  Recipe 
	*/
	public Recipe getRecipeForName(String name) {
		Recipe r = new Recipe();
		for (int i = 0; i < NUM_RECIPES; i++) {
			if (recipeArray[i].getName() != null) {
				if ((recipeArray[i].getName()).equals(name)) {
					r = recipeArray[i];
				}
			}
		}
		return r;
	}
}