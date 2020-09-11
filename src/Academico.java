public class Academico extends Persona {
    private String PaperAsociado;

    public Academico(String Nombre, String Ocupacion, int Edad, String PaperAsociado){
        super(Nombre, Ocupacion,Edad);
        this.PaperAsociado = PaperAsociado;
    }
    public void comer() {
        super.comer();
    }

    public void aprenderAUsarZoom(){System.out.println("Uy se me olvido mutearme ;( como comparto pantalla??");}

    public void dormir() {
        System.out.println("ZzzZzZZ");
    }

    public void cuarentena(){super.cuarentena();}
}
