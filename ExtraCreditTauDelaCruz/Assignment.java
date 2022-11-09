class Assignment {
  private String name;
  private double timeAlloted;

  public Assignment(String name, double timeAlloted) {
    this.name = name;
    this.timeAlloted = timeAlloted;
  }

  public String getName() {
    return name;
  }

  public double getTimeAlloted() {
    return timeAlloted;
  }
}