public class SubscriptionService {
    private final SubscriptionContext context;
    public SubscriptionService(SubscriptionContext context) {
        this.context = context;
    }
    public void showSubscription(Subscription subscription) {
        double price = context.calculatePrice(subscription);

        System.out.println("Subscription: "+ subscription.getName());
        System.out.println("Duration: " + subscription.getMonths() + " months");
        System.out.printf("Total price: %.2f KZT%n", price);
        System.out.println("-------------------------");
    }
}