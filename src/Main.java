import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the simulation");

        int time = 0;
        boolean fine = true;
        boolean universe = true;
        double MyPosition = 0;

        Particle nee = new Particle(20,0);

        while (universe) {

            //is it fine
            if (fine) {
                nee.UpdateState(time);
                System.out.println("My position: "+ nee.pos);
            }

            if (Math.random() < 0.5) {
                fine = false;
            }
        }
        time++;
    }
}
