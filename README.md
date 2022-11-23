# Pingpong

Team members:

  - Andrei Bulai: bulai.andrei10@gmail.com
  - Luis Rodrigues: lmcrjr@gmail.com


/*

 * PROBLEM 1
 * In If condition "bounds[j+1] != bounds[j+1]" will always be false
 * Solution:
 	 change "bounds[j+1] != bounds[j+1]" to "bounds[j+1] != other.bounds[j+1]"
*/
 
private boolean checkDimensions(CLIQUEUnit other, int e) {
	
	for (int i = 0, j = 0; i < e; i++, j+=2) {
		if(dims[i] != other.bounds[j]
			|| bounds[j] != other.bounds[j]
			|| bounds[j+1] != other.bounds[j+1]) {
			return false;
		}
	}
	return true;
}
