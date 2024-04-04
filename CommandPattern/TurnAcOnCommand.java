package CommandPattern;

import CommandPattern.AirCondition;

        public class TurnAcOnCommand implements Command {
            AirCondition ac;

            public TurnAcOnCommand(AirCondition ac){
                this.ac = ac;
            }

            public void execute(){
                ac.turnOnAc();
            }
        }