package DesignSystems.SplitwiseDesign.Group;

import java.util.*;

import DesignSystems.SplitwiseDesign.Expense.Expense;
import DesignSystems.SplitwiseDesign.Expense.ExpenseSplitType;
import DesignSystems.SplitwiseDesign.Expense.ExpenseController;
import DesignSystems.SplitwiseDesign.Expense.Split.Split;
import DesignSystems.SplitwiseDesign.User.User;

public class Group {

    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;

     ExpenseController expenseController;

    Group(){
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId){
        this.groupId = groupId;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType expenseSplitType, User paidByUser){
        Expense expense = expenseController.createExpense(expenseId,description,expenseAmount,splitDetails,expenseSplitType,paidByUser);
        expenseList.add(expense);
        return expense;
    }
}