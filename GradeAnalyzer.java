//this program check the ArrayList and count the average of the grades in the array list, also i did the lowestGrade and highestGrade method to check the lowest grade in the Array.
import java.util.ArrayList;

public class GradeAnalyzer {
  public GradeAnalyzer (){
    
  }
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1){
      System.out.println("ArrayList is empty!");
      return 0;
    } else {
      int sum = 0;
      for (Integer grade : grades){
        sum = sum + grade;
      }
      int average = sum/grades.size();
      System.out.println (average);
      return average;
    }
  }
  
  public int highestGrade(ArrayList<Integer> grades){
    if (grades.size() < 1){
      System.out.println("ArrayList is empty!");
      return 0;
    } else {
      int liczba=grades.get(0);
     for (int i= 0; i <grades.size(); i++){
       if(liczba>grades.get(i)){
         liczba=liczba;
       }else if (liczba==grades.get(i)){
         liczba=grades.get(i);
       }else if (liczba<grades.get(i)){
         liczba=grades.get(i);
       }
     } return liczba;
    }
  }
  
    public int lowestGrade(ArrayList<Integer> grades){
    if (grades.size() < 1){
      System.out.println("ArrayList is empty!");
      return 0;
    } else {
      int liczba=grades.get(0);
     for (int i= 0; i <grades.size(); i++){
       if(liczba<grades.get(i)){
         liczba=liczba;
       }else if (liczba==grades.get(i)){
         liczba=grades.get(i);
       }else if (liczba>grades.get(i)){
         liczba=grades.get(i);
       }
     } return liczba;
    }
  }
  
  public static void main(String[] args){
   
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    System.out.println("The highest grade in the Array is "+myAnalyzer.highestGrade(myClassroom));
    System.out.println("The lowest grade in the Array is "+myAnalyzer.lowestGrade(myClassroom));
  }
}
