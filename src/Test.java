public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("Jassi",10000);
        Supervisor supervisor = new Supervisor("Tasnim",15000,"Rajshahi");
        Director director = new Director("Sristy",20000,"Dhaka","East");
        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
