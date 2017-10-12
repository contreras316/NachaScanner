package nacha;

/*This class will check if the file is empty
 * If file meets the 94 characters per line
 * 
 * 
 */

public class NachaEagleView {

	public NachaEagleView() {

	}
	
	public void nachacheckfile(String[] nachafile) {
		
		for(int i =0; i < nachafile.length; i++) {
			String stringofarray = (String) nachafile[i];
			
			int linenumber =i+1;
			
			if(stringofarray.length() != 94 || stringofarray.isEmpty()) {
				System.out.println("Line " + linenumber + " has a total of " + stringofarray.length() + " :You need a total of 94 per line.");
			}
		}
	}

}
