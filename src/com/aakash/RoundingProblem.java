package com.aakash;

import java.math.BigDecimal;

public class RoundingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		System.out.println(250/1.4708045300779526401);
		System.out.println(getScaled(250/1.47080453007795, 2));
		System.out.println(getScaledNew(250/1.47080453007795, 2));*/
		/*System.out.println(getScaled(350 / 1.13219151449248, 2));
		System.out.println(350 / 1.13219151449248);
		System.out.println(getScaledNew(350 / 1.13219151449248, 2));*/
	/*	System.out.println(getScaledNew(309.13197894999875, 2));
		System.out.println(getScaledNew(309.13297894999875, 2));
		System.out.println(getScaledNew(309.13397894999875, 2));
		System.out.println(getScaledNew(309.13497894999875, 2));
		System.out.println(getScaledNew(309.13597894999875, 2));
		System.out.println(getScaledNew(309.13697894999875, 2));
		System.out.println(getScaledNew(309.13797894999875, 2));
		System.out.println(getScaledNew(309.138497894999875, 2));
		System.out.println(getScaledNew(309.139497894999875, 2));
		System.out.println(getScaledNew(309.13097894999875, 2));

		System.out.println(getScaledNew(309.131597894999875, 2));
		System.out.println(getScaledNew(309.132597894999875, 2));
		System.out.println(getScaledNew(309.133597894999875, 2));
		System.out.println(getScaledNew(309.134597894999875, 2));
		System.out.println(getScaledNew(309.135597894999875, 2));
		System.out.println(getScaledNew(309.136597894999875, 2));
		System.out.println(getScaledNew(309.137597894999875, 2));
		System.out.println(getScaledNew(309.1385497894999875, 2));
		System.out.println(getScaledNew(309.1395497894999875, 2));*/
/*		System.out.println(getScaled(309.130597894999875, 10));
		System.out.println(getScaled(309.130597894999875, 9));
*/
		System.out.println(getScaledNew(169.97499999999999999932179975, 2));
	}
	public static double getScaled(double value_in, int scale)
	  {
	  		float value = (float) value_in;

	  		double result = value; //default: unscaled	  	

			//use BigDecimal String constructor as this is the only exact way for double values
	  		if (scale < 10)
	  		{	
	  			result = new BigDecimal(""+value).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	  		} else {
	  			result = new BigDecimal(""+value_in).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();	  			
	  		}
	        return result;
	  }
	
	public static double getScaledNew(double result, int scale)
	
	  {
	  		double scaledFac = Math.pow(10, scale+3);
	  		long val= (long) (result * scaledFac);
	  		System.out.println(val);
	  		result = (long) (result * scaledFac) / scaledFac;	  
	  		System.out.println(result);
	  		result = new BigDecimal(""+result).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();

	  		return result;
	  }
}
