public class Subscription {
    private final String name;
    private final int months;
    public Subscription(String name, int months) {
        if (months <= 0) {
            throw new IllegalArgumentException("Months must be greater than zero");
        }
        this.name = name;
        this.months = months;
    }
    public String getName() {
        return name;
    }
    public int getMonths() {
        return months;
    }
}