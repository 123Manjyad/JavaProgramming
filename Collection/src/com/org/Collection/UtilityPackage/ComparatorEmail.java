package com.org.Collection.UtilityPackage;
import java.util.Comparator;
public class ComparatorEmail  implements Comparator<EmployeComparator>
{
	

	        @Override
	        public int compare(EmployeComparator e1, EmployeComparator e2) {
	            return e1.getEmail().compareTo(e2.getEmail());
	        }
	 
}
