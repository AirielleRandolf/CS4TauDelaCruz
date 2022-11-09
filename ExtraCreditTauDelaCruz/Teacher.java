import java.util.ArrayList;

class Teacher {
  private String name;
  private String subject;
  ArrayList<Section> sections = new ArrayList<Section>();

  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }

  public void giveAssignment(Assignment assignment) {
    for(Section section : sections) {
      for(Student student : section.students) {
        student.assignments.add(assignment);
      }
    }
  }

  public String getName() {
    return name;
  }

  public String getSubject() {
    return subject;
  }
}