package AdapterDesignPattern;

    public class WeightMachineAdapterImpl implements WeightMachineAdapter{

            WeightMachine weightMachine;

            public WeightMachineAdapterImpl(WeightMachine weightMachine){ this.weightMachine = weightMachine; }

            public double getWeightInKg(){

                double weightInPound = weightMachine.getWeightInPound();

                double weightInKg = weightInPound * .45;
                return weightInKg;
            }
    }