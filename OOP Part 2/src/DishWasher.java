public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Doing dishes now.");
            this.hasWorkToDo = false;
        } else{
            System.out.println("No pending dishes.");
        }
    }
}
