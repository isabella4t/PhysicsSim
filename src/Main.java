import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the simulation");

        int time = 0;
        double MyPosition = 0;

        Particle nee = new Particle(1,0);

        while (!nee.crash) {

            nee.UpdateState();
            System.out.println(nee.toString());

            time++;
        }
        System.out.println("The end is upon us");
    }
}
