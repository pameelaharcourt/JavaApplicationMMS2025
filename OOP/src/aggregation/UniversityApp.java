
package aggregation;


public class UniversityApp {
    public static void main(String[] args){
    Lecturer lect = new Lecturer("Henry Williams", "08074646636");
    University uni = new University("UST", lect);
    
    uni.showDetails();
    
    }
    
    
}
