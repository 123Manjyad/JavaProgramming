package com.org.Collection.UtilityPackage;
import java.util.Comparator;
public class ComparatorEid  implements Comparator<EmployeComparator>{

	@Override
	public int compare(EmployeComparator e1, EmployeComparator e2) {
		// TODO Auto-generated method stub
		  return Integer.compare(e1.getEid(), e2.getEid());
		
	}

}
