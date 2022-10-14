package app.service;

import java.util.ArrayList;
import java.util.UUID;

import app.model.Item;
import app.repository.dbExec;

public class Menu {

    public static boolean isLoaded = false;

    public static final Item classicHamburger = 
                    new Item(UUID.randomUUID(), "Classic Hamburger", UUID.fromString(""), 100, 6.49);

    public static final Item blackBeanBurger = 
                    new Item(UUID.randomUUID(), "Black Bean Hamburger", UUID.fromString(""), 100, 7.29);


    public static final Item baconBurger = 
                    new Item(UUID.randomUUID(), "Bacon Burger", UUID.fromString(""), 100, 7.89);

    
    public static final Item chickenSandwich = 
                    new Item(UUID.randomUUID(), "Chicken Sanndwich", UUID.fromString(""), 100, 7.49);


    public static final Item gigEmPattyMelt = 
                    new Item(UUID.randomUUID(), "Gig Em Patty Melt", UUID.fromString(""), 100, 7.09);
        


    public static final Item chickenTenders = 
                    new Item(UUID.randomUUID(), "Chicken Tenders", UUID.fromString(""), 100, 7.49);
    


    public static final Item caesarSalad = 
                    new Item(UUID.randomUUID(), "Caesar Salad", UUID.fromString(""), 100, 8.29);



    public static final Item frenchFries = 
                    new Item(UUID.randomUUID(), "French Fries", UUID.fromString(""), 100, 2.69);


    public static final Item vanillaAggieShake = 
                    new Item(UUID.randomUUID(), "Vanilla Aggie Shake", UUID.fromString(""), 100, 4.49);


    public static final Item chocolateAggieShake = 
                    new Item(UUID.randomUUID(), "Chocolate Aggie Shake", UUID.fromString(""), 100, 4.49);


    public static final Item strawberryAggieShake = 
                    new Item(UUID.randomUUID(), "Strawberry Aggie Shake", UUID.fromString(""), 100, 4.49);

    
    public static final Item cookieSandwich = 
                    new Item(UUID.randomUUID(), "Cookie Sandwich", UUID.fromString(""), 100, 4.69);
    
                    
    public static final Item pepsi = 
                    new Item(UUID.randomUUID(), "Pepsi", UUID.fromString(""), 100, 2.45);


    public static final Item dietPepsi = 
                    new Item(UUID.randomUUID(), "Diet Pepsi", UUID.fromString(""), 100, 2.45);

                    
    public static final Item vanillaIce = 
                    new Item(UUID.randomUUID(), "Vanilla Ice Cream Cup", UUID.fromString(""), 100, 3.29);
    
    
    public static final Item chocolateIce = 
                    new Item(UUID.randomUUID(), "Chocolate Ice Cream Cup", UUID.fromString(""), 100, 3.29);

    
    public static final Item strawberryIce = 
                    new Item(UUID.randomUUID(), "Strawberry Ice Cream Cup", UUID.fromString(""), 100, 3.29);


    public static final Item ranchSauce = 
                    new Item(UUID.randomUUID(), "Ranch Sauce", UUID.fromString(""), 100, 0);


    public static final Item bbqSauce = 
                    new Item(UUID.randomUUID(), "BBQ Sauce", UUID.fromString(""), 100, 0);


    public static final Item honeyMustardSauce = 
                    new Item(UUID.randomUUID(), "Honey Mustard Sauce", UUID.fromString(""), 100, 0);


    public static final Item spicyRanchSauce = 
                    new Item(UUID.randomUUID(), "Spicy Ranch Sauce", UUID.fromString(""), 100, 0);

    
    public static final Item gleEmSauce = 
                    new Item(UUID.randomUUID(), "Gle em Sauce", UUID.fromString(""), 100, 0);

    public static final Item spoons = 
                    new Item(UUID.randomUUID(), "Spoons", UUID.fromString(""), 100, 0);

    public static final Item forks = 
                    new Item(UUID.randomUUID(), "Forks", UUID.fromString(""), 100, 0);

    public static final Item knives = 
                    new Item(UUID.randomUUID(), "Knives", UUID.fromString(""), 100, 0);
    public static final Item plates = 
                    new Item(UUID.randomUUID(), "Plates", UUID.fromString(""), 100, 0);
    public static final Item cups = 
                    new Item(UUID.randomUUID(), "Cups", UUID.fromString(""), 100, 0);
    public static final Item tissues = 
                    new Item(UUID.randomUUID(), "Tissues", UUID.fromString(""), 100, 0);

    public static void addIngredients() {
        classicHamburger.addIngredient(Inventory.beefPatty);
        classicHamburger.addIngredient(Inventory.buns);
        classicHamburger.addIngredient(Inventory.avocado);
        blackBeanBurger.addIngredient(Inventory.blackBeanPatty);
        baconBurger.addIngredient(Inventory.bacon);
        chickenSandwich.addIngredient(Inventory.chickenBreast);
        gigEmPattyMelt.addIngredient(Inventory.gigEmSauce);
        gigEmPattyMelt.addIngredient(Inventory.swissCheese);
        gigEmPattyMelt.addIngredient(Inventory.onion);
        caesarSalad.addIngredient(Inventory.lettuce);
        caesarSalad.addIngredient(Inventory.grilledChicken);
        caesarSalad.addIngredient(Inventory.parmesan);
        caesarSalad.addIngredient(Inventory.garlic);
        caesarSalad.addIngredient(Inventory.butter);
        caesarSalad.addIngredient(Inventory.croutons);
        caesarSalad.addIngredient(Inventory.caesarDressing);
        chickenTenders.addIngredient(Inventory.chickenTenders);
        chickenTenders.addIngredient(Inventory.frenchFries);
        frenchFries.addIngredient(Inventory.frenchFries);
        vanillaAggieShake.addIngredient(Inventory.vanillaIce);
        chocolateAggieShake.addIngredient(Inventory.chocolateIce);
        strawberryAggieShake.addIngredient(Inventory.strawberryIce);
        cookieSandwich.addIngredient(Inventory.chocolateChip);
        pepsi.addIngredient(Inventory.pepsi);
        dietPepsi.addIngredient(Inventory.dietPepsi);
        vanillaIce.addIngredient(Inventory.vanillaIce);
        chocolateIce.addIngredient(Inventory.chocolateIce);
        strawberryIce.addIngredient(Inventory.strawberryIce);
        ranchSauce.addIngredient(Inventory.ranchSauce);
        bbqSauce.addIngredient(Inventory.bbqSauce);
        honeyMustardSauce.addIngredient(Inventory.honeyMustardSauce);
        spicyRanchSauce.addIngredient(Inventory.spicyRanchSauce);
        gleEmSauce.addIngredient(Inventory.gleEmSauce);
        spoons.addIngredient(Inventory.spoons);
        forks.addIngredient(Inventory.forks);
        knives.addIngredient(Inventory.knives);
        plates.addIngredient(Inventory.plates);
        cups.addIngredient(Inventory.cups);
        tissues.addIngredient(Inventory.tissues);
    }

	public static final ArrayList<Item> list = new ArrayList<Item>();
	public static void addItemsToMenu() {

		if (!dbExec.isMenuEmpty()) {
			return;
		}
		list.add(classicHamburger);
		list.add(blackBeanBurger);
		list.add(baconBurger);
		list.add(chickenSandwich);
		list.add(gigEmPattyMelt);
		list.add(chickenTenders);
		list.add(caesarSalad);
		list.add(frenchFries);
		list.add(vanillaAggieShake);
		list.add(chocolateAggieShake);
		list.add(strawberryAggieShake);
		list.add(cookieSandwich);
		list.add(pepsi);
		list.add(dietPepsi);
		list.add(vanillaIce);
		list.add(chocolateIce);
        list.add(strawberryIce);
        list.add(ranchSauce);
        list.add(bbqSauce);
        list.add(honeyMustardSauce);
        list.add(spicyRanchSauce);
        list.add(gleEmSauce);
        list.add(spoons);
        list.add(forks);
        list.add(knives);
        list.add(plates);
        list.add(cups);
        list.add(tissues);

		for (Item item : list) {
			dbExec.addItemToMenu(item);
		}
	}
                    

}