package GenericClasses;

public class Nullable {

    private final String value;

    public Nullable(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }


    public  void run(){
        if (isNull()) {
            System.out.println("Bu degiskene deger atanmamistir(null)");
        }
        else {
            System.out.println(this.getValue());
        }
    }
}
