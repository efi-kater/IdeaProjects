public class Child extends Parent {
    private int a = 200;

    // prints a variable directly from base class
    private void getAFromBase() {
        System.out.println(super.a);
    }

    private void getAFromChild() {
        System.out.println(a);
    }

    // call method directly from parent
    private void callShow() {
        show(); // no need for super
    }
    public Child (int s){
        super(s);
    }
    @Override
    protected void show(){
        System.out.println("child");
    }
}
