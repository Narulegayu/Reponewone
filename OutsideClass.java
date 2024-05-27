package Java.org;

import advanced.accessmodifiers.DerivedClass;

public class OutsideClass {
    public static void main(String[] args) {
        DerivedClass derivedObj = new DerivedClass();
        
        
        derivedObj.baseMethod(); 

      
        System.out.println("Derived Variable: " + derivedObj.derivedVariable); 
        
        
    }
}
