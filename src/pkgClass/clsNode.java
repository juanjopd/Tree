package pkgClass;

/**
 *
 * @author Payan Duque
 */
public class clsNode {
    private int dato;
    private clsNode izq;
    private clsNode der;

    public clsNode() {
    }

    public clsNode(int dato, clsNode izq, clsNode der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public clsNode getIzq() {
        return izq;
    }

    public void setIzq(clsNode izq) {
        this.izq = izq;
    }

    public clsNode getDer() {
        return der;
    }

    public void setDer(clsNode der) {
        this.der = der;
    }
}
