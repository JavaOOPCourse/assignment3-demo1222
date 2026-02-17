public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customer " + getName() + " does NOT have permission to manage " + s.getServiceName());
    }

    @Override
    public void useService(Service s) {
        if (s.isActive()) {
            System.out.println("Customer " + getName() + " is using " + s.getServiceName());
            s.performService();
        } else {
            System.out.println("Cannot use " + s.getServiceName() + ". It is currently inactive.");
        }
    }
}