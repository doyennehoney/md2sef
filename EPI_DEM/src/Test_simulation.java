
public class Test_simulation {

	public Test_simulation() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args ) {
		Test_coupled flat = new Test_coupled("Test_coupled", "Only One Coupled Model", 2, 2);
		
        Test_frame test_frame = new Test_frame(flat);
        test_frame.setInitialTime(0);
        test_frame.runExperiment(); 
	}

}
