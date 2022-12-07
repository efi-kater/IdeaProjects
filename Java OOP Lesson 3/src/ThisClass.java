public class ThisClass {
    String name = "John";
    public void printName(){
        String name = "George";
        System.out.println("local " + name);
        System.out.println("Global " + this.name);
    }
}
