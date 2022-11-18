package TestingClock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

//import junit.framework.Assert;
//import soleraKatasExercise.berlinClock.BerlinClock;

class TestBerlinClock {

	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void testTopLampShouldBlinkOffInOddSecondsAndBlinkOnInEvenSeconds() {
		
		Assert.assertEquals("Y", berlinClock.getSeconds(0));
		Assert.assertEquals("O", berlinClock.getSeconds(1));
        Assert.assertEquals("O", berlinClock.getSeconds(59));
	}
	
	@Test
    public void testTopHoursShouldHave4Lamps() {
        Assert.assertEquals(4, berlinClock.getTopHours(8).length());
    }
 
    // Top hours should light a red lamp for every 5 hours
    @Test
    public void testFirstRowHoursShouldLightRedLampForEvery5Hours() {
        Assert.assertEquals("OOOO", berlinClock.getTopHours(0));
        Assert.assertEquals("ROOO", berlinClock.getTopHours(7));
        Assert.assertEquals("RROO", berlinClock.getTopHours(14));
        Assert.assertEquals("RRRR", berlinClock.getTopHours(21));
        Assert.assertEquals("RRRR", berlinClock.getTopHours(24));
    }
 
    // Bottom hours should have 4 lamps
    @Test
    public void testSecondRowHoursShouldHave4Lamps() {
        Assert.assertEquals(4, berlinClock.getTopHours(5).length());
    }
 
    // Bottom hours should light a red lamp for every hour left from top hours
    @Test
    public void testSecondRowHoursShouldLightRedLampForEveryHourLeftFromFirstRowHours() {
        Assert.assertEquals("OOOO", berlinClock.getBottomHours(0));
        Assert.assertEquals("ROOO", berlinClock.getBottomHours(1));
        Assert.assertEquals("RROO", berlinClock.getBottomHours(12));
        Assert.assertEquals("RRRO", berlinClock.getBottomHours(13));
        Assert.assertEquals("RRRO", berlinClock.getBottomHours(23));
        Assert.assertEquals("RRRR", berlinClock.getBottomHours(24));
    }
 
    // Top minutes should have 11 lamps
    @Test
    public void testFirstRowMinutesShouldHave11Lamps() {
        Assert.assertEquals(11, berlinClock.getTopMinutes(34).length());
    }
 
    // Top minutes should have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter
    @Test
    public void testFirstRowMinutesShouldHave3rd6thAnd9thLampsInRed() {
        String minutes32 = berlinClock.getTopMinutes(32);
        Assert.assertEquals("R", minutes32.substring(2, 3));
        Assert.assertEquals("R", minutes32.substring(5, 6));
        Assert.assertEquals("O", minutes32.substring(8, 9));
    }
 
    // Top minutes should light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter
    @Test
    public void testFirstRowMinutesShouldLightYellowLampForEvery5MinutesUnlessItIsFirstQuarterHalfOrLastQuarter() {
        Assert.assertEquals("OOOOOOOOOOO", berlinClock.getTopMinutes(0));
        Assert.assertEquals("YYROOOOOOOO", berlinClock.getTopMinutes(17));
        Assert.assertEquals("YYRYYRYYRYY", berlinClock.getTopMinutes(59));
    }
 
    // Bottom minutes should have 4 lamps
    @Test
    public void testSecondRowMinutesShouldHave4Lamps() {
        Assert.assertEquals(4, berlinClock.getBottomMinutes(0).length());
    }
 
    // Bottom minutes should light a yellow lamp for every minute left from top minutes
    @Test
    public void testSecondRowMinutesShouldLightYellowLampForEveryMinuteLeftFromMinutes() {
        Assert.assertEquals("OOOO", berlinClock.getBottomMinutes(0));
        Assert.assertEquals("YYOO", berlinClock.getBottomMinutes(17));
        Assert.assertEquals("YYYY", berlinClock.getBottomMinutes(59));
    }
 
    // Berlin Clock should result in array with 5 elements
    @Test
    public void testBerlinClockShouldResultInArrayWith5Elements()  {
        Assert.assertEquals(5, berlinClock.convertToBerlinTime("13:17:01").length);
    }
 
    // Berlin Clock it should "result in correct seconds, hours and minutes" in {
    @Test
    public void testBerlinClockShouldResultInCorrectSecondsHoursAndMinutes() {
        String[] berlinTime = berlinClock.convertToBerlinTime("16:37:16");
        String[] expected = new String[] {"Y", "RRRO", "ROOO", "YYRYYRYOOOO", "YYOO"};
        Assert.assertEquals(expected.length, berlinTime.length);
        for (int index = 0; index < expected.length; index++) {
            Assert.assertEquals(expected[index], berlinTime[index]);
        }
    }
}
