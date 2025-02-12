//Air Quality Analyzer 3               A+CR
import java.util.ArrayList;

//Use your assigned data set A,B,C, or D

class Main3 {

  public static void main(String[] args) {

    //create an array for the city names
    String[] cityNames = {"Columbo, Sri Lanka", "Manali, Chennal", "Secretariat, Amaravati", "Solapur, Solapur", "Katraj, Pune", "MIDC Khutala, Chandraur"};
    //create 1D arrays for each of the rows of PM2.5 levels from the table - they must all be of the same data type 
    double[] columboValues = {34, 25, 82, 107, 87, 82, 76, 82, 102, 99, 34, 38, 46, 38, 38, 65, 63, 53, 53, 46, 42, 55, 34, 21};
    double[] manaliValues = {111, 84, 92, 98, 155, 59, 45, 75, 96, 156, 167, 230, 153, 149, 155, 166, 161, 160, 156, 159, 174, 176, 190, 197};
    double[] secretariatValues = {58, 52, 28, 32, 58, 33, 27, 19, 20, 17, 18, 22, 23, 17, 0, 38, 37, 34, 34, 35, 45, 55, 41, 46};
    double[] solapurValues = {29, 28, 26, 27, 61, 12, 7, 14, 32, 37, 34, 43, 33, 46, 49, 50, 13, 9, 21, 26, 26, 37, 66, 35};
    double[] katrajValues = {19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 18, 17, 17, 16, 16, 16, 16, 16, 19, 18, 18, 18, 18, 18};
    double[] MIDCKhutalaValues = {6, 5, 4, 5, 8, 12, 18, 31, 51, 42, 29, 45, 60, 54, 41, 36, 28, 46, 62, 54, 38, 63, 91, 85};

    //create a 2D array that is an array of arrays, each row is represents a city's PM2.5 levels for 24 hours
    double[][] cities2D= {columboValues, manaliValues, secretariatValues, solapurValues, katrajValues, MIDCKhutalaValues};
 
    //call the printData method passing the correct arguments
    Main3.printData(cityNames, cities2D);

  //create a 1D data structure (array or ArrayList) and add the average PM2.5 level for a day for each city by calling the average method and passing a 1D array that represents each row in the 2D array
    ArrayList<Double> averages = new ArrayList<>();
    for(int i = 0; i < cities2D.length; i ++){
      averages.add(Main3.average(cities2D[i]));
    }
 
    //print a summary of the cities and their average PM2.5 levels rounded to the nearest one hundredth place
    double roundedAverage = 0.0;
    System.out.println("\nOur averages are: ");
    for(int i = 0; i < cities2D.length; i ++){
      roundedAverage = ((int)(averages.get(i) * 100) / 100.0);
      if((roundedAverage * 10) - (int)(roundedAverage * 10) == 0){
        System.out.println(cityNames[i] + " " + roundedAverage + "0");
      }
      else{
        System.out.println(cityNames[i] + " " + roundedAverage);
      }
    }
  }//end of main method

	// The method below should print all of the data as a table. 
	// The method uses paramaters c which is the array of cities and d which is the 2D array of 24-hour PM2.5 levels.
	//for every city
      //print all the corresponding values for that city
  public static void printData(String[] c, double[][] d) {
    for(int row = 0; row < d.length; row++){
      System.out.println(c[row] + ": ");
      for(int col = 0; col < d[row].length; col++){
        if(d[row][col] > 99){
          System.out.print(d[row][col] + " ");
        }
        if(d[row][col] > 9){
          System.out.print(d[row][col] + "  ");
        }
        else{
          System.out.print(d[row][col] + "   ");
        }
      }
      System.out.println("");
    }
	}

  //the method uses a parameter which is a 1D array (one row from the 2D array)
  //the method should calculate and return the average of the values in the 1D array (or row)
 
 public static double average(double[] values) {
  double sum = 0;
  int added = 0;
   for(int i = 0; i < values.length; i ++){
      if(values[i] != 0){
        sum += values[i];
        added ++;
      }
   }
  return sum/added;
 }


} //end of class