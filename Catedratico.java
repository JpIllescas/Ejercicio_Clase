public class Catedratico extends persona{
    public int anos_exp;    
    /*Constructor sin parametros */
    public Catedratico(){
        super();
        this.anos_exp=0;
    }

    /*Constructor con parametros */
    public Catedratico(int ID,String name,String last_name,int age,String Grado,int años_exp){
        super(ID,name,last_name,age,Grado);
        this.anos_exp=años_exp;
    }
    /*Metodos Get */
    public int getAñosXp(){
        return anos_exp;
    }
    /*Metodos Set */
    public void setAñosXp(int años_exp){
        this.anos_exp=años_exp;
    }
    public void enseñar(){
        System.out.println("El Catedratico: "+this.nombre+" actualmente se encuentra enseñando y cuenta con "+this.anos_exp+" de experiencia");
    }
}