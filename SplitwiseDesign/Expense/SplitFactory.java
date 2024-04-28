package DesignSystems.SplitwiseDesign.Expense;

import java.util.*;

import DesignSystems.SplitwiseDesign.Expense.Split.EqualExpenseSplit;
import DesignSystems.SplitwiseDesign.Expense.Split.ExpenseSplit;
import DesignSystems.SplitwiseDesign.Expense.Split.PercentageExpenseSplit;
import DesignSystems.SplitwiseDesign.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType){

        switch(splitType){
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }

}