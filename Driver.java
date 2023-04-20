package Quiz2;

public class Driver 
{
    public static void main(String[] args) 
    {

        PaymentInterface paypalGateway = new PaypalAdapter(new Paypal(200.0, "bnguerrero@cpp.edu"));
        printPayment(paypalGateway);
        
    }

    public static void printPayment(PaymentInterface payment) 
    { 
           payment.paymentTransaction();
    } 
}
