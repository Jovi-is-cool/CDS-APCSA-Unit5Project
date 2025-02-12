import java.util.ArrayList;
// Air Quality Analyzer Starter 1   A+CR
class Main1 {

    // make sure to pass the correct arguments when calling the methods
    
    
      public static void main(String[] args) {
        
        //create 1 array of City objects and initialize the array with City objects using the loadValues() method in the City class
        City1[] cityObjects = City1.loadValues();
        
        //print all the cities and their PM2.5 level
        for(int i = 0; i <cityObjects.length; i ++){
          System.out.println(cityObjects[i].getName() + " has a PM value of " + cityObjects[i].getPMValue());
        }
    
        //call the findMax method and print all the cities (using a loop) with the worst air quality
        System.out.print("\n the Highest are: ");
        for(int i = 0; i < cityObjects.length; i ++){
          if(cityObjects[i].getPMValue() == cityObjects[findMax(cityObjects)].getPMValue()){
            System.out.println(cityObjects[i]);
          }
        }
    
        //call the findMin method and print all the cities (using a loop) with the best air quality
        System.out.print("\n the Lowest are: ");
        for(int i = 0; i < cityObjects.length; i ++){
          if(cityObjects[i].getPMValue() == cityObjects[findMin(cityObjects)].getPMValue()){
            System.out.println(cityObjects[i]);
          }
        }
    
      } //end of main method
    

      
        // The method below should find the maximum pollution value in the array of City objects instantiated above 
        // The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the maxinum pollution value
        
        public static int findMax(City1[] list){
          int highest = 0;
          for(int i = 1; i < list.length; i ++){
            if(list[highest].getPMValue() < list[i].getPMValue()){
              highest = i;
            }
          }
          return highest;
        }
    
        // The method below should find the minimum pollution value in the array of City objects instantiated above 
        // The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the minimum pollution value
        public static int findMin(City1[] list) {
          int lowest = 0;
          for(int i = 1; i < list.length; i ++){
            if(list[lowest].getPMValue() > list[i].getPMValue()){
              lowest = i;
            }
          }
          return lowest;
        }
      
    }