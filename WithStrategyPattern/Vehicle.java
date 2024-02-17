package WithStrategyPattern;


        import WithStrategyPattern.DriveStrategy;

                public class Vehicle {
                   DriveStrategy driveObject;
                   Vehicle(DriveStrategy driveObj){
                       this.driveObject = driveObj;
                   }

                   public void drive(){
                       driveObject.drive();
                   }
}