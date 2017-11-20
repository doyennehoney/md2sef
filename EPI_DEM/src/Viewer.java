import model.AtomicModel;
import model.Port;

public class Viewer extends AtomicModel {
	Port inDem;
	public Viewer() {
		// TODO Auto-generated constructor stub
		super();
		inDem = new Port();
		addInputPort(inDem, "hola");
	}

	@Override
	public void deltaConf() {
		// TODO Auto-generated method stub
		deltaExt(1);
	}

	@Override
	public void deltaExt(double arg0) {
		// TODO Auto-generated method stub
		for(int i = 0; i< inDem.getEvents().size(); i++) {
            System.out.println(i + " : " + (((Grid)inDem.getEvents().get(i)).getGrid()).toString());                       
        }     System.out.println("help");
	}

	@Override
	public void deltaInt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lambda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double ta() {
		// TODO Auto-generated method stub
		return Double.POSITIVE_INFINITY;
	}

}
