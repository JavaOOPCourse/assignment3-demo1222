public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Cloud storage " + getServiceName() + " is inactive.");
            return;
        }

        System.out.println(
                "Accessing files on " + getServiceName() + ". Storage limit: " + (isPremium ? "Unlimited" : "10GB"));
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " storage limit upgraded to Unlimited!");
    }

    @Override
    public void generateBill() {
        int cost = isPremium ? 15 : 0;
        System.out.println("Monthly bill for " + getServiceName() + ": $" + cost);
    }
}