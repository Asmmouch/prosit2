public class Zoo {

    Animal[] animals;
    String name,city;
    int nbrCages;
    int i;
    public Zoo(String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        animals= new Animal[nbrCages];
    }

    void displayZoo()
    {
        System.out.println("le nom est "+ name);
        System.out.println("city is "+ city);
        System.out.println("nombre de cage est"+ nbrCages);
    }
    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages du zoo : " + nbrCages;
    }
    boolean addAnimal(Animal animal)
    {
        if (i<nbrCages)
        {
            animals[i]=animal;
            return true;
        }
        else
        { return false;}
    }
    void afficher()
    {
        for (i=0;i<nbrCages;i++)
        {
            System.out.println("la case num     "+i+"    est               "+animals[i]+"\n");
        }
    }
    int rechercher(Animal animal)
    {
        for (i=0;i<nbrCages ;i++)
        {
            if (animal.name== animals[i].name)
            {
                System.out.println(i);
            }
        }
        return i;
    }

}
