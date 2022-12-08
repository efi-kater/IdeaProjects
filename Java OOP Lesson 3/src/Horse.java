public class Horse {
    private String name;
    private int age;
    public Horse(String horseName, int horseAge){
        name=horseName;
        age=horseAge;
    }
    public Horse(int horseAge){
        age=horseAge;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
