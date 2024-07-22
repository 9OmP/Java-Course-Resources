public class Workers_Main {

    public static void main(String[] args) {
        Worker worker = new Worker("Om", "16/02/2002");
        System.out.println(worker);
        System.out.println(worker.getAge());

        System.out.println("-------------------------------");

        Employee employee = new Employee("Prashant", "25/02/1972", "12/08/2001");
        System.out.println(employee);
        System.out.println(employee.getAge());
        System.out.println(employee.collectPay());

        System.out.println("-------------------------------");

        SalariedEmployee emp1 = new SalariedEmployee("Rajeshree", "07/12/1977", "12/08/2001", 15000);
        System.out.println(employee);
        System.out.println(employee.getAge());
        System.out.println(employee.collectPay());

    }

}
