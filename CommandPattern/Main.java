package CommandPattern;

import CommandPattern.AirCondition;
import CommandPattern.Invoker;
import CommandPattern.TurnAcOnCommand;
import CommandPattern.TurnAcOffCommand;

        public class Main {
            public static void main(String[] args){

                AirCondition airCondition = new AirCondition();

                Invoker invoker = new Invoker();

                invoker.setAcCommand(new TurnAcOnCommand(airCondition));
                invoker.pressButton();
            }
        }