public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;


    public Dog(String dogType, String dogName, String dogColor, int dogAge){
        super();
        // initialize variables to class instance variables
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    // Accessor Methods
    public String getDogType(){
        return dogType;
    }
    // Mutator Methods - allow outside classes to change the state/variable
    public void setDogType(String dogType){
        this.dogType = dogType;
    }
    public String getDogName(){
        return dogName;
    }
    public void setDogName(String dogName){
        this.dogName = dogName;
    }
    public String getDogColor(){
        return dogColor;
    }
    public void setDogColor(String dogColor){
        this.dogColor = dogColor;
    }
    public int getDogAge(){
       return dogAge;
    }
    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }


    @Override
    public String toString(){
        return "Dog type:" + dogType + " Dog name:" + dogName + "Dog Color:" + dogColor + "Dog Age:" + dogAge;
    }


}
