public abstract class Animal {


    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    private String tipo;
    private String nombre;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public void nacer(){
            System.out.println("todos nacen");


        }


  public abstract void comer();
  public abstract  void  respirar();

}


