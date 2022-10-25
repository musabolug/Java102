package ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void checkAge(int age) throws AgeCheckException{
        if (age< 18){
        throw new AgeCheckException("Your age doesn't suit");
        }
        System.out.println("You can get out");
    }
    public static void main(String[] args) throws Exception{
        //Eger try catch kullanmak istemiyorsan burada da throws Exception yazmalısın
        Scanner scn= new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = scn.nextInt();

        try{
            checkAge(age);
        }catch(AgeCheckException e){
        System.out.println(e.toString());

        }

    }
}
