public class test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.animal);
        System.out.println(tiger.tiger);
        Animal animal = tiger;
        System.out.println(animal.animal);
        // System.out.println(animal.tiger);
        Tiger tiger2 = (Tiger)animal;
        System.out.println(tiger2.animal);
        System.out.println(tiger2.tiger);
    }
}

class Animal {
    public String animal = "animal";
}

class Tiger extends Animal {
    public String tiger = "tiger";

}
