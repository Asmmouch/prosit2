public class Animal {

    String family,name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal)
    {
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
        this.family=family;
    }
    @Override
    public String toString() {
        return "nom" + name+ "\nfamille : " + family + "\n age : " + age+ "\n isMammal ? : " + isMammal ;
    }
}
