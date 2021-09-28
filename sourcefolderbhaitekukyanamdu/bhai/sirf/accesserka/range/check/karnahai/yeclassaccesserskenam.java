package bhai.sirf.accesserka.range.check.karnahai;

import noorganisedatabhaipackageterakyapurpose.bhaiprivateaccesskafundacheckkarnahai;

public class yeclassaccesserskenam extends bhaiprivateaccesskafundacheckkarnahai {

	public static void main(String[] args) 
	{
		yeclassaccesserskenam differentpackagesinsamefolder=new yeclassaccesserskenam();
		//differentpackagesinsamefolder.p0();        private method cannot be access from another package
		differentpackagesinsamefolder.p1();
		//differentpackagesinsamefolder.p2();        default method is unable to access in another package
		differentpackagesinsamefolder.p3();

	}

}
