package ExceptionHandling;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message){
        super(message);
        System.out.println("Yas hatasi alindi");
    }
    @Override
    public  String toString(){
        return "Bu ageCheck sinifina ait bir Exception";
    }


}
