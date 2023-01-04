package sdf;

public class Porche extends Car {

    public String turbo;
    public int speed;


    public Porche() {
        setColour("red");
    }

    public Porche(String colour, String registration) {
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() { return turbo; }

    public void accelerate() {
        this.speed++;
        if(this.speed > 4 ) {
            this.turbo = "on";
        }
    }
    
    public void decelerate() {
        this.speed--;
     if(this.speed <= 4) {
    this.turbo = "off";
     }
}

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }
}