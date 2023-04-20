package Quiz2;

public class PaypalAdapter implements PaymentInterface
{
    Paypal paypalGateway;

    public PaypalAdapter(Paypal paypalGateway)
    {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void paymentTransaction() 
    {
        paypalGateway.paypalTransaction();
    }

}
