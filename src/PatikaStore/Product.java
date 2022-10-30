package PatikaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Product {
    static Scanner input = new Scanner(System.in).useLocale(Locale.US);

    private int id;
    private static int idNotebook =0;
    private static int idTelephone = 0;

   private double price;
    private double discountRate;
    private int stock;

    private String model;
    private String nameBrand;
    private String name;
    private Brand brand;

    private int storage;
    private double screenSize;
    private double camera;
    private int battery;
    private int Ram;
    private String color;

    private static HashMap<String, ArrayList<Product>> products = new HashMap<>(){
        {
            put("Notebook", new ArrayList<Product>());
            put("Telephone",new ArrayList<Product>());
        }
    };

    public Product(int id, double price,double discountRate,int stock,String model,String nameBrand,int storage,double screenSize,int Ram){
    // Notebook
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock=stock;
        this.model= model;
        this.name=name;
        this.nameBrand=nameBrand;
        this.brand=new Brand(nameBrand);
        this.storage=storage;
        this.screenSize=screenSize;
        this.Ram=Ram;
    }
    public Product(int id, double unitPrice, double discountRate, int stock, String model, String nameBrand, int storage, double screenSize, int camera,int battery, int RAM, String color){
      //telephone
        this.id = id;
        this.price = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.model = model;
        this.nameBrand = nameBrand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
        this.Ram = RAM;
        this.color = color;
    }

    public static void proccesMenu(int selection){
        if (selection== 1){
            System.out.println();
            System.out.println("NoteBook");
        }else if(selection == 2){
            System.out.println();
            System.out.println("Telephone");
        }
        System.out.println("===============");
        System.out.println("1 - List items");
        System.out.println("2 - Add items");
        System.out.println("3 - Delete items");
        System.out.println("4 - Filter items");
        System.out.print("Your Choice: ");
        int choice = input.nextInt();
        System.out.println();

        switch (choice){
            case 1:
                listItems(selection);
                break;
            case 2:
                addItems(selection);
                break;
            case 3:
                deleteItems(selection);
                break;
            case 4:
                filterItems(selection);
                break;
            default:
                System.out.println();
                System.out.println("There is such an option. Please enter your choice again");
                proccesMenu(selection);
        }


    }

    public static  void listItems(int selection){
        if (selection%2!=0){
            //notebook
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | RAM        |");
            System.out.println("----------------------------------------------------------------------------------------------------------");
            ArrayList<Product> productList = products.get("Notebook");

            if(!productList.isEmpty()){
                for (Product product : productList){
                    String productName = product.getNameBrand()+" "+ product.getModel();
                    product.setName(productName);

                    System.out.printf("| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-12s | %-10s |\n",
                            product.getId(),product.getName(),product.getPrice(),product.getNameBrand(),
                            product.getStorage(),product.getScreenSize(), product.getRam());
                }
                System.out.println("----------------------------------------------------------------------------------------------------------");
            }
            System.out.println();
        }
        else {
            //Telephone
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            ArrayList<Product> productList = products.get("telephone");
            if (!productList.isEmpty()){
                for (Product product: productList){
                    String productName = product.getNameBrand()+" "+ product.getModel();
                    product.setName(productName);

                    System.out.printf("| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s | %-10s |\n",
                            product.getId(),product.getName(),product.getPrice(),product.getNameBrand(),
                            product.getStorage(),product.getScreenSize(),product.getCamera(),product.getBattery(),
                            product.getRam(),product.getColor());

                }
                System.out.println("----------------------------------------------------------------------------------------------------------");

            }
            System.out.println();
        }
    }

    public static  void addItems(int selection){
        System.out.print("Price :" );
        double priceInput = input.nextDouble();
        System.out.print("Discount rate :");
        double discountRateInput = input.nextDouble();
        System.out.print("Stock :");
        int stockInput = input.nextInt();
        System.out.print("Brand :");
        String nameBrandInput = input.next();
        input.nextLine();
        System.out.print("Model :");
        String modelInput = input.nextLine();
        System.out.print("Storage :");
        int storageInput =input.nextInt();
        System.out.print("Screen size :");
        double screenSizeInput = input.nextDouble();
        System.out.print("Ram :");
        int RamInput = input.nextInt();

        if (selection%2 != 0){
            // Notebook
            idNotebook +=1;
            int id = idNotebook;

            Product newNotebook = new Product(idNotebook,priceInput, discountRateInput, stockInput, modelInput, nameBrandInput, storageInput, screenSizeInput, RamInput);
            products.get("Notebook").add(newNotebook);
        }
        else {
            //Telephone
            idTelephone +=1;
            int id = idTelephone;
            System.out.print("Camera :");
            int cameraInput =input.nextInt();
            System.out.print("Battery :");
            int batteryInput = input.nextInt();
            input.nextLine();
            System.out.print("Color :");
            String colorInput = input.nextLine();

            Product newTelephone = new Product(idTelephone, priceInput, discountRateInput, stockInput, modelInput, nameBrandInput, storageInput, screenSizeInput, cameraInput, batteryInput, RamInput, colorInput);
            products.get("Telephone").add(newTelephone);
        }

    }

    public static void deleteItems(int selection){
        System.out.print("Enter an ID to delete :");
        int idProduct = input.nextInt();
        boolean notExist= true;
        if (selection %2 != 0){
            for (Product product : products.get("Notebook")){
                if (product.getId() == idProduct){
                    products.get("Notebook").remove(product);
                    notExist=false;
                    System.out.println("The product with ID "+idProduct+" is removed from the system !");
                    break;
                }
            }
        }else {
            for (Product product : products.get("Telephone")){
                if (product.getId() == idProduct){
                    products.get("Telephone").remove(product);
                    notExist=false;
                    System.out.println("The product with ID "+idProduct+" is removed from the sysmem!  ");
                    break;
                }
            }
        }
        if (notExist){
            System.out.println("The value ID is not found in the system. Plaese check your ID and try again...");
        }
    }

    public static void filterItems(int selection){
        System.out.print("Enter an ID to filter products or '0' if you don't want to enter an ID:");
        int idProduct = input.nextInt();
        boolean idExist = idProduct !=0;

        System.out.println("Enter the brand to filter products or 'none' if you don't want to enter a brand :");
        String brandProduct = input.next();
        boolean brandExist = !brandProduct.equals("none");

        ArrayList<Product> filteredProducts = new ArrayList<>();

        if (selection%2 != 0){
            if (idExist && brandExist){
                for (Product product: products.get("Notebook")){
                    if (brandProduct.equals(product.getNameBrand())&& product.getId()==idProduct){
                       filteredProducts.add(product);
                       listFilteredItems(selection,filteredProducts);
                       break;
                    }else{
                        System.out.println("The value ID or brand is not found in the system. Please check your ID or Brand. Then Try again...");
                        filterItems(selection);
                    }
                }
            }else {
                if (brandExist){
                    for (Product product: products.get("Notebook")){
                        if (brandProduct.equals(product.getNameBrand()) ){
                            filteredProducts.add(product);
                        }
                    }
                    listFilteredItems(selection, filteredProducts);
                }else{
                    System.out.println("The brand is not found in the system. Please check your brand. Then Try again...\nATTENTION: **You must enter ID with a brand together.**");
                    filterItems(selection);
                }
            }
        }
        else{
            if (idExist&& brandExist){
                for (Product product: products.get("Telephone")){
                    if (brandProduct.equals(product.getNameBrand()) && product.getId()== idProduct){
                        filteredProducts.add(product);
                        listFilteredItems(selection, filteredProducts);
                        break;
                    }else{
                        System.out.println("The value ID or brand is not found in the system. Please check your ID or brand. Then Try again...");
                        filterItems(selection);
                    }
                }
            }else {
                if (brandExist){
                    for (Product product: products.get("Telephone")){
                        if (brandProduct.equals(product.getNameBrand())){
                            filteredProducts.add(product);
                        }
                    }
                    listFilteredItems(selection, filteredProducts);
                }else {
                    System.out.println("The brand is not found in the system. Please check your brand. Then Try again...\nATTENTION: **You must enter ID with a brand together.**");
                    filterItems(selection);
                }
            }
        }
    }
    public static void listFilteredItems(int selection,ArrayList<Product> filteredProductList){
        if (selection%2 != 0){
            //Notebook
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Product Name                   | Price           | Brand      | Storage    | Screen Size  | RAM        |");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            if(filteredProductList.isEmpty()){
                for (Product product : filteredProductList){
                    System.out.printf("| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-12s | %-10s |\n",
                            product.getId(),product.getName(),product.getPrice(),product.getNameBrand(),product.getStorage(),
                            product.getScreenSize(),product.getRam());
                }
                System.out.println("---------------------------------------------------------------------------------------------------------------");
            }
            System.out.println();
        }
        else {
            // Telephone
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            if (filteredProductList.isEmpty()){
                for (Product product : filteredProductList){
                    System.out.printf("| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s | %-10s |\n",
                            product.getId(),product.getName(),product.getPrice(),product.getNameBrand(),
                            product.getStorage(),product.getScreenSize(),product.getCamera(),product.getBattery(),
                            product.getRam(),product.getColor());
                }
                System.out.println("---------------------------------------------------------------------------------------------------------------");

            }
            System.out.println();
        }
    }
    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Product.input = input;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdNotebook() {
        return idNotebook;
    }

    public static void setIdNotebook(int idNotebook) {
        Product.idNotebook = idNotebook;
    }

    public static int getIdTelephone() {
        return idTelephone;
    }

    public static void setIdTelephone(int idTelephone) {
        Product.idTelephone = idTelephone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static HashMap<String, ArrayList<Product>> getProducts() {
        return products;
    }

    public static void setProducts(HashMap<String, ArrayList<Product>> products) {
        Product.products = products;
    }
}
