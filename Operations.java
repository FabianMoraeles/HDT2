public class Operations implements Icalculadora{

    //Métodos simples. Ocupan el POP del STACK para obtener 2 valores y operarlos según el operando seleccionado.
    
    public double sumar(double valor, double valor2) {
        return (valor + valor2);
    }

    public double restar(double valor, double valor2) {
        return (valor - valor2);
    }

    public double multiplicar(double valor, double valor2) {
        return (valor * valor2);
    }

    public double dividir(double valor, double valor2) {
        return (valor / valor2);
    }
    

}
