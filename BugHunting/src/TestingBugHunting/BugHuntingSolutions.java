package TestingBugHunting;

import java.util.Arrays;

public class BugHunting {

	/*
	 * PROBLEM 1
	 * If condition will always return false
	 * Solution:
	 	 change "other.bounds[j]" to "other.bounds[j+1]"
	 */
	private boolean checkDimensions(CLIQUEUnit other, int e) {
		
		for (int i = 0, j = 0; i < e; i++, j+=2) {
			if(dims[i] != other.bounds[j+1]
				|| bounds[j] != other.bounds[j]
				|| bounds[j+1] != bounds[j+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	/*
	 * PROBLEM 2
	 * This method returns the single element of an arraylist with size of 1.
	 * Solution: If the size of the arraylist is 1 then returns the element with index 0. (!!! not 1)
	 */
	public double[] computeMean() {
		return points.size() == 1 ? points.get(0) : null;
	}
	
	/*
	 * PROBLEM 3
	 * In the next method the referenceSetSize must be greater than 0.
	 * Solution: in the first if: if(refereceSetSize <= 0)...
	 */
	protected PreDeConModel computeLocalModel(DoubleDBIDList neighbors, ...) {
		final int referenceSetSize = neighbors.size();
		//...
		if(referenceSetSize <= 0) {
			//...
		}
		//...
		for(int d=0;d<dm;d++) {
			s[d]/=referenceSetSize;
			mvVar.put(s[d]);
		}
		//...
	}
	
	
	/*
	 * PROBLEM 4
	 * We want to get only stripped strings from the user.
	 * Solution: 
	 * 1. if the character is not a blank space, a tab, a special character etc.
	 * 				then save add the char to the string result.
	 * 2. return the string result.
	 */
	public String getStrippedSubstring(int start, int end) {
        int sstart = start, ssend = end;
        String result="";
        while(sstart < ssend) {
            char c = input.charAt(sstart);
            if(c != ' ' || c!= '\n' || c!= '\r' || c!='\t')
                result +=c;
             else break;
            
      
            ++sstart;
        }
        return result;
        //...
    }
	
	/*
	 * PROBLEM 5
	 * if (endKey[i] < 0xff) // this If will always return true.
	 *  because byte type is NOT unsigned [-128, 127]. So instead of 255 (in hexadecimal) we put 127 (hexadecimal)
	 *  Solution:
	 *  In if: "endKey[i] < 0xff" -> "endKey[i] < 0x7F"
	 */
	public static final ByteSequence prefixEndOf(ByteSequence prefix) {
		byte[] endKey = prefix.getBytes().clone();
		for(int i = endKey.length - 1; i>=0; i--) {
			if (endKey[i] < 0x7F) {
				endKey[i] = (byte) (endKey[i]+1);
				return ByteSequence.from(Arrays.copyOf(endKey, i+1));
			}
		}
		return ByteSequence.from(NO_PREFIX_END);
	}
	
	/*
	 * PROBLEM 6
	 * 1. "(int)x < 0" is always false (unsigned in Java)
	 * 2. when (int)x == index_64.length will throw indexing beyond the bounds of the index_64
	 * Solution:  "(int)x > index_64.length" change to "(int)x >= index_64.length"
	 */
	private static byte char64(char x) {
		if((int)x < 0 || (int)x >= index_64.length)
			return -1;
		return index_64[(int)x]l
	}
	
	
	/*
	 * PROBLEM 7
	 * In the first If statement dataTmpFile is null (must be different)
	 * And instead of "||" it needs to be "&&"
	 * Solution: In If statement change "==" to "!="
	 */
	
	public void putToCache(PutRecordsRequest putRecordsRequest)
	{
	  //...
	  if (dataTmpFile != null && !dataTmpFile.exists())
	  {
	    try
	    {
	      dataTmpFile.createNewFile();
	    }
	    catch (IOException e)
	    {
	      LOGGER.error("Failed to create cache tmp file, return.", e);
	      return;
	    }
	  }
	  //...
	}
	
	/*
	 * PROBLEM 8
	 * If the value of "bitShiftsInWord" is 0 the final line of code will return "1 << -1" which is a negative number.
	 * Solution: assert that bitShiftsInWord >= 1
	 */
	private void shiftRightDestructive(int wordShifts,
            int bitShiftsInWord,
            boolean roundUp) 
	{
		if (wordShifts == 0 && bitShiftsInWord == 0) {
			return;
		}
	
		assert (wordShifts >= 0);
		assert (bitShiftsInWord >= 1);
		assert (bitShiftsInWord < 32);
		if (wordShifts >= 4) {
			zeroClear();
			return;
		}
	
		final int shiftRestore = 32 - bitShiftsInWord;
	
		// check this because "123 << 32" will be 123.
		final boolean noRestore = bitShiftsInWord == 0;
		final int roundCarryNoRestoreMask = 1 << 31;
		final int roundCarryMask = (1 << (bitShiftsInWord - 1));
		//...
	}
	
	/*
	 * PROBLEM 9
	 * Beacause val is a long type
	 * We have to change the last line of code from "val = val | (1 << j);" to "val = val | ((long)1 << j);"
	 *  Casting the value 1 to long type.
	 */
	public void logSargResult(int stripeIx, boolean[] rgsToRead)
	{
	  //...
	  for (int i = 0, valOffset = 0; i < elements; ++i, valOffset += 64) {
	    long val = 0;
	    for (int j = 0; j < 64; ++j) {
	      int ix = valOffset + j;
	      if (rgsToRead.length == ix) break;
	      if (!rgsToRead[ix]) continue;
	      val = val | ((long)1 << j);
	    }
	    //...
	  }
	  //...
	}
	
	
	/*
	 * PROBLEM 10
	 * One of the parameter was not assign to the actual class argument (whit ".this")
	 * Solution: change "processedData == processedData" to "processedData == that.processedData"
	 */
    public boolean equals (Object o) {
        //...
        CheckPointStatistics that = (CheckPointStatistics) o;
        return id == that.id &&
                savepoint == that.savepoint &&
                triggerTimestamp == that.triggerTimestamp &&
                latestAckTimestamp = that.latestAckTimestamp &&
                statesize == that.statesize &&
                duration == that.duration &&
                aligmentBuffered == that.aligmentBuffered &&
                processedData == that.processedData &&        // This was changed.
                persistedData = that.persistedData &&
                numSubtasks = that.numSubtask &&
                numAckSubtasks == that.numAckSubtasks &&
                status == that.status &&
                Objects.equals(chekpointType, that.checkpointType) &&
                Objects.equals(checkpointStatisticsPerTask, that.checkpointStatisticsPerTask);
    }
	
	
}
