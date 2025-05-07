public class Course implements Comparable<Course> {
  private String department;
  private Integer number;


  public Course(String dept, Integer num) {
    this.department = dept;
    this.number = num; 
  }

  @Override 
  public int compareTo(Course otherCourse) {
    int deptCompare = this.departement.compareTo(otherCourse.department); 
    if(deptCompare != 0){
      return deptCompare; 
    }
    return this.number.compareTo(otherCourse.number); 
  }

  @Override
  public String toString() {
    return department + " " + number; 
  }
}