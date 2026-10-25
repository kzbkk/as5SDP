public class SubscriptionContext {
    private SubscriptionStrategy strategy;
    public SubscriptionContext(SubscriptionStrategy strategy) {
        setStrategy(strategy);
    }
    public void setStrategy(SubscriptionStrategy strategy) {
        if (strategy == null) {throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }
    public double calculatePrice(Subscription subscription) {
        return strategy.calculatePrice(subscription);
    }
}