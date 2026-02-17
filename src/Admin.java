public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin " + getName() + " is managing " + s.getServiceName());
        // For example, toggling service status
        if (s.isActive()) {
            System.out.println("Service " + s.getServiceName() + " is currently ACTIVE.");
        } else {
            System.out.println("Service " + s.getServiceName() + " is currently INACTIVE.");
        }
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin " + getName() + " is accessing " + s.getServiceName());
        s.performService();
    }
}