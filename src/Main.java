import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Main {


    public static void main(String[] args) {
        test3System(); //I just want to see if the whole thing complies
        test2System();
    }

    public static void test3System(){
        System.out.println("Welcome to the simulation w/ 3 particles");

        Particle nee = new Particle(10,0,"jim");
        Particle noo = new Particle(10,20,"frank");
        Particle tr = new Particle(10,10,"jane");
        double time = 0;


        while (!nee.crash && !noo.crash) {

            nee.force = calcForce(nee,noo);
            nee.force += calcForce(nee,tr);
            noo.force = (calcForce(noo,nee));
            noo.force += (calcForce(noo,tr));
            tr.force = (calcForce(tr,nee));
            tr.force +=(calcForce(tr,noo));



            nee.UpdateState(time);
            noo.UpdateState(time);
            tr.UpdateState(time);

            time++;

        }
        System.out.println("The end is upon us");
    }

    public static void test2System(){
        System.out.println("Welcome to the simulation w/ 2 particles");

        Particle nee = new Particle(10,-1,"jim");
        Particle noo = new Particle(10,1,"frank");
        double time = 0;


        while (!nee.crash && !noo.crash) {

            nee.force = calcForce(nee,noo);
            noo.force = (calcForce(noo,nee));

            nee.UpdateState(time);
            noo.UpdateState(time);

            time++;

        }
        System.out.println("The end is upon us");
    }


    //takes the difference of the forces
    public static double calcForce(Particle a, Particle b){
        return a.pos-b.pos;
    }
}
