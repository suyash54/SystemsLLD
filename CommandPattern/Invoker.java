package CommandPattern;

import CommandPattern.Command;

        public class Invoker {
            Command acCommand;

            public void setAcCommand(Command acCommand){
                this.acCommand = acCommand;
            }

            public void pressButton(){
                acCommand.execute();
            }
        }
