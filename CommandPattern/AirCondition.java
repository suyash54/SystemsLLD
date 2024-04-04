package CommandPattern;

        public class AirCondition {

            boolean isOn;
            int temperature;

            public void turnOnAc(){
                isOn = true;
                System.out.println("AC is turned on");
            }

            public void turnOffAc(){
                isOn = false;
                System.out.println("AC is turned off");
            }

            public void setTemperature(int temp){
                this.temperature = temp;
                System.out.println("Temperature changed to:" + temperature);
            }
        }