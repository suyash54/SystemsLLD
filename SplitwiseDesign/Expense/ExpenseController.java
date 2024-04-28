package DesignSystems.SplitwiseDesign.Expense;

import java.util.*;

import DesignSystems.SplitwiseDesign.BalanceSheetController;
import DesignSystems.SplitwiseDesign.Expense.SplitFactory;
import DesignSystems.SplitwiseDesign.Expense.Expense;
import DesignSystems.SplitwiseDesign.Expense.ExpenseSplitType;
import DesignSystems.SplitwiseDesign.User.User;
import DesignSystems.SplitwiseDesign.Expense.Split.ExpenseSplit;
import DesignSystems.SplitwiseDesign.Expense.Split.Split;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public  Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}