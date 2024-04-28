package DesignSystems.SplitwiseDesign.Expense.Split;

import DesignSystems.SplitwiseDesign.User.User;

import java.util.*;

public class Split{

    User user;
    double amountOwe;

    public Split(User user, double amountOwe){
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public User getUser(){
        return user;
    }

    public double getAmountOwe(){
        return amountOwe;
    }

}