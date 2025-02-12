// Air Quality Analyzer 2    A+CR
import java.util.ArrayList;

class Main2 {

  // make sure to pass the correct arguments when calling the methods
	// The method below should find the maximum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the maxinum pollution value
	public static int findMax(ArrayList<City2> c) {
		int curMax = 0;
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() > c.get(curMax).getPMValue()){
				curMax = i;
			}
		}
		return curMax;
	}

  // The method below should find the minimum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the minimum pollution value
	public static int findMin(ArrayList<City2> c) {
		int curMin = 0;
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() < c.get(curMin).getPMValue()){
				curMin = i;
			}
		}
		return curMin;
	}

  public static void main(String[] args) {
    //instantiate 1 ArrayList of City objects and initialize the ArrayList with City objects using the loadValues() method in the City class
	ArrayList<City2> citiesDay2 = new ArrayList<City2>();
	citiesDay2 = City2.loadValues();
    //print all the cities and their PM2.5 level
	for(int i = 0; i < citiesDay2.size(); i ++){
		System.out.println(citiesDay2.get(i).getName() + " has a PMValue of " + citiesDay2.get(i).getPMValue());
	}

    //call the findMax method and print all the cities (using a loop) with the worst air quality
for(int i = 0; i < citiesDay2.size(); i ++){
	if(citiesDay2.get(i).getPMValue() == citiesDay2.get(Main2.findMax(citiesDay2)).getPMValue()){
		System.out.println("one of the maxs is " + citiesDay2.get(i).getName() + " with a PM of: " + citiesDay2.get(i).getPMValue());
	}
}


    //call the findMin method and print all the cities (using a loop) with the best air quality
	for(int i = 0; i < citiesDay2.size(); i ++){
		if(citiesDay2.get(i).getPMValue() == citiesDay2.get(Main2.findMin(citiesDay2)).getPMValue()){
			System.out.println("one of the mins is " + citiesDay2.get(i).getName() + " with a PM of: " + citiesDay2.get(i).getPMValue());
		}
	}


  } //end of main method
}