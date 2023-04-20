package Quiz2;

public class Driver 
{
    public static void main(String[] args) 
    {

        PaymentInterface paypalGateway = new PaypalAdapter(new Paypal(200.0, "bnguerrero@cpp.edu"));
        printPayment(paypalGateway);
        

        PaymentInterface stripeGateway = new StripeAdapter(new Stripe(15.00, "Brianne Guerrero", "8675309", "04/01/1989"));
        printPayment(stripeGateway);
    }


    public static void printPayment(PaymentInterface payment) 
    { 
           payment.paymentTransaction();
    } 
}
