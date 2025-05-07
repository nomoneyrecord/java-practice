public class Student implements Comparable<Student> {
  private String firstName;
  private String lastName; 
  private double GPA;

  public Student (String first, String last, double gradeAverage) {
    this.firstName = first; 
    this.lastName = last;
    this.GPA = gradeAverage;
  }

  @Override
  public int compareTo(Student otherStudent){
    if(this.GPA != otherStudent.GPA) {
      return Double.compare(otherStudent.GPA, this.GPA); 
    }

    int lastCompare = this.lastName.compareTo(otherStudent.lastName); 
    if (lastCompare != 0) {
      return lastCompare; 
    }

    return this.firstName.compareTo(otherStudent.firstName);
  }

  @Override
  public String toString() {
    return String.format("%.2f %s, %s", GPA, lastName, firstName); 
  }
}