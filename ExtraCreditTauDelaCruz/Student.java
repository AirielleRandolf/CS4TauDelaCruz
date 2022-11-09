import java.util.ArrayList;

class Student {
  private String name;
  ArrayList<Assignment> assignments = new ArrayList<Assignment>();

  public Student(String name) {
    this.name = name;
  }

  public void finishAssignment(Assignment assignment) {
    assignments.remove(assignment);
  }

  public double getTimeNeeded() {
    double totalTimeAlloted = 0;

    for(Assignment a : assignments) {
      totalTimeAlloted += a.getTimeAlloted();
    }

    return totalTimeAlloted;
  }

  public String getName() {
    return name;
  }
}