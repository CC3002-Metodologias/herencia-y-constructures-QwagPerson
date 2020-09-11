public class Main {

    public static void main(String[] args) {

        Persona EjemploPersona = new Persona("Luis Perez","Carpintero",26);
        System.out.println("Persona Luis Perez");
        EjemploPersona.cuarentena();
        EjemploPersona.comer();
        EjemploPersona.dormir();
        System.out.println("Estudiante Gustavo Santelices");
        Estudiante EjemploEstudiante = new Estudiante("Gustavo Santelices","Estudiante",19);
        EjemploEstudiante.comer();
        EjemploEstudiante.cuarentena();
        EjemploEstudiante.verNetflixOAnime();
        EjemploEstudiante.dormir();
        Academico EjemploAcademico = new Academico("Profesor girafales","Tacitas de te",54,"Sobredosis de cafe");
        System.out.println("Academico prof. Girafales");
        EjemploAcademico.aprenderAUsarZoom();
        EjemploAcademico.comer();
        EjemploAcademico.cuarentena();
        EjemploAcademico.dormir();
        System.out.println("Exito");


    }
}
