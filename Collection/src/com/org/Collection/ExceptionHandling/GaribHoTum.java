package com.org.Collection.ExceptionHandling;

public class GaribHoTum {

	  public static void checkGaribi(int x) throws CustomExceptionGarib
	  {
		  if(x>100)
		  {
			  System.out.println("Garib Nhi ho tum Yaar tumhare pass 100 hai     :::::");
		  }
		  
		  else
		  {
			  throw new CustomExceptionGarib("You are Garib");
		  }
	  }
}
