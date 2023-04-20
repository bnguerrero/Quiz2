package Quiz2;

public class StripeAdapter implements PaymentInterface
{
    Stripe stripeGateway;

    public StripeAdapter( Stripe stripeGateway)
    {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void paymentTransaction() 
    {
        stripeGateway.stripeTransaction();
    }
}
