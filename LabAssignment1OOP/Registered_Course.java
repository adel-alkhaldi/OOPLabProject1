class Registered_Course {
   final private int Course_ID;
   private String Course_Name;
   private int Course_Grade;
   
   Registered_Course(int Course_ID, String Course_Name, int Course_Grade) {
      if(Course_ID <= 0) {
         throw new IllegalArgumentException("Course ID has invalid input");
                                                                     }
      else {this.Course_ID = Course_ID;}
      
      setCourseName(Course_Name);
      setCourseGrade(Course_Grade);
                                                                          }

                                          
   public void setCourseName(String Course_Name) {
      if(Course_Name == null || Course_Name.isEmpty() || Course_Name.trim().isEmpty()) {
         throw new IllegalArgumentException("Course Name Parameter has invalid input");
                                                                                       }
      else {this.Course_Name = Course_Name;}  
                                                
                                                 }
   
   public void setCourseGrade(int Course_Grade) {
   
      if(Course_Grade < 0 || Course_Grade > 100) {
         throw new IllegalArgumentException("Course Grade Parameter has invalid input");
                           }
      else {this.Course_Grade = Course_Grade;}  
      
                                                }
   public int getCourseID() {
      return Course_ID;
                            }
   
   public String getCourseName() {
      return Course_Name;
                                 }
   
   public int getCourseGrade() {
      return Course_Grade;
                               }
   
   public String toString() {
      return getCourseID() + "  " + getCourseName() + "  " + getCourseGrade();
                            }
   
                        }