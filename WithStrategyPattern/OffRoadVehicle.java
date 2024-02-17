package WithStrategyPattern;

import WithStrategyPattern.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
           public OffRoadVehicle() { super (new SportsDriveStrategy());}
}