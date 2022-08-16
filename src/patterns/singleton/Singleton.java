package patterns.singleton;

public class Singleton {
    private static Singleton instance;
    private static int id;
    private Singleton(int id) {
        System.out.println("Ya fue creada la primera instancia!");
        this.id=id+1;
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton(id);
            System.out.println("El id:"+id);
        }
        System.out.println("El id es:"+(++id));
        return instance;

    }

}
