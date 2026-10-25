public class BasicSubscriptionStrategy implements SubscriptionStrategy {
    private static final double MONTHLY_PRICE = 2000;
    @Override
    public double calculatePrice(Subscription subscription) {
        return MONTHLY_PRICE*subscription.getMonths();
    }
}