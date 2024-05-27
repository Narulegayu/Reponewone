package advanced.accessmodifiers;

public class DerivedClass extends BaseClass {
   
    public int derivedVariable = 20;
    
  
    @Override
    public void baseMethod() {
        System.out.println("DerivedClass: derivedMethod()");
    }
}
