public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int curremt_year = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return curremt_year - birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
