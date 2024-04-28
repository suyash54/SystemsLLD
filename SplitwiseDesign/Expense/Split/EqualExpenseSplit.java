package DesignSystems.SplitwiseDesign.Expense.Split;

import java.util.*;

public class EqualExpenseSplit implements ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList,double totalAmount){
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split split: splitList){
            if(split.getAmountOwe() != amountShouldBePresent){
                // throw exception
            }
        }
    }
}