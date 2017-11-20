import model.Events;

public class Grid extends Events {
	int grid[][] ;
	Data spread[][];

	public Grid(int[][] grid) {
		// TODO Auto-generated constructor stub
		this.grid = grid;
	}

	public Grid(Data[][] spread) {
		// TODO Auto-generated constructor stub
		this.spread =spread;
	}

	public int[][] getGrid() {
		// TODO Auto-generated method stub
		return grid;
	}

	public Data[][] getSpread() {
		return spread;
	}

	public int length() {
		// TODO Auto-generated method stub
		return grid.length;
	}

	public int length(int i) {
		// TODO Auto-generated method stub
		return grid[i].length;
	}

	public int value(int i, int j) {
		// TODO Auto-generated method stub
		return grid[i][j];
	}

}
