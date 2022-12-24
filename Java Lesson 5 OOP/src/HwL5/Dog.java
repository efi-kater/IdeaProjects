package HwL5;

public class Dog {
    private String dogType = "foo";
    private String dogName = "dog";
    private int dogAge = 10;
    public Dog(String dogType, String dogName, int dogAge){
        this.dogType=dogType;
        this.dogName=dogName;
        this.dogAge=dogAge;
    }

    public int getDogAge() {
        return dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }
}
