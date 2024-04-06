package AdapterDesignPattern;

    public class Main {

            public static void main(String[] args){

                WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
                System.out.println(weightMachineAdapter.getWeightInKg());
            }
    }