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
        System.out.println(emp1);
        System.out.println(emp1.getAge());
        System.out.println("Paycheck: $" + emp1.collectPay());

        emp1.retire();
        System.out.println("Pension Paycheck : $" + emp1.collectPay());

        System.out.println("-------------------------------");

        Hourly_Employee emp2 = new Hourly_Employee("Shivani", "07/08/1999", "12/08/2001", 15);
        System.out.println(emp2);
        System.out.println(emp2.getAge());
        System.out.println("Normal Paycheck: $" + emp2.collectPay());
        System.out.println("Holiday Paycheck: $" + emp2.getDoublePay());

    }

}
