public class ConsultationService extends Service
        implements Billable {

    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Consultation service " + getServiceName() + " is inactive.");
            return;
        }

        System.out.println("Starting online consultation session on " + getServiceName() + ".");
    }

    @Override
    public void generateBill() {
        System.out.println("Consultation bill for " + getServiceName() + ": $50 per session.");
    }
}