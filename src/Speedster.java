public class Speedster {
    private String fullName;
    private String teamName;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
            race();
        } else {
            System.out.println("0 dan yuxari olmalidir");
            this.maxSpeed = maxSpeed;
        }
    }

    private void race() {
        System.out.println(fullName + " " + teamName +" komandasi ile " +  maxSpeed + "km/saat " + " suretle yarisir");
    }

    public Speedster(String fullName, String teamName) {
        this.fullName = fullName;
        this.teamName = teamName;
    }


}
