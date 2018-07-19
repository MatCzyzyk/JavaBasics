/*This program checks the List of a books in the Library (HashMap) and then it gives us a finished or unfinished books (what we want)
I had problem here with the key value, how to get it. library.get(key)
Second Problem i had is that in HashMap to add some parameters into the List u have to use the .put instead of .add, like in ArrayList.
*/
import java.util.HashMap;

public class Library {
  public Library(){
  }
  
  public void getFinishedBooks(HashMap<String, Boolean> library){
    if (library.size()<1){
      System.out.println("Error! the HashMap is empty!");
    }else {
      for(String book : library.keySet()){
        if(library.get(book) == true){
          System.out.println(book);
        }
      }
    }
  }
  
    public void getUnfinishedBooks(HashMap<String, Boolean> library){
    if (library.size()<1){
      System.out.println("Error! the HashMap is empty!");
    }else {
      for(String book : library.keySet()){
        if(library.get(book) != true){
          System.out.println(book);
        }
      }
    }
  }
  
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Foot Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}
