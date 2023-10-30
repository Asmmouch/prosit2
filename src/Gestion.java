public class Gestion {
    public static void main(String [] args)
    {
        Zoo hadika= new Zoo("hadika","ariana",1);
        Animal kattous= new Animal("chat","hamayrech",4,true);
        Animal tha3leb= new Animal("haywanet","thaaloub",4,false);
        Animal far= new Animal("jreba3","farfour",1,false);
        hadika.displayZoo();

        System.out.println(hadika);
        System.out.println(hadika.toString());
        System.out.println(kattous);
        System.out.println(kattous.toString());


        boolean addkattous= hadika.addAnimal(kattous);
        boolean addtha3leb= hadika.addAnimal(tha3leb);
        boolean addfar= hadika.addAnimal(far);
        if (addkattous)
        {
            System.out.println("ajouté");
        }else
        {
            System.out.println("non ajouté");
        }
        if (addtha3leb)
        {
            System.out.println("ajouté");
        }else
        {
            System.out.println("non ajouté");
        }
        if (addfar)
        {
            System.out.println("ajouté");
        }else
        {
            System.out.println("non ajouté");
        }
        hadika.afficher();
        System.out.println(hadika.rechercher(far));
    }

}
