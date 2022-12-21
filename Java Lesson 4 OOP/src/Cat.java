class Cat extends Animal {
    public void animalSound() {
        System.out.println(name+ " the cat says: meeaooo");
    }
    private String name="Mitzi";
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

}
