package Static;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Math","MAT-101",70);
        Course physics = new Course("Physics","PHY-101",100);
        Course poetry = new Course("Poetry","PTY-101",90);

        Course[] courses = {mat,physics,poetry};

        Calculate.calcAverage(courses);
    }
}
