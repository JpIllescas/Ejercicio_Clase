public class Alumno extends persona{

    public int carnet;
    public String carrera;
    public String Semestre;
    /*Constructor sin parametros */
    public Alumno(){
        super();
        this.carnet=0;
        this.carrera="";
        this.Semestre="";
    }
    /*Constructor con parametros */
    public Alumno(int ID,String name,String last_name,int age,String Grado,int carne,String Carrera,String semestre){
        super(ID,name,last_name,age,Grado);
        this.carnet=carne;
        this.carrera=Carrera;
        this.Semestre=semestre;
    }
    /*Metodos Get */
    public int getCarnet() {
        return carnet;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getSemestre(){
        return Semestre;
    }
    /*Metodos Set */
    public void setCarnet(int Carnet){
        this.carnet=Carnet;
    }
    public void setCarrera(String Carrera){
        this.carrera=Carrera;
    }
    public void setSemestre(String semestre){
        this.Semestre=semestre;
    }

    public void estudiando(){
        System.out.println("El alumno "+this.nombre+this.Apellidos+" Se encuentra actualmente estudiando");
    }
}