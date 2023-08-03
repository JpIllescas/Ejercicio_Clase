public class persona {
    public int id;
    public String nombre;
    public String Apellidos;
    public int Edad;
    public String grado;
     /*Constructor sin parametros */
     public persona(){
        this.id=0;
        this.nombre="";
        this.Apellidos="";
        this.Edad=0;
        this.grado="";
    }
    /*Constructor con parametros */
    public persona(int ID,String name,String last_name, int age,String Grado){
        this.id=ID;
        this.nombre=name;
        this.Apellidos=last_name;
        this.Edad=age;
        this.grado=Grado;
    }

    public int getId() {
        return id;
    }
    public String getGrado(){
        return grado;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }
    public void setGrado(String Grado){
        this.grado=Grado;
    }
    
}
