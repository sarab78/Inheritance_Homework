public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        bear.setName("Baloo");
        String name = bear.getName();
        bear.bearsName = "";
        System.out.println(bear.bearsName);

    }
}
