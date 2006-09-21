package net.sf.jniinchi;

import org.junit.Assert;
import org.junit.Test;

public class TestJniInchiOutput {

    /*
     * Test method for 'net.sf.jniinchi.JniInchiOutput.getReturnStatus()'
     */
	@Test
    public void testGetReturnStatus() {
        JniInchiOutput output = new JniInchiOutput();
        output.retStatus = INCHI_RET.OKAY;
        Assert.assertEquals(output.getReturnStatus(), INCHI_RET.OKAY);
    }

    /*
     * Test method for 'net.sf.jniinchi.JniInchiOutput.getInchi()'
     */
	@Test
    public void testGetInchi() {
        JniInchiOutput output = new JniInchiOutput();
        output.sInchi = "Inchi=1/C6H6/c1-2-4-6-5-3-1/h1-6H";
        Assert.assertEquals(output.getInchi(), "Inchi=1/C6H6/c1-2-4-6-5-3-1/h1-6H");
    }

    /*
     * Test method for 'net.sf.jniinchi.JniInchiOutput.getAuxInfo()'
     */
	@Test
    public void testGetAuxInfo() {
        JniInchiOutput output = new JniInchiOutput();
        output.sAuxInfo = "AuxInfo=1/0/N:1,2,6,3,5,4/E:(1,2,3,4,5,6)/rA:6nCCCCCC/rB:d1;s2;d3;s4;s1d5;/rC:-.7145,.4125,0;-.7145,-.4125,0;0,-.825,0;.7145,-.4125,0;.7145,.4125,0;0,.825,0;";
        Assert.assertEquals(output.getAuxInfo(), "AuxInfo=1/0/N:1,2,6,3,5,4/E:(1,2,3,4,5,6)/rA:6nCCCCCC/rB:d1;s2;d3;s4;s1d5;/rC:-.7145,.4125,0;-.7145,-.4125,0;0,-.825,0;.7145,-.4125,0;.7145,.4125,0;0,.825,0;");
    }

    /*
     * Test method for 'net.sf.jniinchi.JniInchiOutput.getMessage()'
     */
	@Test
    public void testGetMessage() {
        JniInchiOutput output = new JniInchiOutput();
        output.sMessage = "Test message";
        Assert.assertEquals(output.getMessage(), "Test message");
    }

    /*
     * Test method for 'net.sf.jniinchi.JniInchiOutput.getLog()'
     */
	@Test
    public void testGetLog() {
        JniInchiOutput output = new JniInchiOutput();
        output.sLog = "Test log";
        Assert.assertEquals(output.getLog(), "Test log");
    }
}
