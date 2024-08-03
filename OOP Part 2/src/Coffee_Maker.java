public class Coffee_Maker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee now.");
            this.hasWorkToDo = false;
        } else{
            System.out.println("No pending Coffee order.");
        }
    }

}
