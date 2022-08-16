package stringvsstringbuilder;

public class ComparationExample{

    public void concatenigInmutable(){

        String s = "Like";
        s.concat(" and suscribe");

        System.out.println(s);
    }

    public void concatenigMutable(){

        StringBuilder stringBuilder= new StringBuilder("Like");
        stringBuilder.append(" and Suscribe");

        System.out.println(stringBuilder);
    }
     public String reverse (String text){
         return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {

      ComparationExample comparationExample= new ComparationExample();
        System.out.println(comparationExample.reverse("casa"));

        comparationExample.concatenigInmutable();
        comparationExample.concatenigMutable();


    }
}
