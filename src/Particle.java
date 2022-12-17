public class Particle {
    int velocity = 1;
    //int time = 0;
    int acceleration = 0;
    int pos = 0;
    int mass= 0;

    public Particle(int _mass, int _pos){
        mass = _mass;
        pos = _pos;
    }

    //returns position after inputting change in time
    public int UpdateState(int dtime){
        pos += velocity * dtime;
        velocity += acceleration * dtime;

      //  acceleration = forces/mass;
        return pos;
    }
}
