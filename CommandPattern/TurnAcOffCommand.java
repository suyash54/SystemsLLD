package CommandPattern;

import CommandPattern.AirCondition;

public class TurnAcOffCommand implements Command {
    AirCondition ac;

    TurnAcOffCommand(AirCondition ac){
        this.ac = ac;
    }

    public void execute(){
        ac.turnOffAc();
    }
}