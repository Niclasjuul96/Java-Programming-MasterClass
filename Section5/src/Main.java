public class Main {
 
    public static void main(String[] args) {
        //Methodoverloading Challenge!
        System.out.println("67 inches = " + convertToCentimeters(67) + " cm"); 
        System.out.println("6 feet, 4 in = " + convertToCentimeters(6, 4) + " cm"); 

        //Seconds and Minutes Challenge!
        System.out.println(getDurationString(-3945)); 
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
 


    //Methodoverloading Challenge!
    public static double convertToCentimeters(double inches){
 
        return inches * 2.54d;       
    }
    public static double convertToCentimeters(double feet, double inches){
        
        double totalInches = inches + (feet * 12);
        
        return convertToCentimeters(totalInches);
    }

    //Seconds and Minutes Challenge!
    public static String getDurationString(int seconds) {
        if(seconds < 0){
            return "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0){
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }

        if(seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
 
}
