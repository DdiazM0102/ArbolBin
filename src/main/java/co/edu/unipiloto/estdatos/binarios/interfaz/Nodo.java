package co.edu.unipiloto.estdatos.binarios.interfaz;

public class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    public void asignarIzquierdo(Nodo nodo) {
        this.izquierdo = nodo;
    }

    public void asignarDerecho(Nodo nodo) {
        this.derecho = nodo;
    }
}
