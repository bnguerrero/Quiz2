package Quiz2;

public interface StripeInterface 
{
    public double stripeTransaction(double paymentAmount, String cardholderName, String cardNumber, String experationDate);
}
