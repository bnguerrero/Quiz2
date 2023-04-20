package Quiz2;

public class Paypal 
{
    private double paymentAmount;
    private String userEmail;

    public Paypal(double paymentAmount, String userEmail)
    {
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    public void paypalTransaction()
    {
        System.out.println("User email: " + this.userEmail + " Payment amount: " + this.paymentAmount);
    }
}
