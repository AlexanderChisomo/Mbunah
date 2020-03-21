//Alexander C. Mbunah...Bsc-ele-07-18;
import java.util.Scanner;
class Student{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Students students1 = new Students();
        
        System.out.println("Enter name of the student: ");
        String name = input.nextLine();
        students1.setName(name);

        //prompt user to enter grades
        double [] grades;
        for(int i = 0; i<=2; i++){
             System.out.println("Enter grade : "+(i+1));
            grades = new double [3]; 
            grades[i] = input.nextDouble();
            students1.setGrades(grades);
        }

         //the number of student
        System.out.println("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();
           students1.setNumberOfStudents(numberOfStudents);
           students1.printStudentDetails();
     
       
        


         


    }
    
} 