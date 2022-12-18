public class Particle {
    int force = 1;
    int acceleration = 0;
    int velocity = 1;
    //int time = 0;
    int pos = 0;
    int mass = 1;
    boolean crash = false;

    public Particle(int _mass, int _pos){
        mass = _mass;
        pos = _pos;
    }

    //returns position after inputting change in time
    public void UpdateState(){
        UpdatePos();
        UpdateVel();
        UpdateAcc();
        Crashed();

    }

    public void UpdatePos(){
        pos += velocity;
    }

    public void UpdateVel(){
        velocity += acceleration;
    }

    public void UpdateAcc(){
        acceleration = force/mass;
        //  acceleration = forces/mass;
        //newton 2nd law
    }

    public void Crashed(){
        if(pos > 100){
            crash = true;
        }
    }

    public String toString(){

        if(!crash){
           return ("Position is " + pos);
        }
        else{
            return "Particle has crashed";
        }
    }

}
