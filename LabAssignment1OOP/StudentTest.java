import java.util.Scanner;
class StudentTest {
   public static void main(String args[]) {
      boolean flagLoopMain = true;
      while(flagLoopMain == true) { // main program loop for student details and registration of courses (both are split into seperate for loops
         System.out.println("Please Enter Student Details: \nFirst Name, Last Name, ID, and number of register courses");
         Student_Details s1;
         
         Scanner input = new Scanner(System.in);
         String FName = input.next();
         String LName = input.next();
         String ID = input.next();
         String CourseNum = input.next();      
         
         boolean flagFName = FName.matches("[0-9]+");
         boolean flagLName = LName.matches("[0-9]+");
         boolean flagID = ID.matches("[a-zA-Z]+");
         boolean flagCNum = CourseNum.matches("[a-zA-Z]+");
         
         if(flagFName == true || flagLName == true || flagID == true || flagCNum == true) {
            throw new IllegalArgumentException("Please Enter Student Details With First/Last Name Using Letters only & ID/Course Number Using Numbers only using the mentioned format...");
                                                                              }
   
         s1 = new Student_Details(FName,LName,Integer.parseInt(ID),Integer.parseInt(CourseNum)); 
              
         System.out.println("Please Enter registered courses details: \nCourse_ID, name, and Grade");
         for(int x=0; x < s1.getCourseNum(); x++) { //course regisration loop
            
            Registered_Course[] R_Courses = new Registered_Course[s1.getCourseNum()];
            String Course_ID = input.next();
            String NameC = input.next();
            String Grade = input.next();
            //Array.set(Registered_Courses, x, Integer.parseInt(Course_ID)); How to use Array.set ???
            
            boolean flag5 = Course_ID.matches("[a-zA-Z]+");
            boolean flag6 = NameC.matches("[0-9]+");
            boolean flag7 = Grade.matches("[a-zA-Z]+");
            
            
            if(flag5 == true || flag6 == true || flag7 == true) { //validation for input
               throw new IllegalArgumentException("Please Enter Course Details With Course Name Using Letters only & Grade/CourseID Using Numbers only using the mentioned format...");
                                                                }
            Registered_Course c  = new Registered_Course(Integer.parseInt(Course_ID), NameC, Integer.parseInt(Grade));
            s1.setRegisteredCourse(c,x);    
                                                  }// end of course regisration loop
            
            System.out.println(s1);
                                                  
            System.out.println("Do you want to enter other Student's details? Yes or No");
            boolean flagAnotherInput = true;
            String x = input.nextLine();
            while( flagAnotherInput == true )   { // begining while loop for another student details input request
               x = input.nextLine();            
               if(x.equalsIgnoreCase("yes")) { flagLoopMain = true; flagAnotherInput = false; }
               else if(x.equalsIgnoreCase("No")) { flagLoopMain = false; flagAnotherInput = false; }                       
               else{System.out.println("Your Input is Invalid, Please Type Yes/No Only.");}
               
                                                }//end of while loop for another student details input request
            
                                             }//end of Main Program While Loop
      System.out.println("Thank You !!");
                                          }// end of main method

                  }// end of main class