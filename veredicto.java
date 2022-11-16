package entor;

public class veredicto{
    public void v(String valor1, String valor2){
        if (valor1.equals(valor2)){
            System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        }
        else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.");
        }
        else {System.out.println("Ideal. Trabajas los contenidos en casa.");
        }
    }
}