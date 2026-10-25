public class PremiumSubscriptionStrategy implements SubscriptionStrategy {
    private static final double MONTHLY_PRICE = 5000;
    private static final double YEARLY_DISCOUNT = 0.1;
    private static final int YEARLY_MONTHS = 12;
    @Override
    public double calculatePrice(Subscription subscription) {
        double totalPrice = MONTHLY_PRICE * subscription.getMonths();
        if (subscription.getMonths() >= YEARLY_MONTHS) {
            totalPrice *= (1 - YEARLY_DISCOUNT);
        }
        return totalPrice;
    }
}