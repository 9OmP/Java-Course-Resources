public class Meal_Order {

    private Item side;
    private Item drink;
    private Burger burger;

    public Meal_Order() {
        this("regular", "coke", "fries");
    }

    public Meal_Order(String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addExtraToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
