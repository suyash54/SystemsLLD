package MementoDesignPattern;

import MementoDesignPattern.ConfigurationOriginator;
import MementoDesignPattern.ConfigurationCareTaker;

        public class Client{
            public static void main(String[] args){

                ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
                ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,10);

                ConfigurationMemento snapshot1 = originatorObject.createMemento();

                careTakerObject.addMemento(snapshot1);

                originatorObject.setHeight(13);
                originatorObject.setWidth(15);

                ConfigurationMemento snapshot2 = originatorObject.createMemento();

                careTakerObject.addMemento(snapshot2);

                originatorObject.setHeight(7);
                originatorObject.setWidth(14);

                ConfigurationMemento restoredStateMementoObj = careTakerObject.undo();
                originatorObject.restoreMemento(restoredStateMementoObj);

                System.out.println("height is: " + originatorObject.getHeight() + "widht is: " + originatorObject.getWidth());
            }
        }