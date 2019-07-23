public class Bear {
    private String name;
    private int age;
    private double weight;
    private char initial;

    public Bear(String name, int age, double weight, char initial){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getName(){
        return this.name;

    }
    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate(){
        if(this.weight >= 80.00){
            return true;

        }else{
            return false;
        }
    }
}
