import java.util.Arrays;
import java.util.Random;

import model.AtomicModel;
import model.Port;

public class Epidemiology extends AtomicModel {

	Port gridIn, gridOut;
	Random rand;
	int grid[][];
	Data spread[][];
	double susceptible;
	double infectious;
	double recovery;
	double sigma;
	
	public Epidemiology(String name, String desc, int x, int y) {
		// TODO Auto-generated constructor stub
		super();
		
		gridIn = new Port();
		gridOut = new Port();
		
		addInputPort(gridIn, "Input");
		addOutputPort(gridOut, "Out_port");
		
		rand = new Random();
		
		grid = new int[x][y];
		spread = new Data[x][y];
		susceptible = 100;
		infectious=1;
		recovery = 0;
		for(int i = 0; i<spread.length; i++) {
			for(int j = 0; j<spread[i].length; j++) {
				spread[i][j] = new Data(0,0,0);
			}
		}
	}

	@Override
	public void deltaConf() {
		// TODO Auto-generated method stub
		deltaInt();deltaExt(1);
		
	}

	@Override
	public void deltaExt(double arg0) {
		// TODO Auto-generated method stub
		System.out.println("			Epidemiology Grid DeltaExt:Before "+ Arrays.deepToString(grid));
		for(int p = 0; p<gridIn.getEvents().size(); p++) {	
			grid = ((Grid)gridIn.getEvents().get(p)).getGrid();
		}
		
		System.out.println("			Epidemiology Grid DeltaExt: After"+ Arrays.deepToString(grid));
	}

	@Override
	public void deltaInt() {
		// TODO Auto-generated method stub
		int old_pop; 
		double beta = 0.00001, gamma = 0.3;
		for(int i=0; i<grid.length; i++) {
			 for(int j=0; j<grid[i].length; j++) {
				old_pop = grid[i][j];System.out.println("			Epidemiology Grid DeltaInt: old_pop "+ old_pop);
		/** Using SIR model
		 * Beta = 0.45, Gamma = 0.3
		 * **/ if (old_pop == 0){ break;}
//				susceptible = (int)Math.round( susceptible*(1-(beta*infectious)/old_pop));
//				infectious = (int) Math.round(infectious*(1+(susceptible/old_pop) -infectious));
		 		recovery = old_pop-susceptible-infectious;
				susceptible = Math.round(-((1/beta)*susceptible*infectious)/old_pop);
				infectious = Math.round((beta*susceptible*infectious)/old_pop - recovery);
				spread[i][j] = new Data(susceptible,infectious,recovery);
		 		//recovery  = ((1/gamma)*infectious);
				double total = susceptible+infectious+recovery;
		System.out.println("Susceptible : "+susceptible+" infectiuos : "+ infectious + " recovery : "+recovery+" total :"+total);
			}
		}
		
	}

	@Override
	public void lambda() {
		// TODO Auto-generated method stub
		//gridOut.addEvent(new Grid(grid));
		gridOut.addEvent(new Grid(spread));
		System.out.println("			Epidemiology Grid : "+ Arrays.deepToString(grid));
		
	}

	@Override
	public double ta() {
		// TODO Auto-generated method stub
		return 1;
	}

}
