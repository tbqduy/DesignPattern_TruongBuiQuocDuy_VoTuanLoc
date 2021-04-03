import java.util.*;

// class Course {
//   public Course(String name, boolean isAdvanced) {
//     // ...
//   }
//   public boolean isAdvanced() {
//     // ...
//   }
// }

class Course
{
  private String Name;
  public final String getName()
  {
    return Name;
  }
  public final void setName(String value)
  {
    Name = value;
  }
  private boolean isAdvanced;
  public final boolean isAdvanced()
  {
    return isAdvanced;
  }
  public final void setAdvanced(boolean value)
  {
    isAdvanced = value;
  }

  public Course(String name, boolean isadvanced){
    Name = name;
    isAdvanced = isadvanced;
  }

}


class Person {
  private Set courses = new HashSet();

  public Set getCourses() {
    return Collections.unmodifiableSet(courses);
  }
  public void initializeCourses(Set arg) {
    // Assert.isTrue(courses.isEmpty());
    courses.addAll(arg);
  }
  public void addCourse(Course arg) {
    courses.add(arg);
  }
  public void removeCourse(Course arg) {
    courses.remove(arg);
  }
  public int numberOfAdvancedCourses() {
    Iterator iter = getCourses().iterator();
    int count = 0;
    while (iter.hasNext()) {
      Course each = (Course) iter.next();
      if (each.isAdvanced()) {
        count++;
      }
    }
    return count;
  }
  public int numberOfCourses() {
    return courses.size();
  }
}

class de{
  public static void main(String[] arg){
    Person kent = new Person();
    kent.addCourse(new Course("Smalltalk Programming", false));
    kent.addCourse(new Course("Appreciating Single Malts", true));
    // Assert.equals(2, kent.numberOfCourses());
    Course refact = new Course("Refactoring", true);
    kent.addCourse(refact);
    kent.addCourse(new Course("Brutal Sarcasm", false));
    // Assert.equals(4, kent.numberOfCourses());
    kent.removeCourse(refact);
    // Assert.equals(3, kent.numberOfCourses());

    System.out.print("Advanced courses: " + kent.numberOfAdvancedCourses());

  }
}