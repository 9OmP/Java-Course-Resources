public class Smart_Kitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private Coffee_Maker brewMaster;

    public Smart_Kitchen() {
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.brewMaster = new Coffee_Maker() ;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Coffee_Maker getBrewMaster() {
        return brewMaster;
    }

    public void doKitchenWork(){
        getIceBox().orderFood();
        getDishWasher().doDishes();
        getBrewMaster().brewCoffee();
    }

    public void setKitchenState(boolean hasOrders, boolean needToWash, boolean needToBrew){
        getIceBox().setHasWorkToDo(hasOrders);
        getDishWasher().setHasWorkToDo(needToWash);
        getBrewMaster().setHasWorkToDo(needToBrew);
    }

}
