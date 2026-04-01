package mainapp;

import encapsulation.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class GreenLandSchoolApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int id = scan.nextInt();
        
        scan.nextLine();
        
         System.out.print("Enter Student First Name: ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter Student Last Name: ");
        String lastName = scan.nextLine();
        
        System.out.print("Enter Student Gender: ");
        char gender = scan.next().charAt(0);
        scan.nextLine();
        
        System.out.print("Enter Student Date of  Birth: ");
        String dateOfBirth = scan.nextLine();
        
        
        System.out.print("Enter Student Phone Number: ");
        String phoneNumber = scan.nextLine();
        
        System.out.print("Enter Course: ");
        String Course = scan.nextLine();
        
        System.out.print("Enter Student Grade: ");
        char grade = scan.next().charAt(0);
        
        
        
        Student student1 = new Student(id, firstName, lastName
                ,gender,LocalDate.parse(dateOfBirth),phoneNumber,Course,grade);
        student1.display();
    }
    
}