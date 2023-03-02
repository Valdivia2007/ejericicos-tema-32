public class Main {
    public static void main(String[] args) {

        var valor = suma(10, 30, 10);

        System.out.println(valor);
    }

    public static int suma( int a, int b, int c) {
        return (a + b + c);
    }

    }

public class Main {
    public void main(String[] args) {
       Auto MiAuto = new Auto();
       MiAuto.ponerpuerta();
       MiAuto.ponerpuerta();
       
       System.ou.println(MiAuto.puertas);

    }


    class Auto {

        public int puertas = 4;
        public void ponerpuerta(){
            this.puertas--;
        }
    }

    }
