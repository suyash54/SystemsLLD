package TemplateDesignPattern;


        public class Main {

             public static void main(String[] args){

                 PaymentFlow paymentFlow = new PayToFriend();
                 paymentFlow.sendMoney();
             }
        }