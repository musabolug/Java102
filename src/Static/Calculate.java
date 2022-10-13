package Static;

public class Calculate {
    public static  void calcAverage(Course[] notes){
        double total = 0;
        for (Course c : notes ){
            total += c.note;
        }
        double average = total / notes.length;
        System.out.println("Your average : " +average);

    }
}
