public class Particle {
    double force = 1;
    double acceleration = 0;
    double velocity = 1;
    //int time = 0;
    double pos = 0;
    double mass = 1;
    //double time = 0;
    boolean crash = false;
    String name = "";


    public Particle(int _mass, int _pos){
        mass = _mass;
        pos = _pos;
    }

    public Particle(int _mass, int _pos, String _name){
        mass = _mass;
        pos = _pos;
        name = _name;
    }

    //returns position after inputting change in time
    public void UpdateState(double time){
        UpdateAcc(time);
        UpdateVel(time);
        UpdatePos(time);
        Crashed();
        System.out.println(toString());


    }

    public void UpdatePos(double time){
        pos += velocity*time;
    }

    //adjust for second object
    public void UpdateVel(double time){
        velocity += (acceleration/2)*time;
    }

    public void UpdateAcc(double time){
        acceleration = (force/mass)*time;
        //  acceleration = forces/mass;
        //newton 2nd law F=ma
    }

    public void UpdateForce(double n) {force = n;}

    public void Crashed(){
        if(pos > 100||pos<-100){
            crash = true;
        }
        //set the boundaries
    }

    public String toString(){

        if(!crash){
           return (name + "'s position is " + pos + " ");
        }
        else{
            return name + " has crashed";
        }
    }

}
