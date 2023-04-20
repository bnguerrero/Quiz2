# Quiz2
Scenario:

You are developing a software application that needs to interact with different payment gateways (e.g.
PayPal, Stripe, Square, etc.). Each payment gateway has its own unique interface and set of methods to
perform payment transactions. To ensure that your application is flexible and scalable, you decide to use
the Adapter design pattern.

Solve the following problem using the Adapter design pattern.

HINT: What is consistent between all of them. What varies?
Problem:

## Part1: 

Your application needs to process payments using PayPal and Stripe payment gateways. The
PayPal gateway requires a payment amount and a user email address to process a payment, while the
Stripe gateway requires a payment amount, cardholder name, card number, and expiration date to
process a payment. Your application needs to be able to process payments using either gateway,
without having to change the payment processing code every time a new payment gateway is added.

### PAYPAL
paymentAmount

userEmail

### STRIPE
paymentAmount

cardholderName

cardNumber

expirationDate

## Part2: 

Now you wish to add the Square gateway which requires payment amount and location ID to
process

### SQUARE
paymentAmount

locationID

## Part 3: 

Create a driver to test your gateways
