public class StudentSubscriptionStrategy implements SubscriptionStrategy {
    private static final double MONTHLY_PRICE = 2000;
    private static final double DISCOUNT = 0.5;
    @Override
    public double calculatePrice(Subscription subscription) {
        return MONTHLY_PRICE * subscription.getMonths() * DISCOUNT;
    }
}