package com.org.Collection.UtilityPackage;

import java.util.Comparator;

public class ComparatorName  implements Comparator<EmployeComparator>{
	
    
        @Override
        public  int compare(EmployeComparator e1, EmployeComparator e2) {
            return e1.getName().compareTo(e2.getName());
        }
  

}
