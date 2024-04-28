package DesignSystems.SplitwiseDesign;

import java.util.*;


public class UserExpenseBalanceSheet {

    Map<String,Balance> userVsBalance;

    double totalYourExpense;
    double totalYouOwe;
    double totalPayment;
    double totalYouGetBack;

    public UserExpenseBalanceSheet(){

        userVsBalance = new HashMap<>();
        totalYourExpense = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYourExpense(double totalYourExpense){
        this.totalYourExpense = totalYourExpense;
    }

    public void setTotalYouOwe(double totalYouOwe){
        this.totalYouOwe = totalYouOwe;
    }

    public void setTotalYouGetBack(double totalYouGetBack){
        this.totalYouGetBack = totalYouGetBack;
    }

    public void setTotalPayment(double totalPayment){
        this.totalPayment = totalPayment;
    }
}