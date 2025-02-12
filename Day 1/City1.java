class City1 {
    // instance variables are the city name and the PM value for that city
    private String name;
    private int pmValue;

    public City1() {
        name = "no name";
        pmValue = 0;
    }

    public City1(String nm, int pm) {
        name = nm;
        pmValue = pm;
    }

    public String getName() {
        return name;
    }

    public int getPMValue() {
        return pmValue;
    }

    public static City1[] loadValues() {
         // set up parallel arrays with the city names and pollution data
         // initialize each array with the information from the Student Data Set A, B, C, or D

        String[] cities = {"Miami", "New Orleans", "San Francisco", "Atlanta"};

        int[] pmValues = {48,46,25,46};

        //create an array of City objects
        City1[] theC = new City1[4];

        for (int i = 0; i < 4; i++)
        {
            theC[i] = new City1(cities[i], pmValues[i]);
        }
        
        return theC;

    }

    public String toString() {
        return (name + " has pollution value of " + pmValue +".");
    }

}