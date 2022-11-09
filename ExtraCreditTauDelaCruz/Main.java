class Main {
  public static void main(String[] args) {
    Section c1 = new Section("C1");
    Section c2 = new Section("C2");
    Teacher t1 = new Teacher("T1", "Math");
    t1.sections.add(c1);
    t1.sections.add(c2);
    Teacher t2 = new Teacher("T2", "English");
    t2.sections.add(c2);
    Teacher t3 = new Teacher("T3", "SocSci");
    t3.sections.add(c1);

    Student s1 = new Student("S1");
    Student s2 = new Student("S2");
    c1.students.add(s1);
    c1.students.add(s2);
    Student s3 = new Student("S3");
    c2.students.add(s3);

    Assignment a1 = new Assignment("A1", 2);
    Assignment a2 = new Assignment("A2", 3);
    Assignment a3 = new Assignment("A3", 5);

    t1.giveAssignment(a1);
    t2.giveAssignment(a2);
    t3.giveAssignment(a3);
    s2.finishAssignment(a1);
    System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
    System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
    System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
  }
}
