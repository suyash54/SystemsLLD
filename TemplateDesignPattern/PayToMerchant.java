package TemplateDesignPattern;

public class PayToMerchant extends PaymentFlow {

    public void validateRequest(){
        System.out.println("Validate logic of pay to merchant");
    }

    public void debitAmount(){
        System.out.println("Debit the amount logic of pay to merchant");
    }

    public void calculateFees(){
        System.out.println("2%  Fee charged");
    }

    public void creditAmount(){
        System.out.println("Credit the amount logic of pay to merchant");
    }
}