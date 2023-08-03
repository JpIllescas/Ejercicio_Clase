public class EmpAdmin extends persona{
    public String puesto;
    /*Constructor sin parametros */
    public EmpAdmin(){
        super();
        this.puesto="";
    };
    /*Constructor con parametros */
    public EmpAdmin(int ID,String name,String last_name, int age,String Grado,String Puesto){
        super(ID,name,last_name	,age,Grado);
        this.puesto=Puesto;
    };
    /*Metodos Get */
    public String getPuesto(){
        return puesto;
    }
    /*Metodos Set */
    public void SetPuesto(String Puesto){
        this.puesto=Puesto;
    };
    public void trabajar(){
        System.out.println("El empleado: "+this.nombre);
    };

}
