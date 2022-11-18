package TestingBugHunting;

import java.util.Arrays;

public class BugHunting {

	private boolean checkDimensions(CLIQUEUnit other, int e) {
		
		for (int i = 0, j = 0; i < e; i++, j+=2) {
			if(dims[i] != other.bounds[j]
				|| bounds[j] != other.bounds[j]
				|| bounds[j+1] != bounds[j+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public double[] computeMean() {
		return points.size() == 1 ? points.get(1) : null;
	}
	
	
	
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
	
	
	
	public String getStrippedSubstring(int start, int end) {
        int sstart = start, ssend = end;
        String result="";
        while(sstart < ssend) {
            char c = input.charAt(sstart);
            if(c != ' ' || c!= '\n' || c!= '\r' || c!='\t') {
            	break;
            }
  
            ++sstart;
        }
        return result;
        //...
    }
	
	

	public static final ByteSequence prefixEndOf(ByteSequence prefix) {
		byte[] endKey = prefix.getBytes().clone();
		for(int i = endKey.length - 1; i>=0; i--) {
			if (endKey[i] < 0xff) {
				endKey[i] = (byte) (endKey[i]+1);
				return ByteSequence.from(Arrays.copyOf(endKey, i+1));
			}
		}
		return ByteSequence.from(NO_PREFIX_END);
	}
	

	
	private static byte char64(char x) {
		if((int)x < 0 || (int)x > index_64.length)
			return -1;
		return index_64[(int)x];
	}
	
	
	
	public void putToCache(PutRecordsRequest putRecordsRequest)
	{
	  //...
	  if (dataTmpFile == null || !dataTmpFile.exists())
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
	

	
	private void shiftRightDestructive(int wordShifts,
            int bitShiftsInWord,
            boolean roundUp) 
	{
		if (wordShifts == 0 && bitShiftsInWord == 0) {
			return;
		}
	
		assert (wordShifts >= 0);
		assert (bitShiftsInWord >= 0);
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
	

	
	public void logSargResult(int stripeIx, boolean[] rgsToRead)
	{
	  //...
	  for (int i = 0, valOffset = 0; i < elements; ++i, valOffset += 64) {
	    long val = 0;
	    for (int j = 0; j < 64; ++j) {
	      int ix = valOffset + j;
	      if (rgsToRead.length == ix) break;
	      if (!rgsToRead[ix]) continue;
	      val = val | (1 << j);
	    }
	    //...
	  }
	  //...
	}
	
	
	
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
                processedData == processedData &&       
                persistedData = that.persistedData &&
                numSubtasks = that.numSubtask &&
                numAckSubtasks == that.numAckSubtasks &&
                status == that.status &&
                Objects.equals(chekpointType, that.checkpointType) &&
                Objects.equals(checkpointStatisticsPerTask, that.checkpointStatisticsPerTask);
    }
	
	
}
