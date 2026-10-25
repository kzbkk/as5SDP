Subscription Management System
This project demonstrates the Strategy design pattern in Java.

Subscription Plans
- Basic — regular price.
- Student — 50% discount.
- Premium — 10% discount for subscriptions of 12 months or more.

Strategy Pattern
The program uses a common SubscriptionStrategy interface with three implementations. The SubscriptionContext can switch strategies at runtime and delegates price calculation to the selected strategy.

Clean Code Principles
1. Meaningful Names — class and method names clearly describe their purpose.
2. Single Responsibility — each strategy calculates the price for one subscription plan.
3. Polymorphism — strategies implement the same interface.
4. Low Coupling — the context works with the interface, not specific strategy classes.
5. Open/Closed Principle — new subscription strategies can be added without changing the existing strategies or context.

How to Run
Run Main.java to see the price calculations.

