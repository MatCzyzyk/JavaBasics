//This Droid program creates a droid that uses battery, it can be activated, it can chargeBattery, checkBatteryLevel and Hover off the groud.

public class Droid {
  int batteryLevel;
  boolean active = false;
  
  public Droid (){
    batteryLevel = 100;
  }
  
  public void activate(){
    active = true;
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel-5;
    System.out.println("Battery level is: "+batteryLevel+" percent.");
  }
  
  public void chargeBattery(int hours){
    System.out.println("Droid charging...");
    batteryLevel = batteryLevel + hours;
    if (batteryLevel > 100){
      batteryLevel = 100;
      System.out.println("Battery level is: "+batteryLevel+" percent.");
    }else System.out.println("Battery level is: "+batteryLevel+" percent.");
  }
  
  public int checkBatteryLevel(){
    System.out.println("Battery level is: "+batteryLevel+" percent.");
  return batteryLevel;
  }
  
  public void hover (int feet){
    if (feet > 2){
      System.out.println("Error! I Cannot hover above 2 feet!");
    }else System.out.println("Hovering...");
    batteryLevel = batteryLevel -20;
    System.out.println("Battery level is: "+batteryLevel+" percent.");
  }
  
  public static void main(String[] args){
    Droid Droid = new Droid();
    Droid.activate();
    Droid.chargeBattery(5);
    Droid.hover(2);
  }
}
