abstract class Student {
   
   private String FName;
   private String LName;
   final private int ID;
   
   Student(String FName, String LName, int ID) {
      setFName(FName);
      setLName(LName);
      if(ID < 0) {
         throw new IllegalArgumentException("ID Parameter has invalid input");
                 }
      else {this.ID = ID;} 
                                               }
   public void setFName(String FName) {
      if(FName == null || FName.isEmpty() || FName.trim().isEmpty()) {
         throw new IllegalArgumentException("First Name Parameter has invalid input");
                                                                     }
      else {this.FName = FName;}

                                      }
   
   public void setLName(String LName) {
   
      if(LName == null || LName.isEmpty() || LName.trim().isEmpty()) {
         throw new IllegalArgumentException("Last Name Parameter has invalid input");
                                                                     }
      else {this.LName = LName;}                                      
                                      }

                             
   public String getFName() {
      return FName;              
                            }

   public String getLName() {
      return LName;                        
                            }
                            
   public int getID() {
      return ID;          
                         }
   
   abstract public void setRegisteredCourse(Registered_Course regCourse, int x);
   
   abstract public String getRegCourseDetails();
   
   abstract public double CalculateCoursesAvg();
   
   public String toString() {

      return "Student Details: \n" +  "First Name: " + getFName() + "\n" + "Last Name: " + getLName() + "\n" + "ID = " + getID();
                            }
                      
                       }