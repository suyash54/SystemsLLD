package DesignSystems.SplitwiseDesign;

import java.util.*;

import DesignSystems.SplitwiseDesign.Expense.Split.Split;
import DesignSystems.SplitwiseDesign.User.User;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount){

        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

        for(Split split: splits){

            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseSheet = userOwe.getUserExpenseBalanceSheet();
            double amountOwe = split.getAmountOwe();

            if(expensePaidBy.getUserId().equals(userOwe.getUserId())){
                    paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + amountOwe);
            }
            else{
                    paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + amountOwe);

                    Balance userOweBalance;
                    if(paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())){
                        userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
                    }
                    else{
                        userOweBalance = new Balance();
                        paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(), userOweBalance);
                    }

                    userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + amountOwe);

                    oweUserExpenseSheet.setTotalYouOwe(oweUserExpenseSheet.getTotalYouOwe() + amountOwe);
                    oweUserExpenseSheet.setTotalYourExpense(oweUserExpenseSheet.getTotalYourExpense() + amountOwe);

                    Balance userPaidBalance;

                    if(oweUserExpenseSheet.getUserVsBalance().containsKey(expensePaidBy.getUserId())){
                        userPaidBalance = oweUserExpenseSheet.getUserVsBalance().get(expensePaidBy.getUserId());
                    }
                    else{
                        userPaidBalance = new Balance();
                        oweUserExpenseSheet.getUserVsBalance().put(expensePaidBy.getUserId(), userPaidBalance);
                    }

                    userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + amountOwe);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("-------------------------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("Total Your Expense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("Total You Get Back: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("Total You Owe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("Total Your Payment: " + userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<String, Balance> entry: userExpenseBalanceSheet.getUserVsBalance().entrySet()){

            String userId = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + user.getUserId() + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");
    }
}