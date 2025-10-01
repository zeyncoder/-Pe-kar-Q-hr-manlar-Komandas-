public class Healer {
    private String fullName;
    private String speciality;
    private int patientTreated;

    public Healer(String fullName, String speciality) {
        this.fullName = fullName;
        this.speciality = speciality;
    }

    public int getPatientTreated() {
        return patientTreated;
    }

    public void setPatientTreated(int patientTreated) {
        if (patientTreated >= 0) {
            this.patientTreated = patientTreated;
            treat();
        } else {
            System.out.println("Mualice olunan xeste sayi menfi ola bilmez");
        }
    }

    private void treat() {
        System.out.println("Dr " + fullName + "  " + speciality  +  " " + "uzre " + " " + patientTreated + " xesteni mualice edir");
    }
}
