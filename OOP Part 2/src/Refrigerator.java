public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food now.");
            this.hasWorkToDo = false;
        } else{
            System.out.println("No pending Food orders.");
        }
    }
}
