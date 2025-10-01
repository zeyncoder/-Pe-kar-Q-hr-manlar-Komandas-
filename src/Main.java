//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 🚀 Innovators =====");

        Innovator innavotar = new Innovator("Zeynal", "Library");
      innavotar.innovate();
     innavotar.setYearsExperience(5);
     System.out.println("➡️ " + innavotar.getYearsExperience() + " il təcrübəsi var.");


    Innovator innavator2 = new Innovator("Aysel", "NewSale");
    innavator2.setYearsExperience(7);
    innavator2.innovate();
    System.out.println("➡️ " + innavator2.getYearsExperience() + "il tecrubesi var");

        System.out.println("===== 🏥 Healers =====");
     Healer aydan = new Healer("Aydan", "Cardiology");
     Healer nigar = new Healer("Nigar", "Neurologist");
     nigar.setPatientTreated(4);
   aydan.setPatientTreated(1);

        System.out.println("===== 🏎️ Speedsters =====");
        Speedster speedster = new Speedster("Qurban", "RedBull");
        Speedster speedster2 = new Speedster("Elnur", "Mercedes");
        speedster.setMaxSpeed(300);
        speedster2.setMaxSpeed(360);



    }
}