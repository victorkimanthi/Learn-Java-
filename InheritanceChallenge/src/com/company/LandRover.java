package com.company;

/*public class LandRover extends Car{
    private int changeGearButton;

    public LandRover(int engine, int doors, int steeringWheel, int gearLever, int wheels, int changeGearButton) {
        super(engine, doors, steeringWheel, gearLever, wheels);
        this.changeGearButton = changeGearButton;
    }

    @Override
    public void steering() {
        super.steering();
    }

    @Override
    public void changeGear() {
        super.changeGear();
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    @Override
    public void steerSteeringWheel() {
        super.steerSteeringWheel();
    }
    public void changeGearButton() {
        super.changeGearLever();
    }
    @Override
    public void changeGearLever() {
        changeGearButton();
        super.changeGearLever();
    }

    @Override
    public void moveWheels() {
        super.moveWheels();
    }
}*/
//**************************************************************************************************************

   public class LandRover extends Car {
     private int roadMonthServices;

       public LandRover( int roadMonthServices) {
           super("Land rover", "4wd", 4, 5, 5, false);
           this.roadMonthServices = roadMonthServices;
       }
       public void accelerate(int rate) {
           int newVelocity = getCurrentVelocity() + rate;
           if (newVelocity == 0) {
               stop();
               changeGear(1);
           } else if (newVelocity > 0 && newVelocity <= 10) {
               changeGear(1);
           } else if (newVelocity > 10 && newVelocity <= 20) {
               changeGear(2);
           } else if (newVelocity > 20 && newVelocity <= 30) {
               changeGear(3);
           } else {
               changeGear(4);
           }
           if (newVelocity > 0) {
               changeVelocity(newVelocity,getCurrentDirection());
           }
       }
       }

