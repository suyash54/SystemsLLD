package NullDesignPattern;

    public class VehicleFactory {

       public static Vehicle getVehicleObject(String typeOfVehicle) {
          if ("Car".equals(typeOfVehicle)) {
              return new Car();
          }

          return new NullVehicle();
      }
}