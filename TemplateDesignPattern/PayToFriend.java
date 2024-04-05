package TemplateDesignPattern;

        public class PayToFriend extends PaymentFlow {

            public void validateRequest(){
                System.out.println("Validate logic of pay to friend");
            }

            public void debitAmount(){
                System.out.println("Debit the amount logic of pay to friend");
            }

            public void calculateFees(){
                System.out.println("0 Rs. Fee charged");
            }

            public void creditAmount(){
                System.out.println("Credit the amount logic of pay to friend");
            }
        }