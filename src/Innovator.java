public class Innovator {
 private String fullName;
 private String currentProject;
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

    public Innovator(String fullName, String currentProject) {
        this.fullName = fullName;
        this.currentProject = currentProject;
    }



public void innovate() {
    System.out.println( fullName+ " " + currentProject + " " + "üzərində yenilik edir! 🛠️");

}

}
