public class Main {
    public static void main(String[] args) {
     perro p = new perro("mamifero","perro",5,"sam","criollo");
        System.out.println("metodos del padre");
       p.respirar();
        p.comer();
        p.nacer();
        System.out.println("metodo interfaz");
        p.vacunar();
    }
}
