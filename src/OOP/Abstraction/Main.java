package OOP.Abstraction;


import OOP.Abstraction.Employee;
import OOP.Abstraction.Academist;
import OOP.Abstraction.Teacher;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Musab Olug","05537043625","musabolug@gmail.com" );

    //    Academist a1 = new Academist("Ilber Ortayli","05125550205","ilberhoca@gmail.com");
           Teacher t1 = new Teacher("Oktay Sinanoglu" , "05537043625", "sinanoglu@gmail.com","A2");
      //  e1.enterance("10:00"); // THİS İS AN EXAMPLE FOR OVERLOADING

      //  a1.enterance(); // OVERRİDE EXAMPLE

        // Polymorphism Example
     //  Employee employee = new Academist("Celal Sengor","05125550205","ilberhoca@gmail.com");
      //  employee.enterance();
      //  Employee[] loginUser = {e1,a1,employee};
     //   Employee.loginUsers(loginUser);
        t1.enterClass("10:00");

    }


}

