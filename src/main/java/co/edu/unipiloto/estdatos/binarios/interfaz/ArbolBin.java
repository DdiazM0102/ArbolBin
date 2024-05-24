package co.edu.unipiloto.estdatos.binarios.interfaz;

public class ArbolBin {

    Nodo raiz;

    public ArbolBin() {
        this.raiz = null;
    }

    public void reconstruirArbol(int[] valores) {
        if (valores == null || valores.length == 0) {
            return;
        }

        this.raiz = new Nodo(valores[0]);
        for (int i = 1; i < valores.length; i++) {
            insertar(this.raiz, valores[i]);
        }
    }

    private void insertar(Nodo nodo, int valor) {
        if (valor < nodo.valor) {
            if (nodo.izquierdo == null) {
                nodo.asignarIzquierdo(new Nodo(valor));
            } else {
                insertar(nodo.izquierdo, valor);
            }
        } else {
            if (nodo.derecho == null) {
                nodo.asignarDerecho(new Nodo(valor));
            } else {
                insertar(nodo.derecho, valor);
            }
        }
    }

    public void imprimirInOrden() {
        imprimirInOrden(raiz);
    }

    private void imprimirInOrden(Nodo nodo) {
        if (nodo != null) {
            imprimirInOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirInOrden(nodo.derecho);
        }
    }

    public void imprimirPreOrden() {
        imprimirPreOrden(raiz);
    }

    private void imprimirPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            imprimirPreOrden(nodo.izquierdo);
            imprimirPreOrden(nodo.derecho);
        }
    }

    public boolean contieneSubarbol(Nodo subraiz) {
        return contieneSubarbol(raiz, subraiz);
    }

    private boolean contieneSubarbol(Nodo nodo, Nodo subraiz) {
        if (nodo == null) {
            return false;
        }
        if (sonIguales(nodo, subraiz)) {
            return true;
        }
        return contieneSubarbol(nodo.izquierdo, subraiz) || contieneSubarbol(nodo.derecho, subraiz);
    }

    private boolean sonIguales(Nodo nodo1, Nodo nodo2) {
        if (nodo1 == null && nodo2 == null) {
            return true;
        }
        if (nodo1 == null || nodo2 == null) {
            return false;
        }
        return nodo1.valor == nodo2.valor && sonIguales(nodo1.izquierdo, nodo2.izquierdo) && sonIguales(nodo1.derecho, nodo2.derecho);
    }
}
