// $codepro.audit.disable appendString, platformSpecificLineSeparator
package edu.towson.cis.cosc442.examples.coffeemaker;

/**
 * Inventory for the coffee maker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Inventory {
    
    private static int coffee;
    private static int milk;
    private static int sugar;
    private static int chocolate;
    
    public Inventory() {
    	setCoffee(15);
    	setMilk(15);
    	setSugar(15);
    	setChocolate(15);
    }
    
    /**
     * Method getChocolate.
     * @return int
     */
    public int getChocolate() {
        return chocolate;
    }
    /**
     * Method setChocolate.
     * @param chocolate int
     */
    public void setChocolate(int chocolate) {
    	if(chocolate >= 0) {
    		Inventory.chocolate = chocolate;
    	}
    	else {
    		Inventory.chocolate = 0;
    	}
        
    }
    /**
     * Method getCoffee.
     * @return int
     */
    public int getCoffee() {
        return coffee;
    }
    /**
     * Method setCoffee.
     * @param coffee int
     */
    public void setCoffee(int coffee) {
    	if(coffee >= 0) {
    		Inventory.coffee = coffee;
    	}
    	else {
    		Inventory.coffee = 0;
    	}
    }
    /**
     * Method getMilk.
     * @return int
     */
    public int getMilk() {
        return milk;
    }
    /**
     * Method setMilk.
     * @param milk int
     */
    public void setMilk(int milk) {
    	if(milk >= 0) {
    		Inventory.milk = milk;
    	}
    	else {
    		Inventory.milk = 0;
    	}
    }
    /**
     * Method getSugar.
     * @return int
     */
    public int getSugar() {
        return sugar;
    }
    /**
     * Method setSugar.
     * @param sugar int
     */
    public void setSugar(int sugar) {
    	if(sugar >= 0) {
    		Inventory.sugar = sugar;
    	}
    	else {
    		Inventory.sugar = 0;
    	}
    }
    
    /**
     * Returns true if there are enough ingredients to make
     * the beverage.
     * @param r
    
     * @return boolean */
    public boolean enoughIngredients(Recipe r) {
        boolean isEnough = true;
        if(Inventory.coffee < r.getAmtCoffee()) {
            isEnough = false;
        }
        if(Inventory.milk < r.getAmtMilk()) {
            isEnough = false;
        }
        if(Inventory.sugar < r.getAmtSugar()) {
            isEnough = false;
        }
        if(Inventory.chocolate < r.getAmtChocolate()) {
            isEnough = false;
        }
        return isEnough;
    }
    
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
    	StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Coffee: ");
		stringBuilder.append(getCoffee());
		stringBuilder.append("Milk: ");
		stringBuilder.append(getMilk());
		stringBuilder.append("\n");
		stringBuilder.append("Sugar: ");
		stringBuilder.append(getSugar());
	    stringBuilder.append("\n"); // $codepro.audit.disable platformSpecificLineSeparator
		stringBuilder.append("Chocolate: ");
		stringBuilder.append(getChocolate());
		stringBuilder.append("\n"); // $codepro.audit.disable platformSpecificLineSeparator
		return stringBuilder.toString();
    }

	/**
	 * Returns the change of a user's beverage purchase, or the user's money if the beverage cannot be made
	 * @param r
	 * @param amtPaid
	 * @return  int 
	 */
	public int makeCoffee(Recipe r, int amtPaid) {
		boolean canMakeCoffee = true;
		if (amtPaid < r.getPrice()) {
			canMakeCoffee = false;
		}
		if (!enoughIngredients(r)) {
			canMakeCoffee = false;
		}
		if (canMakeCoffee) {
			setCoffee(getCoffee() + r.getAmtCoffee());
			setMilk(getMilk() - r.getAmtMilk());
			setSugar(getSugar() - r.getAmtSugar());
			setChocolate(getChocolate() - r.getAmtChocolate());
			return amtPaid - r.getPrice();
		} else {
			return amtPaid;
		}
	}
}
