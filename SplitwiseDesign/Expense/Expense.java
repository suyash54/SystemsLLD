package DesignSystems.SplitwiseDesign.Expense;

import DesignSystems.SplitwiseDesign.Expense.Split.Split;
import DesignSystems.SplitwiseDesign.User.User;

import java.util.*;


public class Expense {
    String expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseId, double expenseAmount, String description, User paidByUser,
                   ExpenseSplitType splitType, List<Split> splitDetails){

        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);
    }
}