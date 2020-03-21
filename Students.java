import java.util.Scanner;
class Students{
    //instance fieldss
    private String name;
    private double[] grades;
    private  int numberOfStudents,sum;
    Scanner input = new Scanner(System.in);

    public Students(){
    }
        //Declare mutator and accessor
        public void setName (String name){
            this.name = name;
        }
        public String getName (){
            return this.name;
        }
        public void setGrades(double[] grades){
            this.grades = grades;
        }
        public double getGrades(){
           this.grades =new double[3];
           for(int x = 0; x<= grades.length; x++){
               grades[x] = input.nextDouble();
               sum += grades[x];
           }
            return sum;
        }
        public void setNumberOfStudents(int numberOfStudents){
            this.numberOfStudents = numberOfStudents;
        }
        public int getNumberOfstudents(int z){
             this.numberOfStudents = z;
             return z;
        }
    
        public double getAverageGrades(){
            return (grades[0]+grades[1]+grades[2])/grades.length;
        }
        public void printStudentDetails(){
       //get the Students Dateils
         System.out.println(" The name is "+this.name +" The Averagegrades is " +getAverageGrades() +" The numberOfStudents is " +this.numberOfStudents);
        }
    }


        