import java.util.Scanner;
import entor.veredicto;
public class entor{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println("NUMERO DE HORAS: ");
        String valor1=(sc.nextLine());
        System.out.println("NUMERO DE MODULOS: ");
        String valor2=(sc.nextLine());
        veredicto veredicto= new veredicto();
        veredicto.v(valor1,valor2);

    }
}
