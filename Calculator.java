//this program calculates the two values, it can add, subtract, multiply, divide, and modulo them.

public class Calculator {
  
  public Calculator (){
    
  }
  public int add (int a, int b){
    return a+b;
  }
  public int subtract (int a, int b){
    return a-b;
  }
  public int multiply (int a, int b){
    return a*b;
  }
  public int divide (int a, int b){
    if (b == 0){
      System.out.println("Error! Dividing by zero is not allowed.");
        return 0;
    } else {
      return a/b;
    }
  }
  public int modulo (int a, int b){
    if (b == 0) {
      System.out.println ("Error! Dividing by zero is not allowed");
      return 0;
    } else {
      return a % b;
    }
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println("Adding 5+7 is " +myCalculator.add(5,7));
    System.out.println("Subtracting 45-11 is "+myCalculator.subtract(45,11));
    
  }
}
