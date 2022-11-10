package Enum;

public enum EnumDay {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    private EnumDay(int day) {
        this.day = day;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public  String getDayName (){
        String day = switch (this){
            case PAZARTESI -> "Pazartesi";
            case SALI -> "Sali";
            case CARSAMBA -> "Carsamba";
            case PERSEMBE-> "Persembe";
            case CUMA -> "Cuma";
            case CUMARTESI -> "Cumartesi";
            case PAZAR -> "Pazar";
            default -> null;
        };
        System.out.println(day);
        return day;
    }
}