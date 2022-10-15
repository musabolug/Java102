package OOP.MethodOverriding;

import OOP.Inheritance.Assistant;
import OOP.Inheritance.Officer;
import OOP.Inheritance.SecurityGuard;
import OOP.Inheritance.Teacher;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Musab Olug","05537043625","musabolug@gmail.com" );

        Academist a1 = new Academist("Ilber Ortayli","05125550205","ilberhoca@gmail.com");

        Officer o1 = new Officer("Bera Olug" ,"1002003040","musabberaaam@gmail.com","Science","10:00-18:00");

        Teacher t1 = new Teacher("Oktay Sinanoglu","05554441200","oktaysinanoglu@gmail.com","A1");

        Assistant assistant1 = new Assistant("Muaz Olug","05052150205","muazolug@gnail.com","10:0-18:00");
        SecurityGuard guard = new SecurityGuard("Binbasi Ozcelik","05446663322","ozcelik@gmail.com","Security","19:00- 07:00","Guard");

      //  e1.enterance("10:00"); // THİS İS AN EXAMPLE FOR OVERLOADING

        a1.enterance(); // OVERRİDE EXAMPLE


    }


}

