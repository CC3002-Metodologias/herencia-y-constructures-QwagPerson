public class Estudiante extends Persona {
    public Estudiante(String Nombre, String Ocupacion, int Edad){
        super(Nombre, Ocupacion,Edad);
    }

    public void comer() {
        System.out.println("Completo gorbea");
    }


    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public void verNetflixOAnime(){System.out.println("La casa de papel juas juas juas");}

    public void cuarentena(){super.cuarentena();}


}
