class Student_Details extends Student {
   private Registered_Course[] Registered_Courses;
   private int Course_num;
   Student_Details(String FName, String LName, int ID, int Course_num) {
      super(FName,LName,ID); 
      setCourseNum(Course_num);
                                                                       }
                                                       
   public void setCourseNum(int Course_num) {
      if(Course_num < 0) {
         throw new IllegalArgumentException("Course num Parameter has invalid input");
                         }
      else {
         this.Course_num = Course_num;
         Registered_Courses = new Registered_Course[Course_num];     
           }
                                            }

   public void setRegisteredCourse(Registered_Course regCourse, int x) {
      Registered_Courses[x] = regCourse;
                                                                       }
 
   public String getRegCourseDetails() {
      String y = "";
      for(int x = 0; x < getCourseNum(); x++) {
        y = y + Registered_Courses[x].toString() + "\n";
                                              }
      return y;
                                       }
   
   public double CalculateCoursesAvg() {
      double y = 0;
      for(int x = 0; x < getCourseNum(); x++) {
         y += Registered_Courses[x].getCourseGrade();
                                              }
      return y/getCourseNum();
                                       }
   public int getCourseNum() {
      return Course_num;
                             }
                             
   public String toString() {
      return super.toString() + "\nRegistered Course Details:\n" + getRegCourseDetails() + "\nAverage Of Registered Courses = " + CalculateCoursesAvg();
                            } 
                                       
                                    }