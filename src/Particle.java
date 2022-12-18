public class Particle {
    int force = 0;
    int acceleration = 0;
    int velocity = 1;
    //int time = 0;
    int pos = 0;
    int mass = 1;

    public Particle(int _mass, int _pos){
        mass = _mass;
        pos = _pos;
    }

    //returns position after inputting change in time
    public void UpdateState(){
        UpdatePos();
        UpdateVel();
        UpdateAcc();
      //  acceleration = forces/mass;

    }

    public void UpdatePos(){
        pos += velocity;
    }

    public void UpdateVel(){
        velocity += acceleration;
    }

    public void UpdateAcc(){
        acceleration = force/mass;
    }

}
