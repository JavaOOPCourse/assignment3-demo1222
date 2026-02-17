public abstract class Service {
    private String serviceName;
    private int serviceId;
    private boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        this.isActive = true;
        System.out.println("Service " + serviceName + " (ID: " + serviceId + ") has been activated.");
    }

    public void deactivateService() {
        this.isActive = false;
        System.out.println("Service " + serviceName + " has been deactivated.");
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public abstract void performService();
}