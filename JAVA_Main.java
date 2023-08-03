public class main{
    public static void main(String[] args){
        
        Alumno persona= new Alumno();
        persona.id=100;
        persona.nombre="José";
        persona.Apellidos="Illescas";
        persona.Edad=19;
        persona.Semestre="Sexto";
        persona.carrera="Ingenieria en Sistemas";
        persona.estudiando();
        persona.getApellidos();

        /*Catedratico */
        Catedratico persona1=new Catedratico();
        persona1.id=101;
        persona1.nombre="Luis";
        persona1.Apellidos="Suarez";
        persona1.Edad=37;
        persona1.anos_exp=7;
        persona1.enseñar();
        
    };
}