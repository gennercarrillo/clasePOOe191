// Clase base Personaje con método atacar
abstract class Personaje {
    protected String nombre;
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    // Método polimórfico: cada personaje ataca diferente
    public abstract void atacar();
}

// Guerrero con ataque cuerpo a cuerpo
class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con espada usando fuerza bruta!");
    }
}

// Mago con ataque mágico
class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }
    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un poderoso hechizo de fuego!");
    }
}

// Arquero que ataca a distancia
class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre);
    }
    @Override
    public void atacar() {
        System.out.println(nombre + " dispara flechas precisas desde lejos!");
    }
}

// Clase principal para probar polimorfismo
public class Juego {
    public static void main(String[] args) {
        // Array de personajes polimórficos
        Personaje[] equipo = {
            new Guerrero("Thor"),
            new Mago("Merlín"),
            new Arquero("Legolas")
        };
        // Todos atacan usando la misma llamada de método
        for (Personaje p : equipo) {
            p.atacar();
        }
    }
}
