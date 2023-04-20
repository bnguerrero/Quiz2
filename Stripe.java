package Quiz2;

public class Stripe 
{
    private double paymentAmount; 
    private String cardholderName;
    private String cardNumber;
    private String experationDate;

    public Stripe(double paymentAmount, String cardholderName, String cardNumber, String experationDate)
    {
        this.paymentAmount = paymentAmount;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.experationDate = experationDate;
    }

    public void stripeTransaction(double paymentAmount, String cardholderName, String cardNumber, String experationDate)
    {
        System.out.println("Payment amount: " + this.paymentAmount + "Cardholder Name " + this.cardholderName + "Card number: " + this.cardNumber + "Experation date: " + this.experationDate);
    }
}
