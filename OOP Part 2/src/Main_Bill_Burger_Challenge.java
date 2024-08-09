public class Main_Bill_Burger_Challenge {

    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("topping", "avocado", 1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addExtraToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

        Meal_Order mealOrder = new Meal_Order();
        mealOrder.addBurgerToppings("BACON", "CHEESE","HAM");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemizedList();

    }

}
