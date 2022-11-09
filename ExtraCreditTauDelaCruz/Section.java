import java.util.ArrayList;

class Section {
  private String name;
  ArrayList<Student> students = new ArrayList<Student>();

  public Section(String name) {
    this.name = name;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public String getName() {
    return name;
  }
}