class Tournament {
  Performance row = new Performance();

  public Tournament() {
    row.setName("Liverpool");
    row.setScore("15");
  }
  public void displayScore() {
    String name = row.getName();
    int score = row.getScore();
    // ...
  }
}

class Performance {
  private String name;
  private int score;

  public String getName() {
    return name;
  }
  public void setName(String arg) {
    name = arg;
  }
  public int getScore() {
    return score;
  }
  public void setScore(String arg) {
    score = Integer.parseInt(arg);
  }
}

class de{
  public static void main(String[] arg){
    Tournament tour = new Tournament();
    tour.displayScore();
  }
}