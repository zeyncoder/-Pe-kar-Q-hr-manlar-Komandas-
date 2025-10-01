public class Innovator {
 private String fullName;
 private String currentExperience;
    private int yearsExperience;

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        if (yearsExperience > 0) {
            this.yearsExperience = yearsExperience;
        } else {
            System.out.println("Tecrube ili 0 dan boyuk olmalidir");
        }
    }

    public Innovator(String fullName, String currentExperience) {
        this.fullName = fullName;
        this.currentExperience = currentExperience;
    }



public void innovate() {
    System.out.println( fullName+ " " + currentExperience + " " + "üzərində yenilik edir! 🛠️");

}

}
