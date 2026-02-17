public class StreamingService extends Service
        implements PremiumFeature {

    private boolean isPremium;

    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Streaming service " + getServiceName() + " is inactive.");
            return;
        }

        if (isPremium) {
            System.out.println("Streaming high-quality 4K content on " + getServiceName() + " (Premium Active).");
        } else {
            System.out.println("Streaming standard quality content on " + getServiceName() + ".");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println(getServiceName() + " has been upgraded to Premium!");
    }
}