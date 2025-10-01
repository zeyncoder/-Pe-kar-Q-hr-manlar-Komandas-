//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 🚀 Innovators =====");

        Innovator innovator = new Innovator("Zeynal", "Library");
      innovator.innovate();
     innovator.setYearsExperience(5);
     System.out.println("➡️ " + innovator.getYearsExperience() + " il təcrübəsi var.");


    Innovator innovator2 = new Innovator("Aysel", "NewSale");
    innovator2.setYearsExperience(7);
    innovator2.innovate();
    System.out.println("➡️ " + innovator2.getYearsExperience() + "il tecrubesi var");

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
