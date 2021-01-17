package tpju.course;

public class Moto extends Vehicule{


    // variables d'instance -
    private String brand;
    private String model;
    private Rider  myRider;

    /**
     * Constructeur d'objets de classe Moto
     */
    public Moto()
    { 
        // initialisation des variables d'instance
        this.brand = "";
        this.model = "";
    }

    // constructeur avec params
    public Moto(String b, String m)
    {
        // initialisation des variables d'instance
        this.brand = b;
        this.model = m;
    }

    //getteur branch
    public String getBrand(){
        return this.brand;
    }

    //setteur brand
    public void setBrand(String b){
        this.brand = b;
    }

    // getteur model
    public String getModel(){
        return this.model;
    }

    //setteur model
    public void setModel(String m){
        this.model = m;
    }

    // getteur rider
    public Rider getMyRider(){
        return this.myRider;
    }

    //setteur rider
    public void setMyRider(Rider r){
        this.myRider = r;
    }

    /**
     * function returns object infos
     */
    public String toString()
    {
        return "Brand : " + this.brand + " , Model : " + this.model;
    }

    private final RefactoringMotoTest refactoringMotoTest = new RefactoringMotoTest(this);

    /**
     * function returns object infos
     */
    public String toString_w_rider()
    {
        return refactoringMotoTest.toString_w_rider();
    }
    public String getstr()
    {
        return "Brand : " + this.brand + " , Model : " + this.model;
    }

}
