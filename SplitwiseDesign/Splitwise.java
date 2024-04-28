package DesignSystems.SplitwiseDesign;

import java.util.*;

import DesignSystems.SplitwiseDesign.User.User;
import DesignSystems.SplitwiseDesign.User.UserController;
import DesignSystems.SplitwiseDesign.Group.GroupController;
import DesignSystems.SplitwiseDesign.Expense.ExpenseSplitType;
import DesignSystems.SplitwiseDesign.Expense.Split.Split;
import DesignSystems.SplitwiseDesign.Group.Group;


public class Splitwise {

    UserController userController;
    GroupController groupController;

    BalanceSheetController balanceSheetController;

    Splitwise(){
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo(){

        setUpUserAndGroup();

        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"),300);
        Split split2 = new Split(userController.getUser("U2001"),300);
        Split split3 = new Split(userController.getUser("U3001"),300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001","Breakfast",900,splits,ExpenseSplitType.EQUAL,userController.getUser("U1001"));

        List<Split> splits2 = new ArrayList<>();
        Split split2_1 = new Split(userController.getUser("U1001"),400);
        Split split2_2 = new Split(userController.getUser("U2001"),100);
        splits2.add(split2_1);
        splits2.add(split2_2);
        group.createExpense("Exp1002","Lunch",500,splits,ExpenseSplitType.UNEQUAL,userController.getUser("U2001"));

        for(User user: userController.getAllUsers()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    public void setUpUserAndGroup(){

        //onboard user to splitwise app
        addUsersToSplitwiseApp();

        //create a group by user1
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001", "Outing with Friends", user1);
    }

    private void addUsersToSplitwiseApp(){

        //adding User1
        User user1 = new User("U1001", "User1");

        //adding User2
        User user2 = new User ("U2001", "User2");

        //adding User3
        User user3 = new User ("U3001", "User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
