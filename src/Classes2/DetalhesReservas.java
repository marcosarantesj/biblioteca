/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes2;

/**
 *
 * @author MARK
 */
public class DetalhesReservas {

    int codreserva;
    int codleitor;
    int codlivro;

    public int getCodleitor() {
        return codleitor;
    }

    public void setCodleitor(int codleitor) {
        this.codleitor = codleitor;
    }

    public int getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(int codlivro) {
        this.codlivro = codlivro;
    }

    public int getCodreserva() {
        return codreserva;
    }

    public void setCodreserva(int codreserva) {
        this.codreserva = codreserva;
    }

    public DetalhesReservas() {
    }

    public DetalhesReservas(int codreserva, int codleitor, int codlivro) {
        this.codreserva = codreserva;
        this.codleitor = codleitor;
        this.codlivro = codlivro;
    }

    
}
