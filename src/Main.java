public class Main {
    public static void main(String[] args) {
        SubscriptionContext context = new SubscriptionContext(new BasicSubscriptionStrategy());

        SubscriptionService service = new SubscriptionService(context);
        Subscription basic = new Subscription("Basic", 3);
        service.showSubscription(basic);

        context.setStrategy(new StudentSubscriptionStrategy());
        Subscription student = new Subscription("Student", 3);
        service.showSubscription(student);

        context.setStrategy(new PremiumSubscriptionStrategy());
        Subscription premium = new Subscription("Premium", 12);
        service.showSubscription(premium);
    }
}