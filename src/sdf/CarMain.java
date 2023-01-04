public class CarMain {
    //Entry Point
    public Static void main(String[] args) {
        //Insta a ins of car
        Car c = new Car();
        c.setColour("grey");
        c.setRegistration("sdf12348");
        c.start();
        System.out.printf("Is the car started? %b\n)", c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car();
        d.setColour("red");
        System.out.printf("Colour of my car? %s\n", d.getColour());
    }
}
