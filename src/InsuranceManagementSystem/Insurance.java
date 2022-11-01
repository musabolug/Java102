package InsuranceManagementSystem;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    // sigortanın baslangıç bitiş tarihi

    abstract calculate(){
        //Bu soyut fonksiyon aşağıda kalıtım alınan sınıflarda doldurulacaktır.
    }
    //"HealthInsurance" (özel sağlık sigortasu),
    //
    //
    //"ResidenceInsurance" (konut sigortası),
    //
    //
    //"TravelInsurance" (seyahat sigortası),
    //
    //
    //"CarInsurance" (otomobil sigortası)
}
