public class Persona {
    protected String Nombre;
    protected String Ocupacion;
    protected int Edad;

    public Persona(){
    }

    public Persona(String Nombre, String Ocupacion, int Edad){
        this.Nombre = Nombre;
        this.Ocupacion = Ocupacion;
        this.Edad = Edad;
    }

    public void cuarentena(){System.out.println("Nos cuidamos entre todos");}

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "";
    }
}
